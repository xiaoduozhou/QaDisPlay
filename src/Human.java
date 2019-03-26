import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Human extends  Animal {
    String educate;
    public Human(String name,int age,String educate){
        super(name,age);
        this.educate = educate;
    }

    public static void gettime(){
        DateFormat df = new SimpleDateFormat("yyyy/mm/dd");
        System.out.println(df.format(new Date()));
        System.out.println("--");
    }

    public static void main(String[] args){
        gettime();
    }
}
