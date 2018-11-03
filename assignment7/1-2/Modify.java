import java.io.*;

public class Modify {
	public static void parse(File file) throws IOException {
		   RandomAccessFile input = null;
		   String line = null;
		   try {
		       input = new RandomAccessFile(file, "r");
		       while ((line = input.readLine()) != null) {
		           System.out.println(line);
		       }
		       return;
		       
		   } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } 
		   finally {
		       if (input != null) {
		           input.close();
		       }
		   }
		}
}
