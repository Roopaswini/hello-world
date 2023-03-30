class person {
    String name;
    int age;

    void speak() {
        System.out.println("Hello");
    }
}

public class method {
    
    public static void main(String[] args) {

        //create a Person object using the Person class
        person person1 = new person();
        person1.name = "Shobha";
        person1.age = 50;

        //Create a second Person object
        person person2 = new person();
        person2.name = "Aswath";
        person2.age = 54;
        person2.speak();

        System.out.println(person2.name);
    }
}
