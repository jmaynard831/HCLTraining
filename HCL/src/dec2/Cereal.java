package dec2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Cereal {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account a = new Account(80,400);

		FileOutputStream fos = new FileOutputStream("cereal.txt");

		ObjectOutputStream o = new ObjectOutputStream(fos);
		
		o.writeObject(a);
		
		o.close();
		fos.close();

		FileInputStream fis = new FileInputStream("cereal.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Account ex = (Account) ois.readObject();
		
		System.out.println(ex.toString());
		
		
	}

}
