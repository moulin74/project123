import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
        File f = new File("d:\\one.txt");
        String line;
        {
        try
        {
        FileReader fr = new FileReader(f);
        BufferedReader f1 = new BufferedReader(fr);
        
        while ((line = f1.readLine()) != null)
        {
            String[] row =line.split(",");
            
            for(String index:row){
            System.out.printf("%-10s",index);
        }
            System.out.println();
        }
        f1.close();
        }   
        catch(Exception e)
        {
            System.out.println(e);
        }
        }
    }
}
