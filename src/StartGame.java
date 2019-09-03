import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class StartGame {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mode 1 For New Game, 2 For Resuming Previous One : ");
		int ch=sc.nextInt();
		System.out.println("Horizontal Move : ");
		int x=sc.nextInt();
		System.out.println("Vertical Move : ");
		int y=sc.nextInt();
		System.out.println("Space Move : ");
		int z=sc.nextInt();
		Game g=null;
		
		if(ch==1){
			g=new Game();
		}else{
			//read the object from file
			
			FileInputStream fis=new FileInputStream("E:/worldpay training/JAVA");
			ObjectInputStream ois=new ObjectInputStream(fis);
			g=(Game) ois.readObject();
			
		}
		
		g.moveH(x); g.moveV(y);g.moveS(z);
		g.showPos();
		
		System.out.println("Saved!");
		
		FileOutputStream fos=new FileOutputStream("E:/worldpay training/JAVA");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(g);
		oos.close(); fos.close();
		System.out.println("game closed!");
		
		
		
		
		
		
		

	}

}
