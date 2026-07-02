package test;

public class LinkedListTest {
    int value;
    LinkedListTest next;

    public LinkedListTest(){}
    public LinkedListTest(int value){
        this.value=value;
    }

     static void main(String args[]){


    }

    private static LinkedListTest besicSetUp(){
        LinkedListTest head =new LinkedListTest();
        head.value=1;
        LinkedListTest node1=new LinkedListTest();
        node1.value=2;
        head.next=node1;
        LinkedListTest node2 =new LinkedListTest();
        node2.value=3;
        node1.next=node2;

        return head;
    }

    private static void printNode(LinkedListTest head){
        LinkedListTest current=head;

        while (current!=null)
        {
            System.out.print(current.value);
            current=current.next;
            if(current!=null){
                System.out.print(" => ");
            }
        }

    }

    public static LinkedListTest addNode(int value){
        LinkedListTest head =besicSetUp();
        printNode(head);
        return head;
    }
}
