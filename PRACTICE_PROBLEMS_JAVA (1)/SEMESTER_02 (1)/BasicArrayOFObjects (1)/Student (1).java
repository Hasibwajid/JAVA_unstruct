package BasicArrayOFObjects;

public class Student extends Person{
    int regNo;

    public Student(String name,int age,int regNo) {
        super(name,age);
        this.regNo = regNo;


    }

    public Student() {
        super();
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }
}
