class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;

    }
}

public class ListSearch {
    public static boolean search(Node head,int key){
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
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
        Node head =new Node(5);
        head.next=new Node(10);
        head.next.next=new Node(15);

        printList(head);

        int key=10;
        System.out.println("Is "+key+"present? "+search(head, key));

        key=20;
        System.out.println("Is "+key+"present ?"+search(head,key));
    }
    
}
