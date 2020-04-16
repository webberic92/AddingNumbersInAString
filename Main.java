package playground;



public class Main {

   public static void main(String[] args){

	   
	  //String of numbers
	  String str = "246";
	  
	  String numbArray[] = str.split("");
	  int sum = 0;
	  
	  for (String numbers : numbArray) {
		  
		 Integer numb = Integer.parseInt(numbers);
		  sum += numb;

	  }
	  System.out.println(sum);
   }}