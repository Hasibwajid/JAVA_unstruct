package OOPS_FreeCodeCamp;

public class Eye extends organs{
    String color;
    boolean isOpen;

    public Eye(String name, String medicalCondition, String color, boolean isOpen) {
        super(name, medicalCondition);
        this.color = color;
        this.isOpen = isOpen;
    }

    @Override
    public void getDetail() {
        super.getDetail();
        System.out.println("Color : "+this.color);

    }


    public void open (){
        this.setOpen(true);
        System.out.println(this.getName()+" opened");
    }

    public void close (){
        this.setOpen(false);
        System.out.println(this.getName()+" closed");
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
