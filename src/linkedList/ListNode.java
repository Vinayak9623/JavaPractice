package linkedList;

public class ListNode {
    int value;
    ListNode next;

    public ListNode(int value){
        this.value=value;
        this.next=null;
    }

    public static void main(String args[]){

        int max= Integer.MAX_VALUE;
        System.out.println(max);
        max++;
        System.out.println(max);
        max++;
        System.out.println(max);
//        addElement();
//        System.out.println();
//        insertAtBegening();
//        System.out.println();
//        insertAtEnd();
//        System.out.println();
//        deleteFirstNode();

    }

    public static void addElement(){
        ListNode head=new ListNode(1);
        ListNode second=new ListNode(2);
        head.next=second;
        ListNode third=new  ListNode(3);
        second.next=third;

        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }

    public static void insertAtBegening(){
        ListNode head=new ListNode(1);
        ListNode second=new ListNode(2);
        head.next=second;
        ListNode third=new  ListNode(3);
        second.next=third;

        ListNode bhead =new ListNode(0);
        bhead.next=head;
        head=bhead;

        ListNode temp=head;

        while (temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }

    public static void insertAtEnd(){
         ListNode head=new ListNode(1);
         ListNode single=new ListNode(2);
         ListNode second=new ListNode(3);

         head.next=single;
         single.next=second;
         ListNode third =new ListNode(4);
         second.next=third;

         ListNode temp=head;
         while (temp!=null){
             System.out.print(temp.value+" ");
             temp=temp.next;
         }
    }

    public static void deleteFirstNode(){
        ListNode head =new ListNode(0);
        ListNode first=new ListNode(1);
        head.next=first;
        ListNode second=new ListNode(2);
        first.next=second;
        ListNode third =new ListNode(3);
        second.next=third;
        ListNode fourth=new ListNode(4);
        third.next=fourth;
        head=first;
        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;
        }
    }

}
