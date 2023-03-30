class A {
    String name;
    int age;
    public char[] a;

    void speak() {
        System.out.println("My name is: + name");
    }

    public char[] M1() {
        return null;
    }
}

public class grv {

    public static void main(String[] args) {
        A A1 = new A();

        A1.name = "Roopa";
        A1.age = 22;

        A1.speak();
    }
    
}
