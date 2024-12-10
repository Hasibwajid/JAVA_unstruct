package Laptop;

public class parent {
    String name;
    String ram;
    String hardDisk;
    int price;
    String processor;

    public parent(){

    }


    public String getName() {
        return name;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public int getPrice() {
        return price;
    }

    public String getProcessor() {
        return processor;
    }

    public void details(){
        System.out.println("Name: "+this.name);
        System.out.println("Ram: "+this.ram);
        System.out.println("Processor: "+this.processor);
        System.out.println("Hard Disk: "+this.hardDisk);
        System.out.println("Price: "+this.price);
    }

    public int discount(int p){
        if (p>25000){
            this.price = price-(price/100*(5));
        }
        return price;
    }

}
