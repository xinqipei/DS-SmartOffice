package GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import GRPC.LightingServer;
import GRPC.RadiatorsServer;
import GRPC.ComputerControlSystemServer;
import Models.Lighting;
import Models.Radiators;
import Models.ComputerControlSystem;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import org.DS.xinqipeiproject.SmartOfficeGRPC.*;

import io.grpc.stub.StreamObserver;
import jmDNS.Registering;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import javax.swing.AbstractButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;
import java.awt.Color;


public class Main {
	
	private JFrame frame;
	private JTextField appliance_name_text;
	private JTextField appliance_onOff_text;
	private JTextField appliance_extra_op_text;
	private JTextField appliance_extra_op2_text;
	
	private static ComputerControlSystemServiceGrpc.ComputerControlSystemServiceBlockingStub computercontrolsystem_blockingStub;
	private static ComputerControlSystemServiceGrpc.ComputerControlSystemServiceStub computercontrolsystem_asyncStub;
	private static ComputerControlSystemServiceGrpc.ComputerControlSystemServiceFutureStub computercontrolsystem_futureStub;
	
	private static LightingServiceGrpc.LightingServiceBlockingStub lighting_blockingStub;
	private static LightingServiceGrpc.LightingServiceStub lighting_asyncStub;
	private static LightingServiceGrpc.LightingServiceFutureStub lighting_futureStub;
	
	private static RadiatorsServiceGrpc.RadiatorsServiceBlockingStub radiators_blockingStub;
	private static RadiatorsServiceGrpc.RadiatorsServiceStub radiators_asyncStub;
	private static RadiatorsServiceGrpc.RadiatorsServiceFutureStub radiators_futureStub;
	
	private static SecuritycameraServiceGrpc.SecuritycameraServiceBlockingStub securitycamera_blockingStub;
	private static SecuritycameraServiceGrpc.SecuritycameraServiceStub securitycamera_asyncStub;
	private static SecuritycameraServiceGrpc.SecuritycameraServiceFutureStub securitycamera_futureStub;
	
	private JTextField computercontrolsystemName_tf;
	private JTextField radiatorsName_tf;
	private JTextField camName_tf;
	private JTextField lightingName_tf;
	
	public JLabel computercontrolsystemInfo_name;
	public JLabel computercontrolsystemInfo_status;
	public JLabel computercontrolsystemInfo_intensity;
	public JLabel computercontrolsystemInfo_range;
	
	public JLabel lightingInfo_name;
	public JLabel lightingInfo_status;
	public JLabel lightingInfo_brightness;
	
	public JLabel camInfo_name;
	public JLabel camInfo_status;
	public JLabel camInfo_intensity;
	public JLabel camInfo_camera;
	
	public JLabel radiatorsInfo_name;
	public JLabel radiatorsInfo_status;
	public JLabel radiatorsInfo_temperature;
	public JLabel radiatorsInfo_speed;
	
	int radiatorsPort =8080;
	int computercontrolsystemPort =8081;
	int lightingPort =8082;
	int camPort =8083;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Main() throws InterruptedException, IOException {
		initialize();
		Registering r = new Registering();
		//Start Appliance Registry, GRPC servers and channels then unregister
		r.jmndsRegister(radiatorsPort, computercontrolsystemPort, lightingPort, camPort);
		startGRPCServers();
		channels();
		r.unRegister();
		loadInitialAppliances();
	}
	
	public void startGRPCServers() throws IOException, InterruptedException {
		ComputerControlSystemServer.startDiscovery();
		LightingServer.startDiscovery();
		RadiatorsServer.startDiscovery();

	}
	public void loadInitialAppliances() throws IOException, InterruptedException {
		initialRadiators();
		initialComputerControlSystem();
		initialLighting();
	}
	
	public void channels() {
		
		System.out.println("CHANNELS STARTING");
		ManagedChannel computercontrolsystemChannel = ManagedChannelBuilder.forAddress("localhost",computercontrolsystemPort).usePlaintext().build();
		ManagedChannel lightingChannel = ManagedChannelBuilder.forAddress("localhost", lightingPort).usePlaintext().build();
		ManagedChannel radiatorsChannel = ManagedChannelBuilder.forAddress("localhost", radiatorsPort).usePlaintext().build();
		ManagedChannel camChannel = ManagedChannelBuilder.forAddress("localhost", camPort).usePlaintext().build();

		computercontrolsystem_blockingStub = ComputerControlSystemServiceGrpc.newBlockingStub(computercontrolsystemChannel);
		computercontrolsystem_asyncStub = ComputerControlSystemServiceGrpc.newStub(computercontrolsystemChannel);
		computercontrolsystem_futureStub = ComputerControlSystemServiceGrpc.newFutureStub(computercontrolsystemChannel);
		
		lighting_blockingStub = LightingServiceGrpc.newBlockingStub(lightingChannel);
		lighting_asyncStub = LightingServiceGrpc.newStub(lightingChannel);
		lighting_futureStub = LightingServiceGrpc.newFutureStub(lightingChannel);
		
		radiators_blockingStub = RadiatorsServiceGrpc.newBlockingStub(radiatorsChannel);
		radiators_asyncStub = RadiatorsServiceGrpc.newStub(radiatorsChannel);
		radiators_futureStub = RadiatorsServiceGrpc.newFutureStub(radiatorsChannel);
		
		securitycamera_blockingStub = SecuritycameraServiceGrpc.newBlockingStub(camChannel);
		securitycamera_asyncStub = SecuritycameraServiceGrpc.newStub(camChannel);
		securitycamera_futureStub = SecuritycameraServiceGrpc.newFutureStub(camChannel);

	}
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GREEN);
		frame.setBounds(100, 100, 468, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		/*Heading Label*/
		JLabel headLabel = new JLabel("Smart Farming");
		headLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		headLabel.setBounds(101, 11, 245, 14);
		frame.getContentPane().add(headLabel);
		
		JLabel controller_lbl = new JLabel("Appliance Controls");
		controller_lbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		controller_lbl.setBounds(10, 64, 143, 14);
		frame.getContentPane().add(controller_lbl);
		
		JLabel appliance_name_lbl = new JLabel("Appliance Name");
		appliance_name_lbl.setBounds(56, 89, 83, 14);
		frame.getContentPane().add(appliance_name_lbl);
		
		JLabel intensity_lbl = new JLabel("Volume");
		intensity_lbl.setBounds(275, 90, 48, 14);
		frame.getContentPane().add(intensity_lbl);
		
		JLabel lblChannel = new JLabel("Range");
		lblChannel.setBounds(370, 90, 48, 14);
		frame.getContentPane().add(lblChannel);
		
		JLabel appliance_name2_lblabel = new JLabel("Appliance Name");
		appliance_name2_lblabel.setBounds(56, 135, 83, 14);
		frame.getContentPane().add(appliance_name2_lblabel);
		
		JLabel appliance_status2_lbl = new JLabel("Appliance Status");
		appliance_status2_lbl.setBounds(170, 135, 83, 14);
		frame.getContentPane().add(appliance_status2_lbl);
		
		JLabel temperature_lbl = new JLabel("Temperature");
		temperature_lbl.setBounds(270, 135, 48, 14);
		frame.getContentPane().add(temperature_lbl);
		
		JLabel speed_lbl = new JLabel("Speed");
		speed_lbl.setBounds(370, 135, 38, 14);
		frame.getContentPane().add(speed_lbl);
		
		JLabel appliance_name3_lbl = new JLabel("Appliance Name");
		appliance_name3_lbl.setBounds(56, 180, 83, 14);
		frame.getContentPane().add(appliance_name3_lbl);
		
		JLabel intensity_2_lbl = new JLabel("Volume");
		intensity_2_lbl.setBounds(270, 180, 48, 14);
		frame.getContentPane().add(intensity_2_lbl);
		
		JLabel lblCamera = new JLabel("Camera");
		lblCamera.setBounds(355, 180, 63, 14);
		frame.getContentPane().add(lblCamera);
		
		JLabel appliance_status3_lbl = new JLabel("Appliance Status");
		appliance_status3_lbl.setBounds(170, 180, 83, 14);
		frame.getContentPane().add(appliance_status3_lbl);
		
		JLabel appliance_name4_lbl = new JLabel("Appliance Name");
		appliance_name4_lbl.setBounds(56, 225, 83, 14);
		frame.getContentPane().add(appliance_name4_lbl);
		
		JLabel appliance_status4_lbl = new JLabel("Appliance Status");
		appliance_status4_lbl.setBounds(170, 225, 83, 14);
		frame.getContentPane().add(appliance_status4_lbl);
		
		JLabel lblBrigtness = new JLabel("Brightness");
		lblBrigtness.setBounds(254, 225, 72, 14);
		frame.getContentPane().add(lblBrigtness);
		
		//////////////////////
		//ComputerControlSystem Volume Buttons
		//////////////////////
		JButton computercontrolsystem_intensityUp_btn = new JButton("+");
		computercontrolsystem_intensityUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		computercontrolsystem_intensityUp_btn.setBounds(290, 104, 38, 20);
		frame.getContentPane().add(computercontrolsystem_intensityUp_btn);
		computercontrolsystem_intensityUp_btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			System.out.println(+1);
			changeVolume(1,"ComputerControlSystem");
		}
		});

		JButton computercontrolsystem_intensityDown_btn = new JButton("-");
		computercontrolsystem_intensityDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		computercontrolsystem_intensityDown_btn.setBounds(254, 104, 38, 20);
		frame.getContentPane().add(computercontrolsystem_intensityDown_btn);
		computercontrolsystem_intensityDown_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		    	System.out.println(-1);
		    	changeVolume(-1,"ComputerControlSystem");
			}
		});
		
		//////////////////////
		//Radiators Temperature Buttons
		//////////////////////
		JButton radiators_temperatureDown_btn = new JButton("-");
		radiators_temperatureDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		radiators_temperatureDown_btn.setBounds(254, 149, 38, 20);
		frame.getContentPane().add(radiators_temperatureDown_btn);
		radiators_temperatureDown_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		    	System.out.println(-1);
		    	changeTemperature(-1);
			}
		});
		
		JButton radiators_temperatureUp_btn = new JButton("+");
		radiators_temperatureUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		radiators_temperatureUp_btn.setBounds(290, 149, 38, 20);
		frame.getContentPane().add(radiators_temperatureUp_btn);
		radiators_temperatureUp_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(+1);
		    	changeTemperature(1);}
		});
		
		//////////////////////
		//Camera Volume Buttons
		//////////////////////
		JButton camera_intensityUp_btn = new JButton("+");
		camera_intensityUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		camera_intensityUp_btn.setBounds(290, 194, 38, 20);
		frame.getContentPane().add(camera_intensityUp_btn);
		camera_intensityUp_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(+1);
		    	changeVolume(1,"Securitycamera");
		    	}
			
		});
		
		JButton camera_intensityDown_btn = new JButton("-");
		camera_intensityDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		camera_intensityDown_btn.setBounds(254, 194, 38, 20);
		frame.getContentPane().add(camera_intensityDown_btn);
		camera_intensityDown_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(-1);
		    	changeVolume(-1,"Securitycamera");
		    	}
			
		});
		
		/////////////
		//Text Fields
		/////////////
		computercontrolsystemName_tf = new JTextField();
		computercontrolsystemName_tf.setBounds(56, 105, 86, 20);
		frame.getContentPane().add(computercontrolsystemName_tf);
		computercontrolsystemName_tf.setColumns(10);
		computercontrolsystemName_tf.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
					System.out.println("changedUpdate "+ computercontrolsystemName_tf.getText());
				  }
				  public void removeUpdate(DocumentEvent e) {
					  changeApplianceName(computercontrolsystemName_tf.getText(),"ComputerControlSystem");
				  }
				  public void insertUpdate(DocumentEvent e) {
					  System.out.println("insertUpdate "+ computercontrolsystemName_tf.getText());
					  changeApplianceName(computercontrolsystemName_tf.getText(),"ComputerControlSystem");

				  }

	
				});		
		
		radiatorsName_tf = new JTextField();
		radiatorsName_tf.setColumns(10);
		radiatorsName_tf.setBounds(56, 150, 86, 20);
		frame.getContentPane().add(radiatorsName_tf);
		radiatorsName_tf.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
					
				  }
				  public void removeUpdate(DocumentEvent e) {
					  changeApplianceName(radiatorsName_tf.getText(),"Radiators");
				  }
				  public void insertUpdate(DocumentEvent e) {
				
					  changeApplianceName(radiatorsName_tf.getText(),"Radiators");
				  }

	
				});	
		
		camName_tf = new JTextField();
		camName_tf.setColumns(10);
		camName_tf.setBounds(56, 194, 86, 20);
		frame.getContentPane().add(camName_tf);
		camName_tf.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
					
				  }
				  public void removeUpdate(DocumentEvent e) {
					  changeApplianceName(camName_tf.getText(),"Securitycamera");
				  }
				  public void insertUpdate(DocumentEvent e) {
					  System.out.println("insertUpdate "+camName_tf.getText());
					  changeApplianceName(camName_tf.getText(),"Securitycamera");
				  }

	
				});
		
		lightingName_tf = new JTextField();
		lightingName_tf.setColumns(10);
		lightingName_tf.setBounds(56, 238, 86, 20);
		frame.getContentPane().add(lightingName_tf);
		lightingName_tf.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
					
				  }
				  public void removeUpdate(DocumentEvent e) {
					  changeApplianceName(lightingName_tf.getText(),"Lighting");
				  }
				  public void insertUpdate(DocumentEvent e) {
					  changeApplianceName(lightingName_tf.getText(),"Lighting");
				  }

	
				});
		
		/////////////////////////
		//Lighting Brightness Buttons
		/////////////////////////
		JButton lighting_brightnessDown_btn = new JButton("-");
		lighting_brightnessDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		lighting_brightnessDown_btn.setBounds(254, 240, 38, 20);
		frame.getContentPane().add(lighting_brightnessDown_btn);
		lighting_brightnessDown_btn.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	System.out.println(-1);
		    	changeBrightness(-1);
		    }
		});
		
		JButton lighting_brightnessUp_btn = new JButton("+");
		lighting_brightnessUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		lighting_brightnessUp_btn.setBounds(290, 240, 38, 20);
		frame.getContentPane().add(lighting_brightnessUp_btn);
		lighting_brightnessUp_btn.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	System.out.println(1);
		    	changeBrightness(1);
		    }
		});
		
		
		JLabel lblComputerControlSystem = new JLabel("ComputerControlSystem");
		lblComputerControlSystem.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblComputerControlSystem.setBounds(4, 105, 36, 14);
		frame.getContentPane().add(lblComputerControlSystem);
		
		JLabel lblRadiators = new JLabel("Radiators");
		lblRadiators.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblRadiators.setBounds(4, 155, 45, 14);
		frame.getContentPane().add(lblRadiators);
		
		JLabel lblSecuritycamera = new JLabel("Cameras");
		lblSecuritycamera.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblSecuritycamera.setBounds(4, 200, 56, 14);
		frame.getContentPane().add(lblSecuritycamera);
		
		JLabel lblLighting = new JLabel("Lighting");
		lblLighting.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLighting.setBounds(4, 241, 45, 14);
		frame.getContentPane().add(lblLighting);
		
		JLabel label = new JLabel("ComputerControlSystem");
		label.setFont(new Font("Tahoma", Font.BOLD, 10));
		label.setBounds(10, 313, 36, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Radiators");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_1.setBounds(10, 357, 45, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("Cameras");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_2.setBounds(10, 402, 76, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Lighting");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_3.setBounds(10, 439, 45, 14);
		frame.getContentPane().add(label_3);
		
		JLabel lblApplianceStatus = new JLabel("Appliance Info");
		lblApplianceStatus.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblApplianceStatus.setBounds(10, 288, 143, 14);
		frame.getContentPane().add(lblApplianceStatus);
		
		
		final JToggleButton computercontrolsystemOnOff_tgl = new JToggleButton("On");
		computercontrolsystemOnOff_tgl.setSelected(true);
		computercontrolsystemOnOff_tgl.setBounds(160, 104, 86, 20);
		frame.getContentPane().add(computercontrolsystemOnOff_tgl);
		computercontrolsystemOnOff_tgl.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent event) {
				if (computercontrolsystemOnOff_tgl.isSelected()){
					 computercontrolsystemOnOff_tgl.setText("On");
					 onOff(true,"ComputerControlSystem");
	            } 
				 else {
	            	computercontrolsystemOnOff_tgl.setText("Off");
					 onOff(false,"ComputerControlSystem");
	            }
				
			}
	    });
		
		final JToggleButton radiatorsOnOff_tgl = new JToggleButton("On");
		radiatorsOnOff_tgl.setSelected(true);
		radiatorsOnOff_tgl.setBounds(160, 149, 86, 20);
		frame.getContentPane().add(radiatorsOnOff_tgl);
		radiatorsOnOff_tgl.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent event) {
				 if (radiatorsOnOff_tgl.isSelected()){
					 radiatorsOnOff_tgl.setText("On");
					 onOff(true,"Radiators");

	            } else {
	            	radiatorsOnOff_tgl.setText("Off");
	            	 onOff(false,"Radiators");
	            }
				
			}
	    });
		
		final JToggleButton cameraOnOff_tgl = new JToggleButton("On");
		cameraOnOff_tgl.setSelected(true);
		cameraOnOff_tgl.setBounds(160, 194, 86, 20);
		frame.getContentPane().add(cameraOnOff_tgl);
		cameraOnOff_tgl.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent event) {
				 if (cameraOnOff_tgl.isSelected()){
					 cameraOnOff_tgl.setText("On");
					 onOff(true,"Securitycamera");

	            } else {
	            	cameraOnOff_tgl.setText("Off");
					 onOff(false,"Securitycamera");

	            }
				
			}
	    });
		
		final JToggleButton lightingOnOff_tgl = new JToggleButton("On");
		lightingOnOff_tgl.setSelected(true);
		lightingOnOff_tgl.setBounds(160, 240, 86, 20);
		frame.getContentPane().add(lightingOnOff_tgl);
		lightingOnOff_tgl.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent event) {
				 if (lightingOnOff_tgl.isSelected()){
					 lightingOnOff_tgl.setText("On");
					 onOff(true,"Lighting");
	            } else {
	            	lightingOnOff_tgl.setText("Off");
	            	onOff(false,"Lighting");
	            }
				
			}
	    });
		
		JButton radiators_speedDown_btn = new JButton("-");
		radiators_speedDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		radiators_speedDown_btn.setBounds(345, 149, 38, 20);
		frame.getContentPane().add(radiators_speedDown_btn);
		radiators_speedDown_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		    	System.out.println(-1);
		    	changeSpeed(-1);
			}
		});
		
		JButton radiators_speedUp_btn = new JButton("+");
		radiators_speedUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		radiators_speedUp_btn.setBounds(381, 149, 38, 20);
		frame.getContentPane().add(radiators_speedUp_btn);
		radiators_speedUp_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(+1);
		    	changeSpeed(1);}
		});
		
		/*JButton computercontrolsystemRangeDown_btn = new JButton("-");
		computercontrolsystemRangeDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		computercontrolsystemRangeDown_btn.setBounds(355, 104, 38, 20);
		frame.getContentPane().add(computercontrolsystemRangeDown_btn);
		computercontrolsystemRangeDown_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    	System.out.println(1);
		    	changeRange(-1);
			}
		});*/
		
		/*JButton computercontrolsystemRangeUp_btn = new JButton("+");
		computercontrolsystemRangeUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		computercontrolsystemRangeUp_btn.setBounds(391, 104, 38, 20);
		frame.getContentPane().add(computercontrolsystemRangeUp_btn);
		computercontrolsystemRangeUp_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(+1);
				changeRange(1);
			}
		});*/
		
		String[] appNames = {"Select a Camera","Offices", "Garage", "Entrance", "Exit", "Roof", "Stairs" };
		JComboBox appList = new JComboBox(appNames);
		appList.setFont(new Font("Tahoma", Font.PLAIN, 10));
		appList.setBounds(345, 194, 86, 20);
		frame.getContentPane().add(appList);
		appList.addActionListener(new ActionListener()  {
			
		    public void actionPerformed(ActionEvent e) {
		        JComboBox cb = (JComboBox)e.getSource();
		        String appName = (String)cb.getSelectedItem();
		        changeCamera(appName);	
}		
	});
		
		JLabel lblApplianceStatus_1 = new JLabel("Appliance Status");
		lblApplianceStatus_1.setBounds(170, 90, 83, 14);
		frame.getContentPane().add(lblApplianceStatus_1);
		
		radiatorsInfo_name = new JLabel("Appliance Name");
		radiatorsInfo_name.setBounds(10, 377, 111, 14);
		frame.getContentPane().add(radiatorsInfo_name);
		
		radiatorsInfo_status = new JLabel("Appliance Status");
		radiatorsInfo_status.setBounds(125, 377, 90, 14);
		frame.getContentPane().add(radiatorsInfo_status);
		
		radiatorsInfo_temperature = new JLabel("Volume");
		radiatorsInfo_temperature.setBounds(220, 377, 90, 14);
		frame.getContentPane().add(radiatorsInfo_temperature);
		
		radiatorsInfo_speed = new JLabel("Speed");
		radiatorsInfo_speed.setBounds(320, 377, 38, 14);
		frame.getContentPane().add(radiatorsInfo_speed);
		
		computercontrolsystemInfo_name= new JLabel("Appliance Name");
		computercontrolsystemInfo_name.setBounds(10, 332, 111, 14);
		frame.getContentPane().add(computercontrolsystemInfo_name);
		
		computercontrolsystemInfo_status = new JLabel("Appliance Status");
		computercontrolsystemInfo_status.setBounds(125,332, 90, 14);
		frame.getContentPane().add(computercontrolsystemInfo_status);
		
		computercontrolsystemInfo_intensity = new JLabel("Volume");
		computercontrolsystemInfo_intensity.setBounds(220, 332, 90, 14);
		frame.getContentPane().add(computercontrolsystemInfo_intensity);
		
		computercontrolsystemInfo_range = new JLabel("Range");
		computercontrolsystemInfo_range.setBounds(320, 332, 98, 14);
		frame.getContentPane().add(computercontrolsystemInfo_range);
		
		camInfo_name = new JLabel("Appliance Name");
		camInfo_name.setBounds(10, 418, 111, 14);
		frame.getContentPane().add(camInfo_name);
		
		camInfo_status = new JLabel("Appliance Status");
		camInfo_status.setBounds(125, 418, 83, 14);
		frame.getContentPane().add(camInfo_status);
		
		camInfo_intensity = new JLabel("Volume");
		camInfo_intensity.setBounds(220, 418, 83, 14);
		frame.getContentPane().add(camInfo_intensity);
		
		camInfo_camera = new JLabel("Camera");
		camInfo_camera.setBounds(320, 418, 98, 14);
		frame.getContentPane().add(camInfo_camera);
		
		lightingInfo_name = new JLabel("Appliance Name");
		lightingInfo_name.setBounds(10, 458, 111, 14);
		frame.getContentPane().add(lightingInfo_name);
		
		lightingInfo_status = new JLabel("Appliance Status");
		lightingInfo_status.setBounds(125, 458, 90, 14);
		frame.getContentPane().add(lightingInfo_status);
		
		lightingInfo_brightness = new JLabel("Brightness");
		lightingInfo_brightness.setBounds(220, 458, 103, 14);
		frame.getContentPane().add(lightingInfo_brightness);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 357, 432, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 402, 432, 2);
		frame.getContentPane().add(separator_1);
			
	}
		
	///////////////////
	//GRPC Methods
	///////////////////
	
	public void changeApplianceName(String newName, String appliance) {

		System.out.println("New Name "+ newName);
		System.out.println("Appliance "+ appliance);

		stringRequest req = stringRequest.newBuilder().setText(newName).build();
		System.out.println("Changing appliance Name");
		
		if(appliance.equals("ComputerControlSystem")) {
			System.out.println("Appliance is a ComputerControlSystem");
			stringRequest request = stringRequest.newBuilder().setText(newName).build();
			StreamObserver<stringResponse> responseObserver = new StreamObserver<stringResponse>() {

				@Override
				public void onNext(stringResponse value) {
					// TODO Auto-generated method stub
					System.out.println(" on next ComputerControlSystem Response " + value.getText());
					computercontrolsystemInfo_name.setText("Name: "+ value.getText());
				}
	
				@Override
				public void onError(Throwable t) {
					System.out.println("Error with name connection for computercontrolsystem ");
				}
	
				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("On completed for computercontrolsystem name");
				}
			
			};
			computercontrolsystem_asyncStub.changeApplianceName(request,responseObserver);
			try {
				Thread.sleep(200);
			}
			catch(InterruptedException e){
				System.out.println("Connection Interrupted");

			}
		}
		
		else if(appliance.equals("Radiators")) {
			System.out.println("Appliance is Radiators");
			stringResponse response = radiators_blockingStub.changeApplianceName(req);
				System.out.println("Radiators Response "+response.getText());
		        radiatorsInfo_name.setText("Name: "+response.getText());

		}
		else if(appliance.equals("Lighting")) {
			System.out.println("Appliance is a Lighting");
			stringResponse response = lighting_blockingStub.changeApplianceName(req);
			System.out.println("Lighting Response "+response.getText());
	        lightingInfo_name.setText("Name: "+response.getText());

		}
		else if(appliance.equals("Securitycamera")) {
			stringResponse response = securitycamera_blockingStub.changeApplianceName(req);
			System.out.println("Camera Response "+response.getText());
	        camInfo_name.setText("Name: "+response.getText());
		}
		
				
	}
	
	public void changeVolume(int intensity, String appliance) {
		valueRequest req = valueRequest.newBuilder().setLength(intensity).build();
		System.out.println("Changing intensity");

		if(appliance.equals("ComputerControlSystem")) {
			StreamObserver<valueResponse> response = new StreamObserver<valueResponse>() {
				
				@Override
				public void onNext(valueResponse value) {
					System.out.println("Receiving "+value);
					String vol = String.valueOf(value.getLength());
			        computercontrolsystemInfo_intensity.setText("Volume"+vol);
					
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					t.printStackTrace();
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("Completed changing intensity");
				}
				
				
			};
			//Handle appliance to work with

			 computercontrolsystem_asyncStub.changeVolume(req, response);			
				System.out.println("ComputerControlSystem response "+req.getLength());

		}else if(appliance.equals("Securitycamera")) {
			StreamObserver<valueResponse> response = new StreamObserver<valueResponse>() {
				
				@Override
				public void onNext(valueResponse value) {
					System.out.println("Receiving "+value);
					String vol = String.valueOf(value.getLength());
			        camInfo_intensity.setText("Volume: "+vol);
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					t.printStackTrace();
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("Completed changing intensity");
				}
				
				
			};
				securitycamera_asyncStub.changeVolume(req, response);
				System.out.println("Camera Response"+req.getLength());
		}

	}
	
	public void changeBrightness(int value) {
		valueRequest req = valueRequest.newBuilder().setLength(value).build();
		System.out.println("Changing Brightness");
		StreamObserver<valueResponse> response = new StreamObserver<valueResponse>() {

			@Override
			public void onNext(valueResponse value) {
				System.out.println("Receiving "+value);
				String brightness = String.valueOf(value.getLength());
		        lightingInfo_brightness.setText("Brightness: "+brightness);
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				t.printStackTrace();
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				System.out.println("Completed changing brightness");
			}
			
		};
		lighting_asyncStub.changeBrightness(req, response);


	}
	
	/*public void changeRange(int value) {
		valueRequest req = valueRequest.newBuilder().setLength(value).build();
		System.out.println("Changing Range");
		
		Iterator<valueResponse> response;
		//Error Handling
		try {
			 response =computercontrolsystem_blockingStub.changeRange(req);

		}catch(StatusRuntimeException e) {
			System.out.println("RPC failed: {0}"+ e.getStatus());
			return;
		}
		
		System.out.println("ComputerControlSystem range response"+((DocumentEvent) response).getLength());
		String range = String.valueOf(((DocumentEvent) response).getLength());
        computercontrolsystemInfo_range.setText("Range No: "+range);


	}*/
	
	public void changeTemperature(int temperature) {
		valueRequest req = valueRequest.newBuilder().setLength(temperature).build();
		System.out.println("Changing temperature");

			StreamObserver<valueResponse> response = new StreamObserver<valueResponse>() {
				
				@Override
				public void onNext(valueResponse value) {
					System.out.println("Receiving "+value);
					String temp = String.valueOf(value.getLength());
			        radiatorsInfo_temperature.setText("Temperature"+temp);
					
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					t.printStackTrace();
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("Completed changing temperature");
				}
				
				
			};
			//Handle appliance to work with

			radiators_asyncStub.changeTemperature(req, response);			
			System.out.println("Temperature response "+req.getLength());

	}

	public void changeCamera(String camera) {
		stringRequest req = stringRequest.newBuilder().setText(camera).build();
		System.out.println("Changing application to "+ req.getText());

			StreamObserver<stringResponse> response = new StreamObserver<stringResponse>() {
				
				@Override
				public void onNext(stringResponse str) {
					System.out.println("Receiving "+str);
					String cam = String.valueOf(str.getText());
			        camInfo_camera.setText("Camera"+cam);
					
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					t.printStackTrace();
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("Completed changing camera");
				}
				
				
			};
			//Handle appliance to work with

			securitycamera_asyncStub.changeCamera(req, response);			
			System.out.println("Channel response "+req.getText());

	}
	
	
	/*public void changeCamera(String camera) {
		stringRequest req = stringRequest.newBuilder().setText(camera).build();
		System.out.println("Changing application to "+ req.getText());
		stringResponse response;
		
		
		//Error Handling
		try {
			 response = securitycamera_blockingStub.changeCamera(req);

		}catch(StatusRuntimeException e) {
			System.out.println("RPC failed: {0}"+ e.getStatus());
			return;
		}
		System.out.println("Camera response"+(response).getText());
		String cam = String.valueOf((response).getText());
        camInfo_camera.setText("Cam: "+cam);

	}*/
	
	public void changeSpeed(int speed) {
		valueRequest req = valueRequest.newBuilder().setLength(speed).build();
		System.out.println("Changing speed");

			StreamObserver<valueResponse> response = new StreamObserver<valueResponse>() {
				
				@Override
				public void onNext(valueResponse value) {
					System.out.println("Receiving "+value);
					String spd = String.valueOf(value.getLength());
			        radiatorsInfo_speed.setText("Speed"+spd);
					
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					t.printStackTrace();
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("Completed changing speed");
				}
				
				
			};
			//Handle appliance to work with

			radiators_asyncStub.changeFan(req, response);			
			System.out.println("Speed response "+req.getLength());

	}
	
	public void onOff(boolean onOff, String appliance) {
		booleanRequest req = booleanRequest.newBuilder().setMsg(onOff).build();
		System.out.println("On Off");

	//Handle appliance to work with
		if(appliance.equals("ComputerControlSystem")) {
			booleanResponse response;
			//Error Handling
			try {
				 response  = computercontrolsystem_blockingStub.onOff(req);

			}catch(StatusRuntimeException e) {
				System.out.println("RPC failed: {0}"+ e.getStatus());
				return;
			}
		
			System.out.println("ComputerControlSystem response "+response.getMsg());
			Boolean status=	response.getMsg();
			if(status) {
				computercontrolsystemInfo_status.setText("Status: On");
			}else {
				computercontrolsystemInfo_status.setText("Status: Off");
			}
		}
		else if(appliance.equals("Radiators")) {
			booleanResponse response;
			//Error Handling
			try {
				 response = radiators_blockingStub.onOff(req);

			}catch(StatusRuntimeException e) {
				System.out.println("RPC failed: {0}"+ e.getStatus());
				return;
			}
				System.out.println("Radiators Response "+response.getMsg());
				Boolean status=	response.getMsg();
				if(status) {
					radiatorsInfo_status.setText("Status: On");
				}else {
					radiatorsInfo_status.setText("Status: Off");
				}
		}
		else if(appliance.equals("Securitycamera")) {
			System.out.println("SecurityCamera Response ");

			booleanResponse response;
			//Error Handling
			try {
				 response = securitycamera_blockingStub.onOff(req);

			}catch(StatusRuntimeException e) {
				System.out.println("RPC failed: {0}"+ e.getStatus());
				return;
			}
			
			System.out.println("Cam Response "+response.getMsg());
			Boolean status=	response.getMsg();
			if(status) {
				camInfo_status.setText("Status: On");
			}else {
				camInfo_status.setText("Status: Off");
			}
		}
		else if(appliance.equals("Lighting")) {
			booleanResponse response;
			
			//Error Handling
			try {
				 response = lighting_blockingStub.onOff(req);

			}catch(StatusRuntimeException e) {
				System.out.println("RPC failed: {0}"+ e.getStatus());
				return;
			}
			
			System.out.println("Lighting Response "+response.getMsg());
			Boolean status=	response.getMsg();
			if(status) {
				lightingInfo_status.setText("Status: On");
			}else {
				lightingInfo_status.setText("Status: Off");
			}
		}
	}
	
	public void initialRadiators() {
		Empty req = Empty.newBuilder().build();
		System.out.println("Initial Radiators");
		radiatorsResponse response;
		//Error Handling
		try {
			 response = radiators_blockingStub.initialAppliance(req);

		}catch(StatusRuntimeException e) {
			System.out.println("RPC failed: {0}"+ e.getStatus());
			return;
		}		
		radiatorsInfo_name.setText("Name: "+response.getAname());
		radiatorsInfo_status.setText("Status: "+response.getStatus());
		String temp = String.valueOf(response.getTemperature());
		radiatorsInfo_temperature.setText("Temperature: "+temp);

	}
	
	public void initialComputerControlSystem() {
		Empty req = Empty.newBuilder().build();
		System.out.println("Initial ComputerControlSystem");
		computercontrolsystemResponse response;
		
		//Error Handling
		try {
			 response = computercontrolsystem_blockingStub.initialAppliance(req);

		}catch(StatusRuntimeException e) {
			System.out.println("RPC failed: {0}"+ e.getStatus());
			return;
		}		
		computercontrolsystemInfo_name.setText("Name: "+response.getAname());
		computercontrolsystemInfo_status.setText("Status: "+response.getStatus());
		String intensity = String.valueOf(response.getVolume());
		computercontrolsystemInfo_intensity.setText("Volume: "+intensity);


	}
	
	public void initialLighting() {
		Empty req = Empty.newBuilder().build();
		System.out.println("Initial Lighting");
		lightingResponse response;
		//Error Handling
		try {
			 response = lighting_blockingStub.initialAppliance(req);

		}catch(StatusRuntimeException e) {
			System.out.println("RPC failed: {0}"+ e.getStatus());
			return;
		}		
		
		lightingInfo_name.setText("Name: "+response.getAname());
		lightingInfo_status.setText("Status: "+response.getStatus());
		String brightness = String.valueOf(response.getBrightness());
		lightingInfo_brightness.setText("Brightness: "+ brightness);

	}
	
	public void initialCamera() {
		Empty req = Empty.newBuilder().build();
		System.out.println("Initial Camera");
		cameraResponse response;
		
		//Error Handling
		try {
			 response = securitycamera_blockingStub.initialAppliance(req);

		}catch(StatusRuntimeException e) {
			System.out.println("RPC failed: {0}"+ e.getStatus());
			return;
		}		
		
		camInfo_name.setText("Name: "+response.getAname());
		camInfo_status.setText("Status: "+response.getStatus());
		String volume = String.valueOf(response.getVolume());
		camInfo_camera.setText("App: "+ response.getCam());
		camInfo_intensity.setText("Volume:"+volume);
	}
		

}//end main
