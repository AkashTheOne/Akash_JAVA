import java.util.*;
class code{
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(60);
		list.add(40);
		
		System.out.println(list);
		
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(60);
		set.add(40);
		System.out.println("hashset is:");
		System.out.println(set);
		
		LinkedHashSet<Integer> link=new LinkedHashSet<Integer>();
		link.add(10);
		link.add(20);
		link.add(30);
		link.add(60);
		link.add(40);
		System.out.println("LinkedHashSet is:");
		System.out.println(link);
		
		TreeSet<Integer> little=new TreeSet<Integer>();
		little.add(10);
		little.add(20);
		little.add(30);
		little.add(60);
		little.add(40);
		System.out.println("TreeSet is:");
		System.out.println(little);
		
		
	}
}
		