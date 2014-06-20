import java.util.*;
public class test {

	public static void main(String[] args) 
	{
		ArrayList<List<List<Integer>>> test1 = new ArrayList<List<List<Integer>>> ();
		ArrayList<List<Integer>> l1 = new ArrayList<List<Integer>>();
		ArrayList<Integer> i1 = new ArrayList<Integer>();
		i1.add(1);
		for (int i=0; i<5; i++) {
			l1.add(i1);
			i1 = new ArrayList<Integer>();
			i1.add(i);
		}
		ArrayList<List<Integer>> l2 = new ArrayList<List<Integer>>();
		ArrayList<Integer> i2 = new ArrayList<Integer>();
		i2.add(1);
		for (int i=3; i<8; i++) {
			l2.add(i2);
			i2 = new ArrayList<Integer>();
			i2.add(i);
		}
		Apriori ap1 = new Apriori();
		test1.add(l1);
		test1.add(l2);
//		System.out.println(l1);
//		System.out.println(l2);
		Map<List<Integer>, Integer> res = ap1.countItemSet(test1);
		System.out.println(res);
		
		
	}

}
