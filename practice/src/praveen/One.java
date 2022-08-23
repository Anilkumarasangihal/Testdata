package praveen;

public class One {
	public static void main(String[] args) {
		String s="Hello how are you";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			String s2=s1[i];
			String s3="";
			for(int j=s2.length()-1;j>=0;j--)
			{
				s3=s3+s2.charAt(j);
			}
			System.out.print(s3+" ");
		}
		System.out.println();
		String ss="";
		for(int i=0;i<s1.length;i++)
		{
			String s2=s1[i];
			String s3="";
			for(int j=s2.length()-1;j>=0;j--)
			{
				s3=s3+s2.charAt(j);
			}
			System.out.print(s3);
			ss=ss+s3;
		}	
		System.out.println(s);
		
		System.out.println();
		
		
		
		
		
	}
}
