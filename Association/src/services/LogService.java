package services;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogService {
	private String path;
	private File fichier;
	private BufferedWriter out;
	
	public LogService(String path) throws IOException {
		this.path = path;
		fichier = new File(path);
		fichier.createNewFile();
		out = new BufferedWriter(new FileWriter(path,true));
	}
	
	public void writeToLog(String statut, String message) throws IOException {
		/*FORMAT DATE*/
		LocalDateTime myDateObj = LocalDateTime.now();
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedDate = myDateObj.format(myFormatObj);
		
		out.write("["+formattedDate+"]["+statut.toUpperCase()+"]-"+message);
		out.newLine();
	}
	
	public void closeLogFile() throws IOException {
		out.close();
	}

}
