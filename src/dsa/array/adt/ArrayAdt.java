package dsa.array.adt;

public class ArrayAdt {

    private int[] arr;
    private int index;
    private int size;

    public ArrayAdt(int size){
        this.size=size;
        this.arr=new int[this.size];
        this.index=0;

    }

    public void insert(int value){
        //check array is full or not
        if(index==size){ System.out.println("Array is full");}
        else {
            arr[index] = value;
            index++;
        }
    }

    public void traverse(){
        for(int i=0;i<this.index;i++){
            System.out.println(arr[i]+"\t");
        }
        System.out.println();
       // Arrays.stream(arr).forEach(System.out::println);
    }

    //12345
    public void delete(int deleteIndex){
        if(deleteIndex<0 || deleteIndex>=size){
            System.out.println("Invalid index");
            return;
        }
        for(int i=deleteIndex;i<index-1;i++){
            arr[i]=arr[i+1];
        }
        index--;
    }

    //search the value and return index
    public int serchElement(int value){
        int resultIndex=-1;
        for(int i=0;i<index;i++){
            if(arr[i]==value){
                resultIndex=i;
                break;
            }
        }
        return resultIndex;
    }

    public int get(int getIndex){
        if(getIndex<0 || getIndex>=index){
            System.out.println("index is out of bound");
            return -2;
        }
        return arr[getIndex];
    }

    public void update(int updateIndex, int value){
        if(updateIndex<0 || updateIndex>=this.index){
            System.out.println("invalid index");
            return;
        }
        arr[updateIndex]=value;
    }

    public int getSize(){
        return this.index;
    }
}
