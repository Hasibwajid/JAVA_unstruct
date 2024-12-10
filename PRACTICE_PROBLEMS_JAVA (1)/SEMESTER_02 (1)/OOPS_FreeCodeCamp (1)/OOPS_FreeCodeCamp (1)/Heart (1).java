package OOPS_FreeCodeCamp;

public class Heart extends organs{
    private int rate;


    public Heart(String name, String medicalCondition, int rate) {
        super(name, medicalCondition);
        this.rate = rate;
    }


    @Override
    public void getDetail() {
        super.getDetail();
        System.out.println("Heart rate : "+this.rate);
    }


    public int getRate() {
        return rate;
    }


    public void setRate(int rate) {
        this.rate = rate;
    }
}
