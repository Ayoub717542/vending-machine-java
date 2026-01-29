import java.util.ArrayList;

public class MyGenericsClass{



    public static void main(String[]args){
        ArrayList list = new ArrayList();

        list.add(24);
        list.add("String");

        String intt= (String) list.get(0);
        Integer str= (Integer) list.get(1);

        System.out.println(intt);
        System.out.println(str);



    }
}