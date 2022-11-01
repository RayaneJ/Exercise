package tondeuse;

import java.io.File;

public class Utils {
	public File loadFile() {
	ClassLoader classLoader = this.getClass().getClassLoader();
	 File file=new File(classLoader.getResource("testExemple.txt").getFile());
	 return file;
	}
}
