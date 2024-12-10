package SEMESTER_2.src.OOP_Course.RMS;

import java.util.Scanner;

public class Train {
    Scanner sc=new Scanner(System.in);
    int id;
    String name;
    int compartments;
    int capacity;
    double Engine_no;

    public Train(int id, String name, int compartments, int capacity, double engine_no) {
        this.setId(id);
        this.setName(name);
        this.setCapacity(capacity);
        this.setCompartments(compartments);
        this.setEngine_no(engine_no);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCompartments() {
        return compartments;
    }

    public void setCompartments(int compartments) {
        this.compartments = compartments;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getEngine_no() {
        return Engine_no;
    }

    public void setEngine_no(double engine_no) {
        Engine_no = engine_no;
    }

    public Train() {
    }

    public void showTrain() {
        System.out.println("Id: "+this.getId()+"\t\t\tName: "+this.getName()+"\t\t\tcompartments: "
                +this.getCompartments()+"\ncapacity: "+this.getCapacity()+"\t\t\tEngine_no: "+this.getEngine_no());
    }
}