import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;


public class Second_Copy {

	public static void main(String[] args) {

		
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of First file(with Extension) :");
		String fname1 = sc.next();
		System.out.println("Enter the name of second File :");
		String fname2 = sc.next();
		sc.close();
		File f1 = new File(fname1);
		File f2 = new File(fname2);
		try{
		if(f1.exists()==false)
		{
			System.out.println("File do not exist :");
			throw new Exception();
		}
	
		if(!f2.exists())
		{
			System.out.print("second file do not exists creating a new file :");
			
		}
		
		if(!f1.isFile())
		{
			System.out.print("this is not a file ");
			throw new Exception();
					
		}
		FileInputStream fis1 = new FileInputStream(f1);
		FileOutputStream fos2 = new FileOutputStream(f2);
		while(fis1.available()!=0)
		{
			int temp = fis1.read();
			fos2.write(temp);
			
		}
		//
		fis1.close();
		fos2.close();
		
		
		}
		
		
		catch(Exception e)
		{
			System.out.print("Prog Terminated");
		}
		
		
		

	}

}
