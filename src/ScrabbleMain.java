import java.util.Scanner;
import java.util.ArrayList;
public class ScrabbleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Board objBoard = new Board();
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Player> listPlayers = new ArrayList<Player>();
		
		System.out.println("Welcome to Scrabble!");
		System.out.println("How many players will there be? ");
		int numOfPlayers = scan.nextInt();
		
		for(int i=0; i < numOfPlayers; i++){
			listPlayers.add(new Player(i));
			objBoard.getTiles(listPlayers.get(i));
		}
		
		boolean notDone = true;
		while(notDone){
			for(int i=0; i < numOfPlayers; i++){
				System.out.println("Player " + (i+1) + " tiles:\n" + listPlayers.get(i).getTiles()
						+ "\n\nBoard:\n" + objBoard.toString() + "\n\n");
				while(objBoard.setLetter(listPlayers)
						objBoard.setLetter(listPlayers.get(i));
				
				
			}
			notDone = false;
		}
		
		
		
	}
}
