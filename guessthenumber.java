
import java.util.*;


class game{
	public int number;
	public int input_number;
	public int number_of_guesses;
	
	
	game() {
		Random rand=new Random();
		this.number=rand.nextInt(100);
	}
	
	
	
	int takeuserinput() {
		System.out.println("please enter a number");
		Scanner sc = new Scanner(System.in) ;
			return input_number=sc.nextInt();
		
	}
	
	
	boolean iscorrectnumber() {
		if (input_number==number) {
			return true;
		}
		else if(input_number<number) {
			System.out.println("too low...");
		}
		else if(input_number>number){
			System.out.println("too high...");
		}
		return false;
		
	}



	public int getNumber_of_guesses() {
		return number_of_guesses;
	}



	public void setNumber_of_guesses(int number_of_guesses) {
		this.number_of_guesses = number_of_guesses;
	}
	
	
	
}



public class guessthenumber {
	public static void main(String args[]) {
		game g=new game();
		boolean b=false;
		while(!b) {
			g.takeuserinput();
		    b=g.iscorrectnumber();
			System.out.println(b);
		}
	}
}