package OOPS_FreeCodeCamp;

public class skin extends organs{
    private String color;
    private int softness;

    public skin(String name, String medicalCondition, String color, int softness) {
        super(name, medicalCondition);
        this.color = color;
        this.softness = softness;
    }


    @Override
    public void getDetail() {
        super.getDetail();
        System.out.println("color : "+this.getColor());
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }
}
