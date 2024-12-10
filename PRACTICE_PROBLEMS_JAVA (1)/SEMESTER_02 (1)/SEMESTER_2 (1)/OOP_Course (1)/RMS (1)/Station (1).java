package OOP_Course.RMS;

import java.util.Scanner;

public class Station {
    Scanner s = new Scanner(System.in);
    String stationName,stationAddress;
    int stationCapacity;

    public Station(){

    }
    public Station(String name, String address, int capacity) {
        this.setStationAddress(address);
        this.setStationCapacity(capacity);
        this.setStationName(name);
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getStationAddress() {
        return stationAddress;
    }

    public void setStationAddress(String stationAddress) {
        this.stationAddress = stationAddress;
    }

    public int getStationCapacity() {
        return stationCapacity;
    }

    public void setStationCapacity(int stationCapacity) {
        this.stationCapacity = stationCapacity;
    }

    public void showStation(){
        System.out.println("Station Name: "+this.getStationName()+"\t\t\tStation Address: "+this.getStationAddress()+"" +
                "\t\t\tStation Capacity: "+this.getStationCapacity());
    }
}
