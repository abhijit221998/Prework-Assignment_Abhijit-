
import java.util.Scanner;

class FirstLetter{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Your String= ");
		String str = in.nextLine(); // taking input here
		System.out.println(firstLetterPrinter(str));
	}
		
		static String firstLetterPrinter(String str){ 
		String[] a = str.split(" ");

		String result = "";

		for (int i=0; i<a.length; i++){
			char fl = a[i].charAt(0);
			result = result + fl;
		}
		return result;
	}

}