class MyLinkedList {
    Node head;

    class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }

    public MyLinkedList() {
        //MyLinkedList MyLinkedList=new MyLinkedList();
    }
    public int get(int index) {
        if(head==null){
            return -1;
        }
        int c=0;
        Node temp=head;
        while(temp!=null && c<index){
            temp=temp.next;
            c++;
        }
        if(temp!=null && c==index){
            return temp.val;
        }
        return -1;
    }
    
    public void addAtHead(int val) {
        Node n=new Node(val);
        if(head==null){
            head=n;
            return;
        }
        n.next=head;
        head=n;
    }
    
    public void addAtTail(int val) {
        Node n=new Node(val);
        if(head==null){
            head=n;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
    }
    
    public void addAtIndex(int index, int val) {
        Node n=new Node(val);
        Node temp=head;
        if(index==0){
            addAtHead(val);
            return;
        }
        for(int i=0;i<index-1;i++){
            if(temp==null){
                return;
            }
            temp=temp.next;
            

        }
        if(temp.next==null){
            temp.next=n;
            return;
        }
        n.next=temp.next;
        temp.next=n;
    }
    
    public void deleteAtIndex(int index) {
        int c=0;
        Node temp=head;
        if(index==0){
            head=head.next;
            return;
        }
        while(temp.next!=null && c<index-1){
            temp=temp.next;
            c++;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */