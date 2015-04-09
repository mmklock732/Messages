import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.List;
import java.util.Scanner;


public class Encoder {
	File thisFile = new File("Encoded File");
	char[] words = new char[0];
	
	//constructs an object that can read/write encoded text to/from the specified file
	//file should contain only obfuscated text
	public Encoder(String filename)
	{
		try {
			FileReader reader = new FileReader(filename);
			reader.read(words);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	//writes an encoded version of plaintext to this encoder's file
	public void write(String plaintext)
	{
		try {
			FileWriter writer = new FileWriter(thisFile);
			//encoder?
			writer.write(words, 0, words.length);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//returns a list of encoded strings of text contained in this encoder's file
	public List<String> read()
	{
		return null;
	}
}
