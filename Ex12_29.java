import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex12_29 {

	public static void main(String[] args) {
		Path path = Paths.get("");
		File current = new File(path.toAbsolutePath().toString());
		File[] listOfFiles = current.listFiles();
		for (File f: listOfFiles) {
			if (f.isFile() && !f.isHidden()) {
				String name = f.getName().substring(0, f.getName().indexOf('.'));
				
				if (name.substring(0, 3).equalsIgnoreCase("bla")) {
					if (name.charAt(3) != '0') {
						name = "bla" + 0 + name.substring(3);
					}
				}
				
				f.renameTo(new File(name + f.getName().substring(f.getName().indexOf('.'))));
			}
		}
	}
}
