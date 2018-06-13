/*
 * Write a program that reverses each word in a given sentence. Assume words are delimited (separated)
 * by one or more hyphen-minus '-' symbol. Ignore all other delimiters. 
 * 
 * In real life, space is the delimiter. We changed to '-' here because a space is not 
 * visible and hard to debug. 
 * 
Example 1:

Enter a sentence:I-am-awesome
Output:I-ma-emosewa


Example 2:

Enter a sentence:---I-like-----Java.
Output:---I-ekil-----.avaJ


Example 3:

Enter a sentence:javais-easy------
Output:siavaj-ysae------  


Example 4:

Enter a sentence:The-No.-1-reason-people-fail-in-life-is-because-they-listen-to-their-friends,-family,-and-neighbors.
Output:ehT-.oN-1-nosaer-elpoep-liaf-ni-efil-si-esuaceb-yeht-netsil-ot-rieht-,sdneirf-,ylimaf-dna-.srobhgien


If you are frustrated with this assignment, please read the test10.txt,  test11.txt,  test12.txt,  test13.txt,  
test14.txt, and  test15.txt.   


 */
package reverseword;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a sentence:");
		String line = scan.nextLine();
		char[] letters = line.toCharArray();	//convert the string into a char array
		String result="";
		int n;
		for(int i=0; i<letters.length;i++) {
			if(letters.length==1)
				break;
			else if(letters[i]!='-')
				result+=letters[i];
			else if(letters[i]=='-') {
				n=i-1;
				for(int j=0;j<result.length();j++) {
					letters[n]=result.charAt(j);
					n--;
				}
				result="";
			}if((i+1==letters.length)&&(letters[i-1]!='-')) {
				n=i;
				for(int j=0; j<result.length();j++) {
					letters[n]=result.charAt(j);
					n--;
				}
			}
		}
		/**
		 * your code goes here
		 */
		
		
		/**
		 * Do NOT change the following code
		 */
		System.out.print("Output:");
		for(char c:letters) {
			System.out.print(c);
		}

	}

}
