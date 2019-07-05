import java.util.Scanner;

public class loops { 
	
	static void dowhileloop() {
		int count = 1;
        do {
            System.out.println("Count = " + count);
            count++;
        } while (count < 11);
    }
	
	static void forloop() {
		for (int count = 1; count < 11; count++) {
		System.out.println("Count = " + count);
		}
		}
	
	static void whileloop() {
		int count = 1;
		while (count < 11) {
			System.out.println("Count = " + count);
		  count++;
		}
		}
public static void main(String args[]){ 
	Scanner input = new Scanner(System.in);
	System.out.println("Choose your favorite loop! (for/dowhile/while)");
	String loop = input.next();
	
	if (loop.equals("for")) {
		forloop();
	} 
	if (loop.equals("dowhile")) {
		dowhileloop();
	} 
	if (loop.equals("while")) {
		whileloop();
	} 
	}
}