package module3;

public class SearchHelper implements ISearchHelper
{
	public static boolean search(Integer [] list, Integer number)
	{
		for (int i = 0; i < list.length; i++)
		{
			if (list[i].intValue() == number.intValue())
				return true;
		}
		return false;
	}

	public static boolean search(String [] list, String str)
	{
		for (int i = 0; i < list.length; i++)
		{
			if (list[i] == str)
				return true;
		}
		return false;
	}

	public static void main(String[] args) 
	{
		String [] str_list = {"X", "Y", "Z", "Q"};
		Integer [] int_list = {1,2,3,4,5};
		
		System.out.println(SearchHelper.search(int_list, 2));
		System.out.println(SearchHelper.search(str_list, "Edureka"));
	}
}

