class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class DeleteAtEnd{
    public static Node deleteAtEnd(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static void printList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        Node head=new Node(5);
        head.next=new Node(10);
        head.next.next=new Node(15);

        System.out.println("Original List: ");
        printList(head);

        head=deleteAtEnd(head);
        System.out.println("After Deleting at End");
        printList(head);
    }
}