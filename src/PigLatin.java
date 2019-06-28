import java.util.Scanner;

public class PigLatin {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in); 
           while (true) {
              System.out.print("Please enter a word: , Enter [ quit ] for exit : ");
              String pigLatin = scnr.nextLine();
              if (pigLatin.equals("quit")) {
                 break;
              }
              if (isVowel(pigLatin.charAt(0))) {
                 pigLatin += "ay";
                 System.out.println(pigLatin);
              } else {
                 String output = "";
                 int separation_index = findFirstVowel(pigLatin);
                 if (separation_index ==-1) {
                	 System.out.println(pigLatin+"ay");
                	 continue;
                 }
                 output+= pigLatin.substring(separation_index);
                 output+= pigLatin.substring(0, separation_index) + "ay";
                 System.out.println(output);
                }
            }
		
	}

	private static boolean isVowel(char ch) {
        char v = Character.toLowerCase(ch);
        return v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u';
    }

    private static int findFirstVowel(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                return i;
            }
        }
        return -1;
    }
}
