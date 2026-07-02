package linkedList;

public class TestLinkedList {
    int value;
    TestLinkedList next;

    public TestLinkedList(int value){
        this.value=value;
        this.next=null;
    }

    static void main() {

        creatList();
    }

    public static void creatList(){

        TestLinkedList head =new TestLinkedList(1);
        TestLinkedList second=new TestLinkedList(2);
        TestLinkedList third=new TestLinkedList(3);
        TestLinkedList fourth=new TestLinkedList(4);
        TestLinkedList fifth=new TestLinkedList(5);
        head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        TestLinkedList temp=head;

        while (temp!=null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public static void deleteElement(){


    }
}
