import java.io.File;
import java.util.Scanner;


public class First_rename_file {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of First file(with Extension) :");
		String fname1 = sc.next();
		System.out.println("RENAME: (with Extension)");
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
	
		if(f2.exists())
		{
			System.out.print("cannot rename file name already present");
			throw new Exception();
		}
		
		if(!f1.isFile())
		{
			System.out.print("this is not a file ");
			throw new Exception();
					
		}
		if(f1.length()>500)
		{
			System.out.print("File size too big (>500bytes)");
			throw new Exception();
			
		}
		
		if(f1.renameTo(f2))
		{
			System.out.println("Successfully updated..");
		}
		
		}
		
		
		catch(Exception e)
		{
			System.out.print("Prog Terminated");
		}
		
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
