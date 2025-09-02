package DataStructures.LinkedList.Singly;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SLL {
    Node head;

    SLL(){
        head = null;
    }

    void insertAtHead(int val){
        Node n = new Node(val);
        n.next = head;
        head = n;
    }

    void insertAtTail(int val){
        Node n = new Node(val);
        if(head==null){
            head = n;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;
    }

    int getSizeLL(){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        return size;
    }

    void insertAtPos(int val, int pos){
        Node n = new Node(val);
        int sizeLL = getSizeLL();
        if(pos<0 || pos>sizeLL){
            System.out.println("Invalid Size!");
        }else if(pos==0){
            n.next = head;
            head = n;
        }else{
            Node temp = head;
            while(--pos>0){
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next = n;
        }
    }

    void deleteAtHead(){
        if(head==null){
            System.out.println("LinkedList is Empty");
            return;
        }
        Node toDelete = head;
        head = head.next;
        toDelete = null; // This will call garbeage collection on this toDelete!
    }

    void deleteByValue(int val){
        if(head==null) return;
        if(head.data==val){
            deleteAtHead();
            return;
        }
        Node temp = head;
        while(temp.next!=null && temp.next.data!=val){
            temp = temp.next;
        }
        if(temp.next==null){
            System.out.println("Value was not found to be deleted");
            return ;
        }
        Node todelete = temp.next;
        temp.next = temp.next.next;
        todelete = null; // Garbage collection!!
    }

    void printLL(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

class DriverCode{
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertAtHead(10);
        sll.insertAtHead(20);
        sll.insertAtHead(30);
        sll.insertAtHead(40);
        sll.insertAtHead(50);
        sll.printLL();
        sll.insertAtTail(100);
        sll.insertAtTail(200);
        sll.printLL();
        sll.insertAtPos(1000, 3);
        sll.printLL();
        sll.deleteAtHead();
        sll.printLL();
        sll.deleteByValue(500);
        sll.printLL();
    }
}