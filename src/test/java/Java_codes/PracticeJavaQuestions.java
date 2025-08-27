package Java_codes;

public class PracticeJavaQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "Hello world";
		
		word = word.toLowerCase();
		char[] words = word.toCharArray();
		int Vcount = 0;
		int Ccount = 0;
		
		for(int i=0;i<words.length;i++)
			
		{
			char ch = words[i];
			if(ch >='a' && ch <='z')
			if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				Vcount++;
			}
			else
			{
				Ccount++;
			}
		}
		
		System.out.println("Vowles:"+ Vcount);
		System.out.println("Consonants:"+ Ccount);
		
		

	}

}
