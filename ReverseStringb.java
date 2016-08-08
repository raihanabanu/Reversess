# Reversess
import java.util.Scanner;


public class ReverseStringb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		sb.toString();
		String k=new String(sb);
		System.out.println(k);
		}
}
