package main;

import java.io.File;
import java.io.IOException;

import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ANTLRFileStream;

public class Driver {

	public static void main(String[] args) {
		
		try {
			ANTLRFileStream fileStream = new ANTLRFileStream("AL_Sample.txt");
			
			AL_Lexer lexer = new AL_Lexer(fileStream);
			
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
