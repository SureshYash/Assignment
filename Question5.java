/*Create abstract class StringOperation in which you have declare following methods, 
mergeString, findChar, getCharArray. Now you have to implement all these methods 
in sub classes*/



package test;

public abstract class StringOperation {
public String StringOperation1(String s,String s1) {
	return "";
}
public boolean findChar(char s) {
	return true;
}
public void getCharArray(String s)
{
	char result[]= new char[s.length()];
	
}
}



package test;

public class PerformAbstract extends StringOperation {

	
	String S1="Yash";
	String S2="India";
	char s='Y';
	public String StringOperation1(String S1,String S2) {
		
		return S1+S2;
	}
	
	public boolean findChar(char s) {
		if(S1.indexOf(s)>=0 || S2.indexOf(s)>=0) {
			return true;

		}
		else
			return false;

			
	}
	public void getCharArray(String S1)
	{
		char result[]= new char[S1.length()];
		for (int i = 0; i < S1.length(); i++) {
			result[i] = S1.charAt(i);
			
        }
		 for (char c : result) {
	            System.out.println(c);
	        }  
	}

}


package test;

public class AbstractOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerformAbstract p = new PerformAbstract();
	
		System.out.println("Concat of two string is "+p.StringOperation1("Yash","Technologies"));
		System.out.println("Character present in string is "+p.findChar('Y'));
		System.out.println("Character array of given String");
				p.getCharArray("Technologies");


	}

}




-----------------------------------------
OUT PUT
--------------------------------------------

Concat of two string is YashTechnologies
Character present in string is true
Character array of given String
T
e
c
h
n
o
l
o
g
i
e
s
