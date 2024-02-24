 import java.util.Arrays;
 import java.util.Function;
 public class AnaGramCheckJava8
 {
 	public static void main (String [] args)
 	{
 		
 		Function<String,Function<String ,Boolean>> p1= s1 -> s2 ->{

 				//char [] chars1=s1.tocharArray();

 			if(s1.length() != s2.length())
 			{
 				return false;
 			}
 			else
 			{
 			  char[]char1=s1.toCharArray();

 			  char[]char2=s1.toCharArray();

 			  Arrays.sort(char1);
 			  Arrays.sort(char2);

 			  Arrays.equals(char1,char2);

 			  return true;
  
  			}

 		
 		};

 		String str = "mam";
		String str1 = "mom";
		boolean areanagram = p1.apply(str).apply(str1);

		String result = (areanagram == true) ? "yes this is anagram" : ("this String is not a anagram");

		System.out.println(result);
 	}


 }