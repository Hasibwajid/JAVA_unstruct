package OOPS_FreeCodeCamp;

public class stomach extends organs {
    private boolean isEmpty;

    public stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    @Override
    public void getDetail() {
        super.getDetail();

        if (this.isEmpty){
            System.out.println("Need to be fed");
        }else {
            System.out.println("Stoamch is full");
        }
    }

    public void digest(){
        System.out.println("Digesting begin");
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
