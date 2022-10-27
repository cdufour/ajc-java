import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

class App
{
    public static void main(String[] args) {
        System.out.println("How many passwords must be generated ?");
        Scanner scan = new Scanner(System.in);
        int num_pass = Integer.parseInt(scan.nextLine());

        try {
            FileWriter file = new FileWriter("passList.txt");
            
            for (int i=0; i<num_pass; i++) {
                file.write("tmp_password\n");
            }    
            
            file.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
    }
}