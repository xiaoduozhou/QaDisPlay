public class Animal implements Talking{
    String name;
    int age;

    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public void saying(){
        System.out.println("hello animal");
    }
}
