class MyLinkedList{
    Node head;

    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    public MyLinkedList(){
    }
    public void addAtHead(int val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void addAtTail(int val){
        Node newNode=new Node(val);
        Node temp=head;
        if(head==null){
            head=newNode;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
    public void deleteFirst(){
        if(head==null || head.next==null){
            head=null;
            return;
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void addAtIndex(int index,int val){
        int c=0;
        if(index==0){
            addAtHead(val);
            return;
        }
        Node n=new Node(val);
        Node temp=head;
        while (temp.next!=null && c<index-1 && temp.next.next!=null) { 
            temp=temp.next;
            c++;
        }
        if(temp.next.next==null){
            System.out.println("soch samjh kar index dalo");
            return;
        }
        Node prev=temp.next;
        temp.next=n;
        n.next=prev;

    }
}