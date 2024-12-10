package OOP_Course.RMS;
import java.util.Scanner;

class Food {
    Scanner s = new Scanner(System.in);
    String foodName,foodType,foodDescription;
    int foodID,foodPrice;

    public Food( String name, String type, String description, int id, int Price) {
        this.setFoodName(name);
        this.setFoodID(id);
        this.setFoodPrice(Price);
        this.setFoodType(type);
        this.setFoodDescription(description);
    }

    public Food(){

    }


    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }

    public int getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(int foodPrice) {
        this.foodPrice = foodPrice;
    }


    public void showFood(){
        System.out.println("ID: "+this.getFoodID()+"\t\t\t"+"Food Name: "+this.getFoodName()+"\t\t\tFood Price: "
                +this.getFoodPrice()+"\nFood Type: "+this.getFoodType()+"\t\t\tFood Desc: "+this.getFoodDescription());
    }
}
