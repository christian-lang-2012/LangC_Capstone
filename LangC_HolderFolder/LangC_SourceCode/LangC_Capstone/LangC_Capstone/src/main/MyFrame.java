package main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.CommonTokenFactory;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.UnbufferedCharStream;
import org.antlr.v4.runtime.UnbufferedTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

public class MyFrame extends JFrame {

	JLabel label1 = new JLabel("Choose file to compile:");
	JButton fileChooseButton = new JButton();
	JLabel chooserLabel = new JLabel();
	
	public MyFrame(){
		setTitle("File Chooser");
		setSize(300,200);
		setLocation(10,200);
		
		fileChooseButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFileChooser chooser  = new JFileChooser();
				int choice = chooser.showOpenDialog(chooserLabel);
				
				if (choice != JFileChooser.APPROVE_OPTION)
					return;
				
				File chosenFIle = chooser.getSelectedFile();
				analyze(chosenFIle);
			}
		});
		
		add(label1);
		add(fileChooseButton);
		add(chooserLabel);
		
	}
	
	public void analyze(File file){
		String inputFile = file.getName();
		try {
			
			InputStream inputStream = new FileInputStream(inputFile);
			CharStream input = new UnbufferedCharStream(inputStream);
			
			AL_Lexer lexer = new AL_Lexer(input);
			lexer.setTokenFactory(new CommonTokenFactory(true));
			TokenStream tokens = new UnbufferedTokenStream<CommonToken>(lexer);
			AL_Parser parser = new AL_Parser(tokens);
			parser.setBuildParseTree(true);
			ParseTree tree = parser.program();
			
			ParseTreeWalker walker = new ParseTreeWalker();
			walker.walk(new BaseListener(), tree);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
