public class NetworkDevice {
    String deviceName;
    String ipAddress;
    String location;
    String status;

    NetworkDevice(){
        deviceName = "router";
        ipAddress = "192.168.1.0";
        location = "main campus";
        status = "active";
    }
    NetworkDevice(String name , String ip ,
                  String loc ,String sts){
        deviceName = name;
        ipAddress = ip;
        location = loc;
        status = sts;
    }

    //methods
    void connect(){
        System.out.println(deviceName + " connected successfully!");
    }

    void restart(){
        System.out.println(deviceName + " is restarting....");
    }

    void display(){
        System.out.println("Device Name: " + deviceName);
        System.out.println("ip Address: " + ipAddress);
        System.out.println("location: " + location);
        System.out.println("status: " + status);
    }
}
