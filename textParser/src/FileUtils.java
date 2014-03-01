import java.io.File;

public class FileUtils {
	public static void main(String[] args) {
		String directoryInPath = "/text/";
		String directoryOutPath = "/text/";
		
		File[] files = new File(directoryInPath).listFiles();

		try {
			for (File file : files)
				FileParser.readToBuffer(directoryInPath + file.getName(), directoryOutPath + file.getName());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}

	}
}
