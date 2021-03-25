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
	private JTextField Item_name_text;
	private JTextField Item_onOff_text;
	private JTextField Item_extra_op_text;
	private JTextField Item_extra_op2_text;
	
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
	public JLabel computercontrolsystemInfo_volume;
	
	
	public JLabel lightingInfo_name;
	public JLabel lightingInfo_status;
	public JLabel lightingInfo_brightness;
	
	public JLabel camInfo_name;
	public JLabel camInfo_status;
	public JLabel camInfo_brightness;
	public JLabel camInfo_camera;
	
	public JLabel radiatorsInfo_name;
	public JLabel radiatorsInfo_status;
	public JLabel radiatorsInfo_temperature;
	
	
	int radiatorsPort =1234;
	int computercontrolsystemPort =1235;
	int lightingPort =1236;
	int camPort =1237;
	
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
		//Start Item Registry, GRPC servers and channels then unregister
		r.jmndsRegister(radiatorsPort, computercontrolsystemPort, lightingPort, camPort);
		startGRPCServers();
		channels();
		r.unRegister();
		loadInitialItems();
	}
	
	public void startGRPCServers() throws IOException, InterruptedException {
		ComputerControlSystemServer.startDiscovery();
		LightingServer.startDiscovery();
		RadiatorsServer.startDiscovery();

	}
	public void loadInitialItems() throws IOException, InterruptedException {
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
		frame.getContentPane().setBackground(Color.orange);
		frame.setBounds(100, 100, 468, 525);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		/*Heading Label*/
		JLabel headLabel = new JLabel("Smart Office");
		headLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		headLabel.setBounds(101, 11, 245, 14);
		frame.getContentPane().add(headLabel);
		
		JLabel controller_lbl = new JLabel("Item Controls");
		controller_lbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		controller_lbl.setBounds(10, 64, 143, 14);
		frame.getContentPane().add(controller_lbl);
		
		JLabel Item_name_lbl = new JLabel("Location");
		Item_name_lbl.setBounds(56, 89, 83, 14);
		frame.getContentPane().add(Item_name_lbl);
		
		JLabel volume_lbl = new JLabel("Volume");
		volume_lbl.setBounds(275, 90, 48, 14);
		frame.getContentPane().add(volume_lbl);
		
		JLabel lblChannel = new JLabel("");
		lblChannel.setBounds(370, 90, 48, 14);
		frame.getContentPane().add(lblChannel);
		
		JLabel Item_name2_lblabel = new JLabel("Location");
		Item_name2_lblabel.setBounds(56, 135, 83, 14);
		frame.getContentPane().add(Item_name2_lblabel);
		
		JLabel Item_status2_lbl = new JLabel("Item Status");
		Item_status2_lbl.setBounds(170, 135, 83, 14);
		frame.getContentPane().add(Item_status2_lbl);
		
		JLabel temperature_lbl = new JLabel("Temperature");
		temperature_lbl.setBounds(270, 135, 48, 14);
		frame.getContentPane().add(temperature_lbl);
		
		JLabel Item_name3_lbl = new JLabel("Name");
		Item_name3_lbl.setBounds(56, 180, 83, 14);
		frame.getContentPane().add(Item_name3_lbl);
		
		JLabel volume_2_lbl = new JLabel("");
		volume_2_lbl.setBounds(270, 180, 48, 14);
		frame.getContentPane().add(volume_2_lbl);
		
		JLabel lblCamera = new JLabel("Camera");
		lblCamera.setBounds(355, 180, 63, 14);
		frame.getContentPane().add(lblCamera);
		
		JLabel Item_status3_lbl = new JLabel("Item Status");
		Item_status3_lbl.setBounds(170, 180, 83, 14);
		frame.getContentPane().add(Item_status3_lbl);
		
		JLabel Item_name4_lbl = new JLabel("Location");
		Item_name4_lbl.setBounds(56, 225, 83, 14);
		frame.getContentPane().add(Item_name4_lbl);
		
		JLabel Item_status4_lbl = new JLabel("Item Status");
		Item_status4_lbl.setBounds(170, 225, 83, 14);
		frame.getContentPane().add(Item_status4_lbl);
		
		JLabel lblBrigtness = new JLabel("Brightness");
		lblBrigtness.setBounds(254, 225, 72, 14);
		frame.getContentPane().add(lblBrigtness);
		
		//////////////////////
		//ComputerControlSystem Volume Buttons
		//////////////////////
		JButton computercontrolsystem_volumeUp_btn = new JButton("+");
		computercontrolsystem_volumeUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		computercontrolsystem_volumeUp_btn.setBounds(290, 104, 38, 20);
		frame.getContentPane().add(computercontrolsystem_volumeUp_btn);
		computercontrolsystem_volumeUp_btn.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			
			System.out.println(+1);
			changeVolume(1,"ComputerControlSystem");
		}
		});

		JButton computercontrolsystem_volumeDown_btn = new JButton("-");
		computercontrolsystem_volumeDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		computercontrolsystem_volumeDown_btn.setBounds(254, 104, 38, 20);
		frame.getContentPane().add(computercontrolsystem_volumeDown_btn);
		computercontrolsystem_volumeDown_btn.addActionListener(new ActionListener() {
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
		//Camera Brightness Buttons
		//////////////////////
		JButton camera_volumeUp_btn = new JButton("+");
		camera_volumeUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		camera_volumeUp_btn.setBounds(290, 194, 38, 20);
		frame.getContentPane().add(camera_volumeUp_btn);
		camera_volumeUp_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(+1);
		    	changeVolume(1,"Securitycamera");
		    	}
			
		});
		
		JButton camera_volumeDown_btn = new JButton("-");
		camera_volumeDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		camera_volumeDown_btn.setBounds(254, 194, 38, 20);
		frame.getContentPane().add(camera_volumeDown_btn);
		camera_volumeDown_btn.addActionListener(new ActionListener() {
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
					  changeItemName(computercontrolsystemName_tf.getText(),"ComputerControlSystem");
				  }
				  public void insertUpdate(DocumentEvent e) {
					  System.out.println("insertUpdate "+ computercontrolsystemName_tf.getText());
					  changeItemName(computercontrolsystemName_tf.getText(),"ComputerControlSystem");

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
					  changeItemName(radiatorsName_tf.getText(),"Radiators");
				  }
				  public void insertUpdate(DocumentEvent e) {
				
					  changeItemName(radiatorsName_tf.getText(),"Radiators");
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
					  changeItemName(camName_tf.getText(),"Securitycamera");
				  }
				  public void insertUpdate(DocumentEvent e) {
					  System.out.println("insertUpdate "+camName_tf.getText());
					  changeItemName(camName_tf.getText(),"Securitycamera");
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
					  changeItemName(lightingName_tf.getText(),"Lighting");
				  }
				  public void insertUpdate(DocumentEvent e) {
					  changeItemName(lightingName_tf.getText(),"Lighting");
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
		
		JLabel lblItemStatus = new JLabel("Item Info");
		lblItemStatus.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblItemStatus.setBounds(10, 288, 143, 14);
		frame.getContentPane().add(lblItemStatus);
		
		
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
		
		String[] appNames = {"Select a Camera","Meeting Room", "Reception", "Toilets", "Hallway", "Entrance", "Exit" };
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
		
		JLabel lblItemStatus_1 = new JLabel("Switch");
		lblItemStatus_1.setBounds(170, 90, 83, 14);
		frame.getContentPane().add(lblItemStatus_1);
		
		radiatorsInfo_name = new JLabel("Location");
		radiatorsInfo_name.setBounds(10, 377, 111, 14);
		frame.getContentPane().add(radiatorsInfo_name);
		
		radiatorsInfo_status = new JLabel("Switch");
		radiatorsInfo_status.setBounds(125, 377, 90, 14);
		frame.getContentPane().add(radiatorsInfo_status);
		
		radiatorsInfo_temperature = new JLabel("Volume");
		radiatorsInfo_temperature.setBounds(220, 377, 90, 14);
		frame.getContentPane().add(radiatorsInfo_temperature);
	
		computercontrolsystemInfo_name= new JLabel("Location");
		computercontrolsystemInfo_name.setBounds(10, 332, 111, 14);
		frame.getContentPane().add(computercontrolsystemInfo_name);
		
		computercontrolsystemInfo_status = new JLabel("Item Status");
		computercontrolsystemInfo_status.setBounds(125,332, 90, 14);
		frame.getContentPane().add(computercontrolsystemInfo_status);
		
		computercontrolsystemInfo_volume = new JLabel("Volume");
		computercontrolsystemInfo_volume.setBounds(220, 332, 90, 14);
		frame.getContentPane().add(computercontrolsystemInfo_volume);
		
		/*computercontrolsystemInfo_range = new JLabel("");
		computercontrolsystemInfo_range.setBounds(320, 332, 98, 14);
		frame.getContentPane().add(computercontrolsystemInfo_range);*/
		
		camInfo_status = new JLabel("Item Status");
		camInfo_status.setBounds(125, 418, 83, 14);
		frame.getContentPane().add(camInfo_status);
		
		camInfo_brightness = new JLabel("Brightness");
		camInfo_brightness.setBounds(220, 418, 83, 14);
		frame.getContentPane().add(camInfo_brightness);
		
		camInfo_camera = new JLabel("Camera");
		camInfo_camera.setBounds(320, 418, 98, 14);
		frame.getContentPane().add(camInfo_camera);
		
		lightingInfo_name = new JLabel("Location");
		lightingInfo_name.setBounds(10, 458, 111, 14);
		frame.getContentPane().add(lightingInfo_name);
		
		lightingInfo_status = new JLabel("Item Status");
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
	
	public void changeItemName(String newName, String Item) {

		System.out.println("New Name "+ newName);
		System.out.println("Item "+ Item);

		stringRequest req = stringRequest.newBuilder().setText(newName).build();
		System.out.println("Changing Item Name");
		
		if(Item.equals("ComputerControlSystem")) {
			System.out.println("Item is a ComputerControlSystem");
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
			computercontrolsystem_asyncStub.changeItemName(request,responseObserver);
			try {
				Thread.sleep(200);
			}
			catch(InterruptedException e){
				System.out.println("Connection Interrupted");

			}
		}
		
		else if(Item.equals("Radiators")) {
			System.out.println("Item is Radiators");
			stringResponse response = radiators_blockingStub.changeItemName(req);
				System.out.println("Radiators Response "+response.getText());
		        radiatorsInfo_name.setText("Name: "+response.getText());

		}
		else if(Item.equals("Lighting")) {
			System.out.println("Item is a Lighting");
			stringResponse response = lighting_blockingStub.changeItemName(req);
			System.out.println("Lighting Response "+response.getText());
	        lightingInfo_name.setText("Name: "+response.getText());

		}
		else if(Item.equals("Securitycamera")) {
			stringResponse response = securitycamera_blockingStub.changeItemName(req);
			System.out.println("Camera Response "+response.getText());
	        camInfo_name.setText("Name: "+response.getText());
		}
		
				
	}
	
	public void changeVolume(int volume, String Item) {
		valueRequest req = valueRequest.newBuilder().setLength(volume).build();
		System.out.println("Changing volume");

		if(Item.equals("ComputerControlSystem")) {
			StreamObserver<valueResponse> response = new StreamObserver<valueResponse>() {
				
				@Override
				public void onNext(valueResponse value) {
					System.out.println("Receiving "+value);
					String vol = String.valueOf(value.getLength());
			        computercontrolsystemInfo_volume.setText("Volume"+vol);
					
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					t.printStackTrace();
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("Completed changing volume");
				}
				
				
			};
			//Handle Item to work with

			 computercontrolsystem_asyncStub.changeVolume(req, response);			
				System.out.println("ComputerControlSystem response "+req.getLength());

		}else if(Item.equals("Securitycamera")) {
			StreamObserver<valueResponse> response = new StreamObserver<valueResponse>() {
				
				@Override
				public void onNext(valueResponse value) {
					System.out.println("Receiving "+value);
					String vol = String.valueOf(value.getLength());
			        camInfo_brightness.setText("Volume: "+vol);
				}

				@Override
				public void onError(Throwable t) {
					// TODO Auto-generated method stub
					t.printStackTrace();
				}

				@Override
				public void onCompleted() {
					// TODO Auto-generated method stub
					System.out.println("Completed changing volume");
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
			//Handle Item to work with

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
			//Handle Item to work with

			securitycamera_asyncStub.changeCamera(req, response);			
			System.out.println("Channel response "+req.getText());

	}
		
	public void onOff(boolean onOff, String Item) {
		booleanRequest req = booleanRequest.newBuilder().setMsg(onOff).build();
		System.out.println("On Off");

	//Handle Item to work with
		if(Item.equals("ComputerControlSystem")) {
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
		else if(Item.equals("Radiators")) {
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
		else if(Item.equals("Securitycamera")) {
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
		else if(Item.equals("Lighting")) {
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
			 response = radiators_blockingStub.initialItem(req);

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
			 response = computercontrolsystem_blockingStub.initialItem(req);

		}catch(StatusRuntimeException e) {
			System.out.println("RPC failed: {0}"+ e.getStatus());
			return;
		}		
		computercontrolsystemInfo_name.setText("Name: "+response.getAname());
		computercontrolsystemInfo_status.setText("Status: "+response.getStatus());
		String volume = String.valueOf(response.getVolume());
		computercontrolsystemInfo_volume.setText("Volume: "+volume);


	}
	
	public void initialLighting() {
		Empty req = Empty.newBuilder().build();
		System.out.println("Initial Lighting");
		lightingResponse response;
		//Error Handling
		try {
			 response = lighting_blockingStub.initialItem(req);

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
			 response = securitycamera_blockingStub.initialItem(req);

		}catch(StatusRuntimeException e) {
			System.out.println("RPC failed: {0}"+ e.getStatus());
			return;
		}		
		
		camInfo_name.setText("Name: "+response.getAname());
		camInfo_status.setText("Status: "+response.getStatus());
		String volume = String.valueOf(response.getVolume());
		camInfo_camera.setText("App: "+ response.getCam());
		camInfo_brightness.setText("Volume:"+volume);
	}
		

}//end main
