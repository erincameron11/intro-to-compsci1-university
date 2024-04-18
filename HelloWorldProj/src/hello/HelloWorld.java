// Erin Cameron, COSC1046T, Dr. Saneeha, Sept 8 2021, Hello World Project

package hello;

public class HelloWorld {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello World");
		
	}
}




// BACKUP COSC 3127 ASSIGNMENT PROGRAMMING -- WITH NOTATIONS FOR ENTERING EACH FUNCTION
//package parser;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Scanner;
//
//public class RecursiveDescentParser {
//	// Define single character variables
//	final static char ADD_OP = '+';
//	final static char SUB_OP = '-';
//	final static char MULT_OP = '*';
//	final static char DIV_OP = '/';
//	final static char LEFT_PAREN = '(';
//	final static char RIGHT_PAREN = ')';
//	final static char SEMI = ';';
//	final static char ASSIGN = '=';
//	final static char GREATER = '>';
//	final static char LESS = '<';
//	
//	// Character class variables
//	final static int LETTER = 0; // identifier
//	final static int DIGIT = 1; // integer constant
//	final static int OTHER = 3; // for operations, parenthesis, etc
//	final static int IDENTIFIER = 11; // for variable names
//	final static char INT_CONSTANT = 10; // for integer values
//	final static char IF_CODE = 31; // if statements
//	final static char THEN = 30; // if statements
//	final static char END = 29; // end of a program
//	final static char LOOP = 28; // loop statements
//	final static char PROGRAM = 27; // beginning of a program
//	final static char BEGIN = 26; // beginning of a program
//	final static int EOF = 99; // end of file
//	
//	// Declare variables
//	static int nextToken; // the next numeric char value
//	static int charClass; // the numeric class of the char
//	static int lexLen; // how long a lexeme is
//	static char nextChar;
//	static char lexeme[] = new char[100]; // buffer of 100
//	static FileInputStream file; // the file to be read from
//	static String filename; // the filename
//	static boolean hasProgramBegin = false; // set to true with "program begin" is at beginning of program
//	
//	
//	//<-------------------------------PROGRAM--------------------------------
//	static void program() {
//		// Print that we entered the program function
////		System.out.print("Enter <program>\n");
//		
//		// If the input is "program begin"
//		if(nextToken != PROGRAM) {
//			error();
//		} else {
//			// Pass the program keyword
//			lex();
//			
//			// Look for the second keyword begin
//			if(nextToken != BEGIN) {
//				error();
//			} else {
//				// Pass the begin keyword
//				lex();
//				
//				// Set the hasProgramBegin boolean to true
//				hasProgramBegin = true;
//				
//				// Then call the statement_list function
//				statement_list();
//				
//				// Look for the end keyword
//				if(nextToken != END) {
////					System.out.print("ERROR==>program");
//					error();
//				}
//			}
//		}
//		
//		// Print that we exited the program function
////		System.out.print("Exit <program>\n");
//	}
//	
//	
//	//<-------------------------------STATEMENT_LIST--------------------------------
//	static void statement_list() {
//		// Print that we entered the statement_list function
////		System.out.print("Enter <statement_list>\n");
//		
//		// Parse the first statement
//		statement();
//		
//		// Loop through until the next token is not a ; and statement
//		while(nextToken == SEMI) {
//			// Pass the semicolon
//			lex();
//			
//			// Call the statement function
//			statement();
//		}
//		
//		// Print that we exited the statement_list function
////		System.out.print("Exit <statement_list>\n");
//	}
//	
//	
//	//<-------------------------------STATEMENT--------------------------------
//	static void statement() {
//		// calls the assignment_statement, if_statement, or loop_statement
//		
//		// Print that we entered the statement function
////		System.out.print("Enter <statement>\n");
//		
//		if(nextToken == IF_CODE) {
//			if_statement();
//		} else if(nextToken == LOOP) {
//			loop_statement();
//		} else if(nextToken == IDENTIFIER){
//			assignment_statement();
//		} else if(nextToken == END){
////			System.out.print("ERROR==>statement");
//			error();
//		} 
//		
//		// Print that we exited the statement function
////		System.out.print("Exit <statement>\n");
//	}
//	
//	
//	//<-------------------------------ASSIGNMENT_STATEMENT--------------------------------
//	static void assignment_statement() {
//		// reduces the statement to <variable> = <expression>
//		
//		// Print that we entered <assignment_statement> function
////		System.out.print("Enter <assignment_statement>\n");
//		
//		// Call the variable function
//		variable();
//		
//		if(nextToken != ASSIGN) {
////			System.out.print("ERROR=>assignment_statement");
//			error();
//		} else {
//			// Pass the assign operator
//			lex();
//			
//			// Call the expression function
//			expression();
//		}
//		
//		// Print that we exited <assignment_statement> function
////		System.out.print("Exit <assignment_statement>\n");
//	}
//	
//	
//	//<-------------------------------IF_STATEMENT--------------------------------
//	static void if_statement() {
//		// reduces the statement to if (<logic_expression>) then <statement>
//		
//		// Print that we entered the if_statement function
////		System.out.print("Enter <if_statement>\n");
//		
//		// Ensuring that the first token is an 'if'
//		if(nextToken != IF_CODE) {
////			System.out.print("ERROR=>if_statement");
//			error();
//			
//		// Otherwise, we have an 'if', get the next token
//		} else {
//			lex();
//			
//			// Look for the left parenthesis
//			if(nextToken != LEFT_PAREN) {
//				error();
//			} else {
//				// Pass the left parenthesis
//				lex();
//				
//				// Call the function for logic_expression in the if brackets
//				logic_expression();
//				
//				if(nextToken != RIGHT_PAREN) {
////					System.out.print("ERROR=>if_statement");
//					error();
//				} else {
//					// Pass the right parenthesis
//					lex();
//					
//					// Look for the 'then' keyword
//					if(nextToken != THEN) {
////						System.out.print("ERROR=>if_statement");
//						error();
//					} else {
//						// Pass the 'then' keyword
//						lex();
//						
//						// Call the statement function
//						statement();
//					}
//				}
//			}
//		}
//		// Print that we exited the if_statement function
////		System.out.print("Exit <if_statement>\n");
//	}
//	
//	
//	//<-------------------------------LOOP_STATEMENT--------------------------------
//	static void loop_statement() {
//		// reduces the statement to loop (<logic_expression>) <statement>
//		
//		// Print that we entered the loop_statement function
////		System.out.print("Enter <loop_statement>\n");
//		
//		if(nextToken != LOOP) {
////			System.out.print("ERROR=>loop_statement");
//			error();
//		} else {
//			// Pass the loop keyword
//			lex();
//			
//			// Look for the left parenthesis
//			if(nextToken != LEFT_PAREN) {
////				System.out.print("ERROR=>loop_statement");
//				error();
//			} else {
//				// Pass the left parenthesis
//				lex();
//				
//				// Call the logic_expression function
//				logic_expression();
//				
//				// Look for the right parenthesis
//				if(nextToken != RIGHT_PAREN) {
////					System.out.print("ERROR=>loop_statement");
//					error();
//				} else {
//					// Pass the right parenthesis
//					lex();
//					
//					// Call the statement function
//					statement();
//				}
//			}
//		}
//		// Print that we exited the loop_statement function
////		System.out.print("Exit <loop_statement>\n");
//	}
//	
//	
//	//<-------------------------------VARIABLE--------------------------------
//	static void variable() {
//		// reduces the statement to an identifier
//		
//		// Print that we entered the variable function
////		System.out.print("Enter <variable>\n");
//		
//		// Retreive the next token
//		lex();
//		
//		// Print that we exited the variable function
////		System.out.print("Exit <variable>\n");
//	}
//	
//	
//	//<-------------------------------EXPRESSION--------------------------------
//	// Parses strings in the language generated by the rule:
//	// 		<expr> -> <term> {(+ | -) <term>} */
//	static void expression() {
//		// Print out that we are entering the expression function
////		System.out.print("Enter <expression>\n");
//		
//		// Parse the first term
//		term();
//		
//		// Loop through until the next token is not a + or -
//		while(nextToken == ADD_OP || nextToken == SUB_OP) {
//			lex();
//			term();
//		}
//		
//		// Print out that we are exiting the expression function
////		System.out.printf("Exit <expression>\n");
//	}
//	
//	
//	//<-------------------------------TERM--------------------------------
//	// Parses strings in the language generated by the rule:
//		// <term> -> <factor> {(*|/) <factor>}
//	static void term() {
//		// Print out that we are entering the term function
////		System.out.print("Enter <term>\n");
//		
//		// Parse the first factor
//		factor();
//		
//		// Loop through until the next token is not a * or /
//		while(nextToken == MULT_OP || nextToken == DIV_OP) {
//			lex();
//			factor();
//		}
//		
//		// Print out that we are exiting the term function
////		System.out.printf("Exit <term>\n");
//	}
//	
//	
//	//<-------------------------------FACTOR-------------------------------- 
//	// Parses strings in the language generated by the rule:
//		// <factor> -> id | int_constant | (expr)
//	static void factor() {
//		// Print out that we are entering the factor function
////		System.out.print("Enter <factor>\n");
//		
//		// If the next token is an integer literal or identifier
//		if(nextToken == IDENTIFIER || nextToken == INT_CONSTANT) {
//			// Then we need to locate the next token in the stream
//			lex();
//			
//		// Otherwise, the token is  ( <expression> ) we need to 
//		// check for the left parenthesis, expression in middle, and
//		// right parenthesis
//		} else {
//			if(nextToken == LEFT_PAREN) {
//				// Call lex to pass by the left parenthesis
//				lex();
//				
//				// Call the expression function for the middle expression
//				expression();
//				
//				// Then we should have a right parenthesis to close it off
//				// if not, then there is an error
//				if(nextToken == RIGHT_PAREN) {
//					lex();
//				} else {
////					System.out.print("ERROR=>factor");
//					error();
//				} 
//			} else {
////				System.out.print("ERROR=>factor");
//				error();
//			}
//		}
//		// Print that we are exiting the factor function
////		System.out.print("Exit <factor>\n");
//	}
//		
//	
//	//<-------------------------------LOGIC_EXPRESSION--------------------------------
//	static void logic_expression() {
//		// reduces the statement to <variable> (<|>) <variable>
//		
//		// Print out that we are entering the logic_expression function
////		System.out.print("Enter <logic_expression>\n");
//		
//		// Parse the first variable
//		variable();
//		
//		// Looking for the next token to be a > or <
//		if(nextToken == GREATER || nextToken == LESS) {
//			// Pass the character by
//			lex();
//			
//		// Otherwise, there is an error
//		} else {
////			System.out.print("ERROR=>logic_expression");
//			error();
//		}
//		
//		// Parse the second variable
//		variable();
//		
//		// Print that we are exiting the logic_expression function
////		System.out.print("Exit <logic_expression>\n");
//		
//	}
//	
//	
//	//<-------------------------------LEX--------------------------------
//	static int lex() {
//		// Print that we entered the lex function
////		System.out.print("Enter <lex>\n");
//		
//		// Reset the lexeme buffer each run
//		lexeme = new char[100];
//		lexLen = 0;
//		
//		// Pass any whitespace or newline characters
//		getNonBlank();
//		
//		switch(charClass) {
//			/* -----LETTER CHARCLASS----- */
//			case LETTER: 
//				addChar();
//				getChar();
//				
//				// Loop through until a non-letter or non-digit appear
//				while(charClass == LETTER || charClass == DIGIT) {
//					addChar();
//					getChar();
//				}
//				
//				// Get the lexeme value and trim the leading or trailing whitespaces
//				String lex = getLex().trim();
//				
//				// Check if the phrase is any of the keywords
//				if("program".equals(lex)) {
//					addChar();
//					nextToken = PROGRAM;
//				} else if("begin".equals(lex)) {
//					addChar();
//					nextToken = BEGIN;
//				} else if("if".equals(lex)) {
//					addChar();
//					nextToken = IF_CODE;
//				} else if("end".equals(lex)) {
//					addChar();
//					nextToken = END;
//				} else if("loop".equals(lex)) {
//					addChar();
//					nextToken = LOOP;
//				} else if("then".equals(lex)) {
//					addChar();
//					nextToken = THEN;
//				} else {
//					nextToken = IDENTIFIER;
//				}
//				
//				break;
//				
//			/* -----DIGIT CHARCLASS----- */
//			case DIGIT:
//				addChar();
//				getChar();
//				
//				// Loop through until the next char is not a digit
//				while(charClass == DIGIT) {
//					addChar();
//					getChar();
//				}
//				nextToken = INT_CONSTANT;
//				break;
//				
//			/* -----OTHER CHARCLASS----- */
//			case OTHER:
//				lookup(nextChar);
//				getChar();
//				break;
//				
//			/* -----EOF CHARCLASS----- */
//			case EOF:
//				nextToken = EOF;
//				lexeme[0] = 'E';
//				lexeme[1] = 'O';
//				lexeme[2] = 'F';
//				lexeme[3] = 0;
//				break;
//		}
//		
//		String lex = getLex().trim();
//		System.out.printf("The next token is: %d\tThe next lexeme is: %s\n", nextToken, lex);
//		
//		// Print that we exited the lex function
////		System.out.print("Exit <lex>\n");
//		
//		return nextToken;
//	}
//	
//	
//	//<-------------------------------LOOKUP--------------------------------
//	// To determine the code for single special characters
//	static int lookup(char c) {
//		switch(c) {
//			case '(':
//				addChar();
//				nextToken = LEFT_PAREN;
//				break;
//			case ')':
//				addChar();
//				nextToken = RIGHT_PAREN;
//				break;
//			case '+':
//				addChar();
//				nextToken = ADD_OP;
//				break;
//			case '-':
//				addChar();
//				nextToken = SUB_OP;
//				break;
//			case '*':
//				addChar();
//				nextToken = MULT_OP;
//				break;
//			case '/':
//				addChar();
//				nextToken = DIV_OP;
//				break;
//			case ';':
//				addChar();
//				nextToken = SEMI;
//				break;
//			case '=':
//				addChar();
//				nextToken = ASSIGN;
//				break;
//			case '>':
//				addChar();
//				nextToken = GREATER;
//				break;
//			case '<':
//				addChar();
//				nextToken = LESS;
//				break;
//			default:
//				addChar();
//				nextToken = EOF;
//				break;
//		}
//		return nextToken;
//	}
//	
//	
//	//<-------------------------------GETNONBLANK--------------------------------
//	static void getNonBlank() {
//		// While the next input is a whitespace, continue past it
//		while(Character.isWhitespace(nextChar)) {
//			getChar();
//		}
//	}
//	
//	
//	//<-------------------------------ADDCHAR--------------------------------
//	static void addChar() {
//		if(lexLen <= 98) {
//			lexeme[lexLen++] = nextChar;
//			lexeme[lexLen] = 0;
//		} else {
//			System.out.print("Error! The lexeme has exceeded the buffer space.");
//			error();
//		}
//	}
//	
//	
//	//<-------------------------------GETCHAR--------------------------------
//	static void getChar() {
//		// If it is not EOF
//		try {
//			if((nextChar = (char)file.read()) != EOF) {
//				if(Character.isAlphabetic(nextChar)) {
//					charClass = LETTER;
//				} else if(Character.isDigit(nextChar)) {
//					charClass = DIGIT;
//				} else {
//					charClass = OTHER;
//				}
//			} else {
//				charClass = EOF;
//			}
//		} catch (IOException e) {
//			System.out.print("Error - getChar() file read error.\n");
//			e.printStackTrace();
//		} 
//	}
//	
//	
//	//<-------------------------------GETLEX--------------------------------
//	// Method to get the String value out of the lexeme buffer array
//	static String getLex() {
//		String lex = "";
//		for(int i = 0; i < lexeme.length; i++) {
//			lex = lex + lexeme[i];
//		}
//		return lex;
//	}
//		
//	
//	//<-------------------------------ERROR--------------------------------
//	static void error() {
//		System.out.print("\nError in file " + filename + " - program terminating.\nThe "
//				+ "program is NOT correct, there is a syntax error.\n");
//		System.exit(1);
//	}
//		
//		
//	
//	
//	//<-------------------------------MAIN--------------------------------
//	// Main Method to run the program
//	public static void main(String[] args) {
//		// Create a Scanner
//		Scanner input = new Scanner(System.in);
//		
//		// Prompt the user to enter the filename
//		System.out.print("Enter the filename you wish to test: ");
//		filename = input.next() + ".txt";
//		
//		// PERSONAL TEST FILES
////		String filename = "test-exceedbuffer.txt";
////		String filename = "test-if.txt";
////		String filename = "test-loop.txt";
////		String filename = "test-assign.txt";
////		String filename = "test-startandend.txt";
//		
//		// ASSIGNMENT TEST FILES
////		String filename = "NoErrors.txt";
////		String filename = "MissingThen.txt";
////		String filename = "BeginMissing.txt";
////		String filename = "ExtraSemicolon.txt";
////		String filename = "IfMisspelled.txt";
////		String filename = "SemicolonMissing.txt";
//		
//		try {
//			// Open the txt file
//			file = new FileInputStream(
//					"./src/parser/" + filename);
//			
//			// If the file is null/nonexistent
//			if(file == null) {
//				System.out.print("The file cannot be opened or does not exist.");
//			
//			// Else, process the file contents
//			} else {
//				getChar();
//				
//				do {
//					lex();
//					
//					// If we have hit a PROGRAM lexeme
//					if(nextToken == PROGRAM) {
//						program();
//					}
//					
//					// If the "program begin" keywords did not exist
//					if(!hasProgramBegin) {
//						error();
//					}
//				} while(nextToken != EOF);
//				
//				// If we make it to this point without any errors,
//				// display a success message
//				System.out.print("\nCONGRATS! The program is correct, there are no syntax errors in file '" + filename + "'\n");
//			}
//			
//		// Catch if the file does not exist
//		} catch (IOException e) {
//			System.out.print("File: " + filename + " does not exist.\n");
//			e.printStackTrace();
//		}
//		
//		// Close the input
//		input.close();
//	}
//}
