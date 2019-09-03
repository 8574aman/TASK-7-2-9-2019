import java.io.FileNotFoundException;
import java.io.PrintStream;


public class Three_Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cities [] = {"indore","bhopal","pune","banglore","mumbai","noida"};
		try {
			PrintStream ps = new PrintStream("Cities.txt");
			for(String city:cities)
			ps.append(city+" ");
		ps.close();
		}
		
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
