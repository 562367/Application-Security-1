import java.util.Scanner;


public class ReverseWords {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter sentence");
		Scanner obj=new Scanner(System.in);
       String str=obj.nextLine();
       String str1[] = str.split(" ");
       String finalStr="";
           for(int i = str1.length-1; i>= 0 ;i--){
               finalStr += str1[i]+" ";
           }
           System.out.println(finalStr);
	}

}
