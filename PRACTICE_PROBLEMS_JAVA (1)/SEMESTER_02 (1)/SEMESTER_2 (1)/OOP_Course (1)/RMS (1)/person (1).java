package OOP_Course.RMS;

public class person {
    int id;
    String name,email;
    String address;
    Long phoneNum;

    public person(int id, String name, String email, String address, Long phoneNum) {
        this.setId(id);
        this.setAddress(address);
        this.setEmail(email);
        this.setName(name);
        this.setPhoneNum(phoneNum);
    }

    public person() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public  void showDetail(){
        System.out.println(this.getId()+"\t\t\t\t\t"+this.getName()+"\t\t\t"+this.getPhoneNum()+"\n"
                +this.getEmail()+"\t\t\t"+this.getAddress());
    }
}
