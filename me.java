import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

import javafx.scene.text.Text;





public class me {
    public static void main(String[] args) {
        Test Test = new Test();

        /* 
        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse command file. ");
        }
        */

        /* 
        try {
            test.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        */

        try {
            Test.run();
            } catch (IOException e) {
                e.printStackTrace();
        }

        try {
            Test.input();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } 

        try {
            Test.input();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}