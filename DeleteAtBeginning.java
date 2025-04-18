class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class DeleteAtBeginning {

    public static Node deleteAtBeginning(Node head){
        if(head==null){
            System.out.println("List is already empty");
            return null;

        }
        return head.next;
    }
    public static void printList(Node head){
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args){
        Node head=new Node(5);
        head.next=new Node(10);
        head.next.next=new Node(15);

        System.out.println("Original List:");
        printList(head);

        head=deleteAtBeginning(head);
        System.out.println("After Deleting at Beginning: ");
        printList(head);
    }
    
}
