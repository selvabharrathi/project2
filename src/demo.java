
public class demo {
	static String Lrotate(String s, int d)
	{
		String s2=s.substring(d)+s.substring(0,d);
		return s2;
		
	}
	
	static String Rrotate(String s, int d1)
	{
		return Lrotate(s, s.length()-d1);
		
	}
	public static void main(String[] args) 
	{
		String s1="TestYantra";
		System.out.println("Left Rotate");
		System.out.println(Lrotate(s1,1));
		System.out.println("RightRotate");
		String sr="TestYantra";
		System.out.println(Rrotate(sr,1));

	}

	/*	public static void main(String[] args) 
	{
		String s1="JavaMava";
		for(int i=0;i<s1.length();i++)
		{
			int count=1;
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
					count++;
					s1=s1.substring(0, j)+s1.substring(j+1);
					
				}
				
			}
			System.out.println(s1.charAt(i)+" "+count);
		}


	}

*/	/*public static void main(String[] args) 
	{
	String s1="TestYantraJava";
	for(int i=0;i<s1.length();i++)
	{
		int count=1;
		for(int j=i+1;j<s1.length();j++)
		{
			if(s1.charAt(i)==s1.charAt(j))
			{
				count++;
				s1=s1.substring(0, j)+s1.substring(j+1);
				System.out.println(s1);
			}
			
		}
		System.out.println(s1.charAt(i)+" "+count);
	}

	System.out.println(s1);
	}
*/		/*public static void main(String[] args)
		{
			int arr[]={10,20,11,63,54,30,40,50,60};
			int n=arr.length;
			int b[]=new int[n];
			int j=n;
			for(int i=0;i<n;i++)
			{
				b[j-1]=arr[i];
				j=j-1;
				System.out.print("\t"+b[j]);
			}
			System.out.println("Reversed Array");
			for(int k=0;k<n;k++)
			{
				System.out.print("\t"+b[k]);
			}
		}*/
//		public static void main(String[] args) 
//		{
//			String s="Test Yantra Software Test Engineer";
//			
//			String remove=s.replaceAll("\\s","");
//			System.out.println(remove);
//		}


}
