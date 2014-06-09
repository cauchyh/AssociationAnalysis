
import java.util.*;
public class Apriori 
{
	public List<List<Integer>> frequentItemSet(List<Integer> itemSet, double minSup)
	{
		// The input itemSet is supposed to be different
		int totalItemCount = itemSet.size();
		int minSupItemCount = (int) (minSup*totalItemCount);
		List<List<Integer>> frequentItemSet = new ArrayList<List<Integer>> ();
		
		return frequentItemSet;
	}
	
	private List<Integer> generateSubsets(List<Integer> itemSet, int subsetLength)
	{
		
	}
}
