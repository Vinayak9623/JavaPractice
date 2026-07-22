package dsa.array.adt;

public class ArrayOperation {

    static void main() {
        ArrayAdt array=new ArrayAdt(10);
        array.insert(10);
        array.insert(20);
        array.insert(30);
        array.insert(50);
        array.traverse();
        System.out.println("-----------------------------------------------------------");
        System.out.println(array.serchElement(10));
        System.out.println("-----------------------------------------------------------");
        System.out.println(array.get(3));
        System.out.println("-----------------------------------------------------------");
        array.update(3,1);
        System.out.println("-----------------------------------------------------------");
        array.delete(2);
        System.out.println("-----------------------------------------------------------");
        array.traverse();

    }
}
