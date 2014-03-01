import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class FileParser {
	public static void readToBuffer(String inputFilePath, String outputFilePath) throws IOException {
		InputStream is = new FileInputStream(inputFilePath);
		StringBuffer resText = new StringBuffer();
		
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        line = reader.readLine();
        while (line != null) {
        	
        	String[] res = null;
        	if (line.contains("#")) {
        		res = line.split("#");
        		//System.out.println(res[0]);
        		line = res[0];
        	}
        	
        	if (line.contains(".jpg") || line.contains(".png") || line.contains(".JPG") || line.contains(".PNG")) {
        		//System.out.println(line);
        		line = reader.readLine();
        		continue;
        	}
        	if (line != null) resText.append(line+'\n');
        	line = reader.readLine();
        }
        writeToFile(outputFilePath, resText);
        //System.out.print(resText.toString());
        reader.close();
        is.close();
	}
	
	public static void writeToFile(String pFilename, StringBuffer pData) throws IOException {  
        BufferedWriter out = new BufferedWriter(new FileWriter(pFilename));  
        out.write(pData.toString());  
        out.flush();  
        out.close();  
    }  
}
