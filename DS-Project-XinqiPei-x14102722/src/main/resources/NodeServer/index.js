var grpc = require("grpc");
var events = require("events");
// add the bookStream global variable
var secStream = new events.EventEmitter();
var secProto = grpc.load("Camera.proto");
var secItem = {
    secname: "Camera",
    position: "On",
    sec: "There's no camera choosed",
    distance: 7
};
var server = new grpc.Server();
server.bind("0.0.0.0:1237", grpc.ServerCredentials.createInsecure());
console.log("Server running at http://0.0.0.0:1237");

server.addService(secProto.org.DS.xinqipeiproject.SmartOfficeGRPC.CameraSecService.service, {
    initialItem: function (call, callback) {
        callback(null, secItem);
    },
    changeCamera: function (call, callback) {
        var secName = call.request.text;
        if (secName == "Camera") {
            secItem.sec = "There's no camera choosed";
        } 
        else {
            secName.sec = secName
        }

        return callback(null, secItem.sec);
    },

    changeDistance: function (call, callback) {
        var requestDistance = call.request.length;
        var newDistance = secItem.distance + requestDistance
        if (newDistance < 100 && newDistance >= 0) {
            secItem.distance = newDistance;
        }
        console.log(secItem);
        return callback(null, secItem.distance);
    },
    onOff: function (call, callback) {
        var requestValue = call.request.msg
        console.log(requestValue)
        if (requestValue == true) {
            secItem.status = "Power On"
        } 
        else {
            secItem.status = "Power Off"
        }
        var response;
        if (secItem.status == "Power On") {
            response = true;
        } 
        else {
            response = false;
        }
        callback(null, resp);
    },
    changeItemName: function (call, callback) {
        var requestName = call.request.text
        secItem.sec = requestName
        console.log("ID" + secItem.sec);

        callback(null, secItem.sec);
    }
});

server.start();