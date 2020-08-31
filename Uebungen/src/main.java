import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;
public class main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int zeile, spalte;
		
		for (zeile = 1; zeile <= 5; zeile++) {
			for (spalte = 1; spalte <= zeile; spalte++)
				System.out.print("*");
			System.out.println();
		}

}

}
