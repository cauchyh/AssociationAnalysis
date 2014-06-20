
import java.util.*;
public class Apriori 
{
	public List<List<Integer>> frequentItemSet(List<List<List<Integer>>> itemSet, double minSup)
	{
		// The input itemSet is supposed to be different
		// It is lists that look like [ [[1],[2],[3]], [[2],[3],[4]],...]
		int totalItemCount = countTotalItem(itemSet);
		int minSupItemCount = (int) (minSup*totalItemCount);
		List<List<Integer>> frequentItemSet = new ArrayList<List<Integer>> ();
		for ()
		return frequentItemSet;
	}
	
	private List<Integer> generateSubsets(List<Integer> itemSet, int subsetLength)
	{
		List<Integer> subsets = new ArrayList<Integer>();
		
		return subsets;
	}
	
	private int countTotalItem(List<List<List<Integer>>> itemSet)
	{
		int totalItem = 0;
		// Gain the total item number form every set
		for (List<List<Integer>> list : itemSet) {
			totalItem += list.size();
		}
		return totalItem;
	}
	
	// Method that is to check the total count of each item
	public Map<List<Integer>, Integer> countItemSet(List<List<List<Integer>>> itemSet)
	{ 
		Map<List<Integer>, Integer> itemCountMap = new HashMap<List<Integer>, Integer>();
		// Iterate from each item set record
		for (List<List<Integer>> eachSet : itemSet) {
			for (List<Integer> eachItem : eachSet) {
				if (itemCountMap.containsKey(eachItem)) {
					int newCount = itemCountMap.get(eachItem) + 1;
					itemCountMap.put(eachItem, newCount);
				} else {
					itemCountMap.put(eachItem, 1);
				}
			}
		}
		return itemCountMap;
	}
	
}
