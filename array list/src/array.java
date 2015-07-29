import java.util.*;
public class array {
	public static void main(String args[])
	{
		ArrayList a1=new ArrayList();
		System.out.println("intial size="+a1.size());
		a1.add("c");
		a1.add("d");
		a1.add("e");
		a1.add("f");
		a1.add("Z");
		a1.add("m");
		a1.add("g");
		System.out.println("performing arraylist");
		System.out.println("after addition="+a1.size());
		System.out.println("content="+a1);
		a1.remove("f");
		System.out.println("after deletion="+a1);
		
	}
}
