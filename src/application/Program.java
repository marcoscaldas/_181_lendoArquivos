package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\G-Fire\\Documents\\Curso Java\\Secoes\\17 Trabalhando com arquivos\\in.txt");
		Scanner sc= null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNext()) {
			System.out.println(sc.nextLine());			
			}
		}
		catch
			(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
				
			}
		}
	}

}
