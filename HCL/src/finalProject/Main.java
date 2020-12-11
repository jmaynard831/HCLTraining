package finalProject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static String path = System.getProperty("user.dir") + "\\finproFolder";

	public static void main(String[] args) {
		System.out.println("Jacob Maynard\nLocker Prototype\nPhase 1 End Project");
		// Make the directory for the project to play in
		File f = new File(path);
		f.mkdirs();

		// Call topMenu and start the flow.
		topMenu();
	}

	private static void topMenu() {
		String topMenu = "Select one:\n1. List Files\n2. Edit Files\n3. Exit App";
		System.out.println(topMenu);
		int selection = 0;
		try {
			selection = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			topMenu();
		}

		switch (selection) {
		case 1:// DONE - it lists all files in the dir.
			System.out.println("Listing files:");
			listDir();
			topMenu();
			break;
		case 2:
			System.out.println("Editing files:");
			editFileMenu();
			break;
		case 3:
			System.out.println("Exiting Application.");
			closeApp();
			break;
		default:
			topMenu();
			break;
		}

	}

	private static void editFileMenu() {
		String editMenu = "1. Add File\n2. Delete File\n3. Search File\n4. Return";
		System.out.println(editMenu);

		int selection = 0;
		try {
			selection = Integer.parseInt(sc.nextLine());
		} catch (Exception e) {
			editFileMenu();
		}

		switch (selection) {
		case 1:
			System.out.println("add file");
			addFile();
			editFileMenu();
			break;
		case 2:
			System.out.println("Delete file");
			deleteFile();
			editFileMenu();
			break;
		case 3:
			System.out.println("search file");
			searchFile();
			editFileMenu();
			break;
		case 4:
			System.out.println("Return to main menu");
			topMenu();
			break;
		default:
			editFileMenu();
			break;
		}

	}

	private static void searchFile() {
		// take a file name (case sensitive)
		// lets start with just making a file with a name
		System.out.println("Please enter a filename:");
		// We do need to scrub this filename:
		String filename = null;
		try {
			filename = sc.nextLine();
			filename = (filename.length() == 0) ? filename += "_" : filename;
		} catch (Exception e1) {
			System.out.println("Invalid file name.");
			searchFile();
		}

		// confirm file existence
		File f = new File(path + "\\" + filename);
		// print result
		if (f.exists()) {
			System.out.println(filename + " exists.");
		} else {
			System.out.println(filename + " does not exist.");
		}
	}

	private static void deleteFile() {
		// take a file name. (case sensitive)
		System.out.println("Please enter a filename:");
		// We do need to scrub this filename:
		String filename = null;
		try {
			filename = sc.nextLine();
			filename = (filename.length() == 0) ? filename += "_" : filename;
		} catch (Exception e1) {
			System.out.println("Invalid file name.");
			searchFile();
		}

		// Confirm that the file exists.
		File f = new File(path + "\\" + filename);
		// print result
		if (f.exists()) {
			System.out.println(filename + " will be deleted.");
		} else {
			System.out.println(filename + " does not exist.");
		}

		// then, delete it.
		if (f.delete()) {
			System.out.println(filename + " was deleted.");
		} else {
			System.out.println(filename + " wasn't deleted.");
		}
		// print confirmation and return to editfilemenu
	}

	private static void addFile() {
		// lets start with just making a file with a name
		System.out.println("Please enter a filename:");
		// We do need to scrub this filename:
		String filename = null;
		try {
			filename = sc.nextLine();
			filename = filename.replaceAll("\\W+", "x");
		} catch (Exception e1) {
			System.out.println("Invalid file name.");
			addFile();
		}
		File f = new File(path + "\\" + filename + ".txt");
		try {
			if (f.createNewFile()) {
				System.out.println(filename + ".txt was created!");
				// System.out.println(f.getPath());
			} else {
				System.out.println(filename + ".txt FAILED file creation!");
			}
		} catch (IOException e) {
			System.out.println("File creation failed. Please try again.");
			System.out.println(filename);
			editFileMenu();
		}

		// And here is where we would put all the file writing stuff
		// but lets do that later.

	}

	private static void closeApp() {
		sc.close();
		System.exit(0);
	}

	private static void listDir() {
		// List all files in the current dir.
		File f = new File(path);
		//String[] p = f.list();
		List<String> list = new ArrayList<String>(Arrays.asList(f.list()));
		if (list.size() > 0) {
			list.stream().sorted().forEach(System.out::println);
		} else {
			System.out.println("No files in the Directory yet.");
		}
		System.out.println();

	}

}
