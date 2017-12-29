package AutoCloseableDiscussed;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResourceExample {

    /**
     * @param args Take an input from a user and store it in a string
     */


    public static void main(String[] args) throws IOException {

        System.out.println("Please input ");
        ReadInputFromUserPriorJava7();
        ReadInputFromUserInJava7();
    }

    public static void ReadInputFromUserPriorJava7() {
        BufferedReader br = null;
        String str = "";
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            try {
                br.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
        System.out.println(str);
    }

    /**
     * @throws IOException This is also called as Try with Resource
     */
    public static void ReadInputFromUserInJava7() throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br.readLine();
            System.out.println(str);
        }
    }
}
