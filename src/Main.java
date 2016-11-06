import java.util.Scanner;
public class Main {
	public static void main (String [] args){
		Scanner imput = new Scanner(System.in);
		float A = imput.nextFloat();
		float  B = imput.nextFloat();
		float C = imput.nextFloat();
		
		float med = (float) (((A * 2) + (B * 3) + (C * 5)) / (2 + 3+5));
		String media = String.format("MEDIA = %,.1f", med);
		
		System.out.print(media + "\n");
	}
}