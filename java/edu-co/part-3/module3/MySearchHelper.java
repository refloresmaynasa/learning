package module3;

import java.util.ArrayList;
import java.util.List;

public class MySearchHelper extends SearchHelper {

	/**
	 * Returns the index of the searched value else -1 if not found.
	 * @param list
	 * @param number
	 * @return
	 */
	public static int search(Float [] list, Float number)
	{
		for (int i = 0; i < list.length; i++)
		{
			if (list[i].floatValue() == number.floatValue())
				return i;
		}
		return -1;
	}
	
	public static Integer [] search(Double [] list, Double number)
	{
		List<Integer> indexes = new ArrayList<>();
		for (int i = 0; i < list.length; i++)
		{
			if (list[i].doubleValue() == number.doubleValue())
				indexes.add(i);
		}
		Integer[] result = new Integer[indexes.size()];
		result = indexes.toArray(result);
		return result;
	}
}
