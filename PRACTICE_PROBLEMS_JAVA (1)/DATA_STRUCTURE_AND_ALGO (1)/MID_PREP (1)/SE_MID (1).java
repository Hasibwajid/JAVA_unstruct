package DATA_STRUCTURE_AND_ALGO.MID_PREP;

class Node{
    String name;
    float gpa;
    Node next;

    Node(String name, float gpa){
        this.gpa = gpa;
        this.name = name;
        this.next = null;
    }
}


public class SE_MID {
    Node head ;
    int size;
    public void insert(String name,float gpa){
        Node newN = new Node(name,gpa);
        if (head == null){
            head = newN;
            size++;
            return;
        }

        newN.next = head ;
        head = newN;

        size++;
    }

    public void  printStdNameWith3Gpa(){
        Node temp = head;

        int cout = 0;

        while (temp != null){
            if(temp.gpa > 3){
                cout++;
                //to remove comma from last of last student
                if (temp.next == null){
                    System.out.println(temp.name+" with "+temp.gpa);
                    break;
                }
                System.out.print(temp.name+" with "+temp.gpa+" , ");
                if (cout >= 5){
                    System.out.println();
                    cout = 0;
                }
            }
            temp = temp.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        SE_MID obj = new SE_MID();

        obj.insert("hamid",3.47f);
        obj.insert("haseeb",3.04f);
        obj.insert("hammad",3.13f);
        obj.insert("salar",3.1f);
        obj.insert("jaamal",2.1f);
        obj.insert("inknown",1.1f);
        obj.insert("hamza",3.47f);
        obj.insert("ahsan",3.04f);
        obj.insert("janzeb",3.13f);
        obj.insert("uzair",3.1f);
        obj.insert("hammas",3.2f);
        obj.insert("abdullah",2.4f);
        obj.insert("mohtasim",2.8f);
        obj.insert("zeeshan",2.9f);
        obj.insert("fakhar",2.13f);
        obj.insert("faridon",3.25f);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\tBCS:03 RESULT\n\t\t\t\t\t\t\t\t\t\t\t\t\t\tTotal students: "+ obj.size);
        System.out.println("\nSTUDENTS WITH GPA > 3 ARE :  ");
        obj.printStdNameWith3Gpa();
    }
}
