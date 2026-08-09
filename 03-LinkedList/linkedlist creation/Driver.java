

public class Driver{
    public static void main(String[] args) {
        MyLinkedList l=new MyLinkedList();
        l.addAtHead(10);
        l.addAtHead(20);
        l.addAtHead(30);
        l.addAtHead(40);
        l.addAtHead(50);
        
        l.addAtTail(100);
        l.Display();
        
        l.addAtIndex(2, 56);
        l.addAtIndex(0, 98);
        l.addAtIndex(67, 67);
        l.Display();
    }
}