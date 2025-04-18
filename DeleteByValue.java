class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class DeleteByValue {
    public static Node deleteByValue(Node head,int value){
        if(head==null)return null;

        if(head.data==value){
            return head.next;
        }
        Node curr=head;
        while (curr.next !=null && curr.next.data !=value) {
            curr=curr.next; 
        }

        if(curr.next!=null){
            curr.next=curr.next.next;
        }else{
            System.out.println("Value not found. ");
        }

        return head;
    }
    public static void printList(Node head){
        Node temp =head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);

        System.out.println("Original List: ");
        printList(head);

        head=deleteByValue(head, 30);

        System.out.println("After Deleting 30: ");
        printList(head);

    }
}
