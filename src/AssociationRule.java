import java.util.*;
/**
 * 
 * @author CauchyHuang
 *
 */
public class AssociationRule 
{
	/**
	 * 
	 * @param itemSetCountXY - The item set number of X and Y where X and Y are mutual exclusion
	 * @param itemSetCountTotal - Total item set number of the input
	 * @return Support value in double
	 */
	public static double getSupport(int itemSetCountXY, int itemSetCountTotal)
	{
		double res = (double) itemSetCountXY / (double) itemSetCountTotal;
		return res;
	}
	
	/**
	 * 
	 * @param itemSetCountXY - The item set number of X and Y where X and Y are mutual exclusion
	 * @param itemSetCountX - The item set number of X
	 * @return Confidence Value in double
	 */
	public static double getConfidence(int itemSetCountXY, int itemSetCountX)
	{
		double res = (double) itemSetCountX / (double) itemSetCountXY;
		return res;
	}
	
	
}
