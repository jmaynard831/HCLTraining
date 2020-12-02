package fileHandlingProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		// Init some things we can write to files
		Car c1 = new Car("Pink", 5, 14);
		Car c2 = new Car("Green", 2, 10);
		Car c3 = null, c4 = null;
		String[] blurbs = new String[] { "Hello", "World", "Third", "Apple" };

		// Open a file object stream
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			// We open the file, and save c1 and c2.
			fos = new FileOutputStream("CarList.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(c1);
			oos.writeObject(c2);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("Before reading objects from file:");
		System.out.println("c3 is null? " + (c3 == null));
		System.out.println("c4 is null? " + (c4 == null));

		// lets read those objs back in now
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("CarList.txt");
			ois = new ObjectInputStream(fis);
			c3 = (Car) ois.readObject();
			c4 = (Car) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("After reading objects from file:");
		System.out.println("c3: " + c3.toString());
		System.out.println("c4: " + c4.toString());

		/*
		 * let's append a new object to this file
		 */

		try {
			// append a new car
			oos.writeObject(new Car("Orange", 3, 7));

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * Read from the list again, to confirm appending.
		 */
		try {
			fis = new FileInputStream("CarList.txt");
			ois = new ObjectInputStream(fis);
			c3 = (Car) ois.readObject();
			c4 = (Car) ois.readObject();
			Car c5 = (Car) ois.readObject();

			System.out.println("c5: " + c5);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Close all streams
		try {
			fis.close();
			fos.close();
			oos.close();
			ois.close();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		/*
		 * Now, lets work with text files.
		 */

		try {
			// Make a new file and write our array to it.
			FileWriter fw = new FileWriter("Strings.txt");
			for (String string : blurbs) {
				fw.write(string + "\n");
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Now, read from this file and print
		System.out.println("\nRead Strings from file:");
		File f = new File("Strings.txt");
		try {
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
