import java.io.*;
import java.util.Scanner;

public class WordCount {
   public static void main(String[] args)
         throws IOException {
      File file = new File("C:\\CSI 2300\\CountWords\\Words.txt");
      FileInputStream fileInputStream = new FileInputStream(file);
      InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
      BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
      Scanner sc = new Scanner(System.in);

      String line;
      int wordCount = 0;

      while ((line = bufferedReader.readLine()) != null) {
         String words[] = line.split("\\s+");
         wordCount += words.length;

      }

      System.out.println("Total word count = " + wordCount);

      System.out.println("Please name the output conatainer file(.txt): ");
      String outFileName = sc.nextLine();

      try {

         FileReader fr = new FileReader("Words.txt");

         FileWriter fw = new FileWriter(outFileName);

         String str = "";

         int i;

         while ((i = fr.read()) != -1) {

            str += (char) i;
         }

         fw.write(str);

         fr.close();
         fw.close();

         System.out.println("File reading and writing both done");
      }

      catch (IOException e) {
         System.out.println("There are some IOException");
      }

      bufferedReader.close();
      sc.close();
   }
}
