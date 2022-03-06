package swati.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
public static void main(String[] args) {
	File myfile =new File("Information.txt");
	try {
	if(myfile.createNewFile()) {
		System.out.println("File created successfully");
	}
	else {
		System.out.println("File creation error");
	}
		
}catch (IOException ex) {
	System.err.println(" File error...");
}
}
}