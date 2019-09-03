import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;


public class Four_SplitData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name to split");
		String s= sc.next();
		System.out.println("Enter no. of tokens :");
		int n = sc.nextInt();
		File f1 = new File(s+".txt");
		try{
			if(f1.exists()==false)
			{
				System.out.println("File do not exist :");
				throw new Exception();
			}
				
			FileInputStream fis = new FileInputStream(f1);
			byte b[] = new byte[(int)f1.length()];
			fis.read(b);
			int len = (int)f1.length();
			File dir = new File("Split"+s);
			dir.mkdir();
			int rem = len%n;
			len = len /n;
			for(int i=0;i<n;i++)
			{
				int size=len;
				if(i==n-1)
				{size=size+rem;}
				File fx = new File("Split"+s+"//"+s+i+".txt");
				FileOutputStream fos = new FileOutputStream(fx);
				fos.write(b,len*i,size);
				
				
			}
			
			
	
			
		
	
			}
			
			
			catch(Exception e)
			{
				e.printStackTrace();
			}
		
		
		
	}

}
