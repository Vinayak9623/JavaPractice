package java8.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestOrderCustomer {

    int customerId;
    int orderId;

    public HighestOrderCustomer(int customerId,int orderId){
        this.customerId=customerId;
        this.orderId=orderId;
    }

    @Override
    public String toString() {
        return "HighestOrderCustomer{" +
                "customerId=" + customerId +
                ", orderId=" + orderId +
                '}';
    }

    public static List<HighestOrderCustomer> besicSetup(){

        ArrayList<HighestOrderCustomer> list = new ArrayList<>();
        list.add(new HighestOrderCustomer(1,3));
        list.add(new HighestOrderCustomer(1,5));
        list.add(new HighestOrderCustomer(2,1));
        list.add(new HighestOrderCustomer(3,3));
        list.add(new HighestOrderCustomer(4,3));
        list.add(new HighestOrderCustomer(5,5));

        return list;
    }
    static void main() {
        List<HighestOrderCustomer> highestOrderCustomers = besicSetup();
        System.out.println(highestOrderCustomers);
        highOrderCustomer();
    }

    public static void highOrderCustomer(){
        List<HighestOrderCustomer> highestOrderCustomers = besicSetup();
        Map<Integer,Integer> map =new HashMap<>();

        for(HighestOrderCustomer h:highestOrderCustomers){

            if(map.containsKey(h.customerId)){
                map.put(h.customerId, map.get(h.customerId)+1);
            }
            else {
                map.put(h.customerId,1);
            }
        }


    }
}
