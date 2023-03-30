class Temp implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("Closing!");
    }
}


public class twr {
    public static void main(String[] args) {

        Temp temp = new Temp();

        try {
            temp.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
