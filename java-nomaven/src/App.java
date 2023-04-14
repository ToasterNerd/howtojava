import lombok.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        MyClass myClass = new MyClass();
        myClass.setName("Lombok");
        System.out.println(myClass.getName());
    }


    @Getter
    @Setter
    static class MyClass {
        private String name;
    }
}


