

public class A {
    char a='R';
    static String b = "james";
    boolean M1()
    {
        System.out.print("M1()");
        return false;
    }

    public static void main(String[] args) {
        A obj = new A();
        System.out.print(obj.M1());
        System.out.print(b);
        System.out.print(obj.a);
    }
    
}
