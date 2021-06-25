import java.io.*;
import java.io.Reader;
import java.io.FileReader;
public class TestClass {
    public static void main(String[] args){
        try{
            InputStreamReader r=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(r);
            FileWriter fw=new FileWriter("H:\\ITI AI-PRO\\Java & UML\\WorkSpace\\Day(3)_Lab_Exercise(1)\\Test.txt");
            BufferedWriter buffer=new BufferedWriter(fw);
            String line;
            do{
               System.out.println("Enter data:");
               line=br.readLine();
               System.out.println("Data is: "+line);
               buffer.write(line);
               buffer.newLine();
            }while(!line.equals("stop"));
            buffer.close();
            fw.close();
            br.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
