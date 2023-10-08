package tp1.control;

import static tp1.view.Messages.debug;

import java.util.Scanner;

import tp1.logic.Game;
import tp1.logic.Move;
import tp1.view.GamePrinter;
import tp1.view.Messages;

/**
 *  Accepts user input and coordinates the game execution logic
 */
public class Controller {

	private Game game;
	private Scanner scanner;
	private GamePrinter printer;

	public Controller(Game game, Scanner scanner) {
		this.game = game;
		this.scanner = scanner;
		printer = new GamePrinter(game);
	}

	/**
	 * Show prompt and request command.
	 *
	 * @return the player command as words
	 */
	private String[] prompt() {
		System.out.print(Messages.PROMPT);
		String line = scanner.nextLine();
		String[] words = line.toLowerCase().trim().split("\\s+");

		System.out.println(debug(line));

		return words;
	}

	/**
	 * Runs the game logic
	 */
	public void run() {
		
		this.printGame();
		while(true) {
		String[] s=this.prompt();
		switch(s[0]) {
		case "move":s=this.prompt();switch(s[0]) {
		
			case "right": this.game.move(Move.RIGHT);
				break;
			case "left":this.game.move(Move.LEFT);
				break; 
			case"lleft":this.game.move(Move.LLEFT);
				break;
			case"rright":this.game.move(Move.RRIGHT);
				break;
			default:
		}
		this.printGame();
		break;
		case "help": System.out.print(Messages.HELP_LINES);//¿?
			break;
		case"shoot":
			break;
		case"shockwave":
			break;
		case "list":
			break;
		case "reset":
			break;
		case "exit":
			break;
		case"none"://DEFAULT??
			break;
		
		}
		;
	
		}
	}
	/**
	 * Draw / paint the game
	 */
	public void printGame() {
		
		System.out.println(printer);
	}
	
	/**
	 * Prints the final message once the game is finished
	 */
	public void printEndMessage() {
		System.out.println(printer.endMessage());
	}
	
}
