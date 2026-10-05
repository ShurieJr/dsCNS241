package Code;

public class NetworkDevice {
    //instance variables
    private String deviceName;
    private String ipAddress;
    private String location;
    private String status;

    protected static int num;

    //shared all objects
    static String networkName = "Campus 3 Network";
    static int numOfDevices = 0;

    public NetworkDevice() {
//        deviceName = "router";
//        ipAddress = "192.168.1.0";
//        location = "main campus";
//        status = "active";
//        numOfDevices++;
        this("router", "192.168.1.0", "main campus", "active");
    }


    public NetworkDevice(String deviceName, String ipAddress, String location, String status) {
        this.deviceName = deviceName;
        this.ipAddress = ipAddress;
        this.location = location;
        this.status = status;

        numOfDevices++;
    }
//get & set

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //methods  -- instance methods
    void connect() {
        System.out.println(deviceName + " connected successfully!");
        this.display();
    }

    void restart() {
        System.out.println(deviceName + " is restarting....");
    }

    public void display() { //instance method
        System.out.println("Device Name: " + deviceName);
        System.out.println("ip Address: " + ipAddress);
        System.out.println("location: " + location);
        System.out.println("status: " + status);
//static variables
//        System.out.println("Network name: " + networkName);
//        System.out.println("Total devices: " + numOfDevices);
        displayNetworkInfo();
    }

    //static method
    static void displayNetworkInfo() {
        System.out.println("Network name: " + networkName);
        System.out.println("Total devices: " + numOfDevices);
    }


    static void main() {
        NetworkDevice router1 = new NetworkDevice();
        router1.connect();
    }
}
