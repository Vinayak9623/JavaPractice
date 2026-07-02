package array;

public class DynamicArray {
    private int[] arr;
    private int size;

    public DynamicArray(){

        arr=new int[5];
       size=0;
    }

    public void add(int value){

        if(arr.length==size){
            resize();
        }

            arr[size]=value;
        size++;
    }

    public void resize(){
        int[] doubleArray=new int[arr.length*2];

        for(int i=0;i< arr.length;i++){
            doubleArray[i]=arr[i];
        }
         arr=doubleArray;
    }

    public void printElement(){
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+" ");
        }
    }

    static void main() {

        DynamicArray da =new DynamicArray();

        for(int i=0;i<10;i++){
            da.add(i);
        }
        da.printElement();

    }

}
