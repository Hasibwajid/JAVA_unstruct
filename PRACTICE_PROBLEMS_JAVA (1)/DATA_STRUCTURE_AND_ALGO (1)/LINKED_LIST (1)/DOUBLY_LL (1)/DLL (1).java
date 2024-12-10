
package DATA_STRUCTURE_AND_ALGO.LINKED_LIST.DOUBLY_LL;

class Node{
    Node next;
    int data;
    Node previous;

    Node(int data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}

public class DLL {

    Node head;
    Node tail;
    int size ;
 
    
    void insert(int val,int index){
        Node newNode = new Node(val);
        if(head ==  null){
            newNode.previous = null;
            newNode.next = null;
            head = tail = newNode;
        }else if(index <= 0){
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        else if (index >= size){
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        else{
            Node temp =head;
            int count =0;
            while(count < index -1){
                temp = temp.next;
                count++;
            }
            Node nextNode = temp.next.next;
            temp.next = newNode;
            newNode.next = nextNode;
            newNode.previous = temp;
            nextNode.previous = newNode;
        }
        size++;
    }
    
    void display(){
        Node temp = head;
        
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("");
    }
    
    void reverse(){
        Node temp = tail;
        
        if(tail == null){
            System.out.println("Empty");
            return;
        }
        
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.previous;
        }
        
        System.out.println("");
        
    }
    
    void get(int index){
        Node temp =head;
        int count =0;
        
        if(tail == null){
            System.out.println("Empty");
            return;
        }
        
        if(index < 0|| index > size){
            System.out.println("Invalid index");
            return;
        }
        
        while(temp != null){
            if(count == index){
                System.out.println(temp.data);
                return;
            }
            temp = temp.next;
            count++;
        }
    }

    void delete(int index){
        if(head == null){
            System.out.println("Empty list");
        }
        else if(index <= 0 ){
//            Node temp = head;
            head = head.next;
        }
        else if(index >= size-1){
            tail = tail.previous;
            tail.next = null;
        }
        else{
            Node temp = head;
            int counter = 0;
            while (counter < index -1){
                counter ++;
                temp = temp.next;
            }
            Node nextNode = temp.next.next;
            temp.next = nextNode;
            nextNode.previous = temp;
        }
    }


    
    public static void main(String[] args) {
        // TODO code application logic here
        DLL dll = new DLL();  
        dll.insert(1,0);
        dll.insert(2,1);
        dll.insert(3,2);
        dll.insert(4,3);
        dll.insert(5,4);
        dll.insert(6,5);
        dll.insert(7,6);
        dll.insert(8,7);
        dll.insert(9,8);
        dll.insert(10,9);


//        System.out.println("Before reverse: ");
//        dll.display();
//        System.out.println("After reverse: ");
//        dll.reverse();
//        dll.get(10);

//        dll.delete(2);
        dll.display();


        
    }
    
}
