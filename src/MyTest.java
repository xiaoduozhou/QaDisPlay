import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.Map;

public class MyTest {
    static void  print(String a){
        System.out.println(a);
    }
    public static void demo(){
        try{
            int k=2;
            k = k/0;
        }catch(Exception e){
            print(e.getMessage());
        }finally {
            print("33333");
        }

    }
    public static void main(String[] args){
        Map<String,String> map = new HashMap<String,String>();
        demo();
        System.out.println("222");
//        for(int i=0;i<10;i++){
//            map.put(String.valueOf(i),String.valueOf(i));
//        }
//
//        for(Map.Entry<String,String> a :map.entrySet()){
//            System.out.println(a.getKey()+" "+a.getValue());
//        }
    }
}
