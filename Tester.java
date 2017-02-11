import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Tester {
	static String str = "";

	public static void main(String[] args) throws IOException {
//		Path path = Paths.get("");
		File current = new File("mkdir");
		System.out.println(current.exists());
		current.mkdir();
//		System.out.println(current.getFreeSpace());
//		current.mkdir();
		
		
//		File[] listOfFiles = current.listFiles();
//		for (File f: listOfFiles) {
////			System.out.println(f.getName());
////			f.delete();
//		}
		
//		File f = new File("");
//		System.out.println(f.getAbsolutePath());
		
		
		
//		try { 
//            str += "a";
//    		throw new Exception(); 
//  	  } catch (Exception e){
//    		str += "b";
//  	  } finally {
//		str += "c";
//   		badMethod(); 
//		str += "d";
//  	  } 
//  	  System.out.println(str);
}

static void badMethod() {
	throw new NullPointerException();
}

}

class Cir {
	int r;
	
	Cir(int r) throws CirException {
		setR(r);
	}
	
	void setR(int r) throws CirException {
		if (r < 0) throw new CirException();
		this.r = r;
	}
}

class CirException extends Exception {
	CirException() {
		super("negative radius");
	}
	
}
