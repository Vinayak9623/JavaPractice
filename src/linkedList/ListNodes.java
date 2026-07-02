package linkedList;

public class ListNodes {

    int value;
    ListNodes next;

    public ListNodes(int value){
        this.value=value;
        this.next=null;
    }


    static void main() {

    }

    public static ListNodes mergeSortedList(ListNodes list1,ListNodes list2){

        ListNodes dummy=new ListNodes(-1);
        ListNodes current=dummy;

        while (list1!=null && list2!=null){

            if(list1.value<=list2.value){
                current.next=list1;
                list1=list1.next;
            }
            else {
                current.next=list2;
                list2=list2.next;
            }

            current=current.next;

        }

        if(list1!=null){
            current.next=list1;
        }
        else {
            current.next=list2;
        }
return dummy.next;
    }
}
