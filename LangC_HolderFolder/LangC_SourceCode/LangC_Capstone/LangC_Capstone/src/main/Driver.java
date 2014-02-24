package main;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenFactory;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;
import org.antlr.v4.runtime.UnbufferedTokenStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Driver {

	public static void main(String[] args) {
		
		String inputFile = "AL_Sample.txt";
		try {
			
			InputStream inputStream = new FileInputStream(inputFile);
			CharStream input = new UnbufferedCharStream(inputStream);
			
			AL_Lexer lexer = new AL_Lexer(input);
			lexer.setTokenFactory(new CommonTokenFactory(true));
			TokenStream tokens = new UnbufferedTokenStream<CommonToken>(lexer);
			AL_Parser parser = new AL_Parser(tokens);
			parser.setBuildParseTree(false);
			System.out.println(parser.program());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
