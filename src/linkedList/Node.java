package linkedList;

public class Node {
    int value;
    Node next;

    public Node(){}

    public Node(int value){
        this.value=value;
        this.next=null;
    }

    public static void main(String args[]){

        besicSetUp();
        System.out.println();
        addFirst(0);
    }

    public static Node besicSetUp(){
        Node head=new Node();
        head.value=1;

        Node second=new Node();
        second.value=2;
        head.next=second;

        Node third=new Node();
        third.value=3;
        second.next=third;

        Node fourth=new Node();
        fourth.value=4;
        third.next=fourth;
        return head;
    }

    public static void printNode(Node head){
        Node current=head;
        while(current!=null){
            System.out.print(current.value);
            current=current.next;
            if(current!=null){
                System.out.print(" =>");
            }
        }
    }


    public static void addFirst(int value){
        Node head = besicSetUp();
        Node newNode=new Node();
        newNode.value=0;
        newNode.next=head;
        head=newNode;
        printNode(head);
    }
}
