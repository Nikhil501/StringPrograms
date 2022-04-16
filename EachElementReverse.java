package StringPrograms;

public class EachElementReverse {

	public static void main(String[] args) {
		
		String s="Hello world";
		String [] s1=s.split("_");
		String s2=" ";
		
		for (String string : s1) {
			StringBuffer sb= new StringBuffer(string);
			s2 =s2+" "+sb.reverse();			
		}
		s2=s2.trim();
		System.out.println(s2);
		

	}

}
