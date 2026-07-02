package linkedList;

public class ListNodeTest {

    int value;
    ListNodeTest next;

    public ListNodeTest(int value,ListNodeTest next){
        this.value=value;
        this.next=next;
    }

    public ListNodeTest(){}

    public static void main(String[] args){

        printNodes(getBaseList());
        addElementInFirst(0);
        addElementInLast(6);
        addElementInMiddle(7);
        deleteTargetElement(3);
        System.out.println();


    }

    public static ListNodeTest getBaseList(){
        ListNodeTest head=new ListNodeTest();
        head.value=1;
        ListNodeTest node1=new ListNodeTest();
        head.next=node1;
        node1.value=2;
        ListNodeTest node2=new ListNodeTest();
        node1.next=node2;
        node2.value=3;
        ListNodeTest node3=new ListNodeTest();
        node2.next=node3;
        node3.value=4;
        ListNodeTest node4=new ListNodeTest();
        node3.next=node4;
        node4.value=5;
        return head;
    }

    public static void printNodes(ListNodeTest head){
        ListNodeTest currentValue=head;

        while (currentValue!=null){
            System.out.print(currentValue.value);
            currentValue=currentValue.next;
            if(currentValue!=null){
                System.out.print(" =>");
            }
        }
        System.out.println();
    }

    public static void addElementInFirst(int newValue){
        ListNodeTest head = getBaseList();
        ListNodeTest newNode=new ListNodeTest();
        newNode.value=newValue;
        newNode.next=head;
        head=newNode;
        printNodes(head);
    }

    public static void addElementInLast(int newValue){
        ListNodeTest head = getBaseList();
        ListNodeTest newNode=new ListNodeTest();
        newNode.value=newValue;
        newNode.next=null;
        ListNodeTest currentValue=head;
        while (currentValue.next!=null) {
            currentValue=currentValue.next;
        }
        currentValue.next=newNode;
        printNodes(head);
    }

    //add element in middle
    public static void addElementInMiddle(int newValue){
        ListNodeTest head = getBaseList();
        ListNodeTest currentValue=head;
        ListNodeTest newNode=new ListNodeTest();
        newNode.value=newValue;
        while (currentValue.value!=3){
            currentValue=currentValue.next;
        }
        newNode.next=currentValue.next;
        currentValue.next=newNode;

        printNodes(head);
    }

    public static void deleteTargetElement(int TargetElement){
        ListNodeTest head = getBaseList();
        ListNodeTest currentValue=head;
        while (currentValue.next.value!=TargetElement){
            currentValue=currentValue.next;
        }
        currentValue.next=currentValue.next.next;
        System.out.println("After deleting target element:");
        printNodes(head);

    }
}


//  4893 7728  0150 6847
//114
//03/32