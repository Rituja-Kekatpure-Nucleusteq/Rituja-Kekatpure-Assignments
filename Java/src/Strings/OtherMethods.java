package Strings;

public class OtherMethods {
   public static void main(String[] args)
   {
	   String str = "Java";
	   String str1 = "C Language";
	   String str2 = "Python";
	   String str3 = "java";
	   
	   
	   //comparing Strings
	   System.out.println(str.compareTo(str3));
	   System.out.println(str2.compareTo(str1));
	   
	   System.out.println(str.compareToIgnoreCase(str3));
	   System.out.println(str1.contains("Language"));
	   System.out.println(str3.isEmpty());
       
	   System.out.println(str2.substring(1,4));
	   
   }
}
