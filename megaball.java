import java.io.*;
import java.util.*;

public class megaball {
	public static void main(String[] args) throws IOException{
		//file
		PrintWriter writer = new PrintWriter("Winning Numbers.txt", "UTF-8");
		//main ball pool
		Integer[] mainpool= new Integer[70];
		//powerball pool
		Integer[] powerball= new Integer[25];

		//populate arrays
		for(int i=0;i<70;i++) {
			mainpool[i]=i+1;
		}

		for(int j=1;j<=25;j++) {
			powerball[j-1]=j;
		}

		//output
		//5 per card
		for(int play=1;play<=5;play++) {
		//randomize order of arrays
		Collections.shuffle(Arrays.asList(mainpool));
		Collections.shuffle(Arrays.asList(powerball));
		writer.print("Numbers:"+ " ");
    	for(int i=0;i<5;i++) {
			writer.print(mainpool[i]+" ");

}
writer.print("Powerball:"+" ");
for(int i=0;i<1;i++) {
	writer.print(powerball[i]+" ");
}
writer.println();
}
writer.close();
















	}
}