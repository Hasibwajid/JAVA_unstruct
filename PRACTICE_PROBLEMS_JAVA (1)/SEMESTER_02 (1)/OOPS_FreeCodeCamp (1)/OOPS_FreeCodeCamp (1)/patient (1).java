package OOPS_FreeCodeCamp;

public class patient {
   private String name;
   private int age;
   private Eye leftEye;
   private Eye rightEye;
   private Heart heart;
   private stomach stomach;
   private skin skin;

    public patient(String name, int age, Eye leftEye, Eye rightEye,
                   Heart heart, OOPS_FreeCodeCamp.stomach stomach, OOPS_FreeCodeCamp.skin skin) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Eye getLeftEye() {
        return leftEye;
    }

    public void setLeftEye(Eye leftEye) {
        this.leftEye = leftEye;
    }

    public Eye getRightEye() {
        return rightEye;
    }

    public void setRightEye(Eye rightEye) {
        this.rightEye = rightEye;
    }

    public Heart getHeart() {
        return heart;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public OOPS_FreeCodeCamp.stomach getStomach() {
        return stomach;
    }

    public void setStomach(OOPS_FreeCodeCamp.stomach stomach) {
        this.stomach = stomach;
    }

    public OOPS_FreeCodeCamp.skin getSkin() {
        return skin;
    }

    public void setSkin(OOPS_FreeCodeCamp.skin skin) {
        this.skin = skin;
    }
}
