package converter;

public class JsonToXmlImpl implements JsonToXml{


    @Override
    public String convertJsonToXml(String xml) {
     if(xml.equals("<user>")){
         return "user:{}";
     }
     return "{xml}";
    }


    static void main() {
        JsonToXml jsonToXml =new JsonToXmlImpl();
        String s = jsonToXml.convertJsonToXml("<user>");
        System.out.println(s);
    }
}
