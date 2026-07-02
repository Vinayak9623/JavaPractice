package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeReport {

    private int id;
    private String name;
    private String city;


    public EmployeeReport(){

    }
    public EmployeeReport(int id,String name,String city){
        this.id=id;
        this.name=name;
        this.city=city;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setCity(String city){
        this.city=city;
    }
    public String getCity(){
        return city;
    }

    @Override
    public String toString() {
        return "EmployeeReport{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    static void main() {

        findBooksBuAuthor();
        //learnGroupBy();
    }


    public static void learnGroupBy(){

        List<EmployeeReport> list=new ArrayList<>();
        list.add(new EmployeeReport(1,"Vinayak","Beed"));
        list.add(new EmployeeReport(2,"DD","Beed"));
        list.add(new EmployeeReport(3,"Afrid","Kolhpur"));
        list.add(new EmployeeReport(4,"Avinash","Beed"));
        list.add(new EmployeeReport(5,"Guru","Karad"));
        list.add(new EmployeeReport(6,"Shubham","Solapur"));
        list.add(new EmployeeReport(7,"Madhav","Beed"));
        Map<String,List<EmployeeReport>> map=new HashMap<>();
        EmployeeReport emp =new EmployeeReport();

        for(EmployeeReport e:list){
            String city = e.getCity();
            if(!map.containsKey(city)){
                map.put(city,new ArrayList<>());
            }
            map.get(city).add(e);
        }
        for(Map.Entry<String,List<EmployeeReport>> z:map.entrySet()){
            System.out.println(z.getKey()+":"+z.getValue());
        }
    }


    public static void findBooksBuAuthor(){
        Map<String,String> map =new HashMap<>();
        map.put("tp","Vinayak");
        map.put("tp1","Madhav");
        map.put("Java","Vinayak");
        map.put("Spring","Madhav");
        map.put("sap","Avinash");
        map.put("Hibernate","Madhav");
        map.put("Rest","Vinayak");
        System.out.println(map);

         Map<String,List<String>> listOfBooksByAuthor=new HashMap<>();

        for(Map.Entry<String,String> x: map.entrySet()){
            String book=x.getKey();
            String author=x.getValue();

            listOfBooksByAuthor.computeIfAbsent(author,k->new ArrayList<>()).add(book);

//            if(!listOfBooksByAuthor.containsKey(author)){
//
//                listOfBooksByAuthor.put(author,new ArrayList<>());
//            }
//
//            listOfBooksByAuthor.get(author).add(book);
        }

        System.out.println(listOfBooksByAuthor);
    }


}
