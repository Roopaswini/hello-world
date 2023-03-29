class   Java {
    public void start() {
        System.out.println("Learning java..");
    }
}

interface Plant {
    public void grow();
}

public class ac {
    
    public static void main(String[] args ) {

        Java java1 = new Java() {
            @Override 
            public void start() {
                System.out.println("Shopping...");
            }
        };

        java1.start();
        
        Plant plant1 = new Plant() {

            @Override
            public void grow() {
                System.out.println("Plant growing");
            }
        };

        plant1.grow();
    }
}
