package StringPrograms;

public class OccurenceString {

	public static void main(String[] args) {
		
		String s="Pradnya";
		char []  ch=s.toCharArray();
		int i;
		int count=0;
		for ( i = 0; i <=ch.length-1; i++) {
		count++;	
		System.out.println(ch[i]);	
		}
		
		System.out.println("Count:" + count);
	
	}

}
