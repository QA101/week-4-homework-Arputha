import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"Cat", "frog", "mouse"};
		System.out.println(Arrays.toString(catty(str)));
		String[] str1= {"bobcat", "siamese cat", "catbird"};
		System.out.println(Arrays.toString(catty(str1)));
		String[] str2= {"buffalo", "dog"};
		System.out.println(Arrays.toString(catty(str2)));
	}
	
	public static String[] catty(String[] animals) { 

	    ArrayList<String> animalsList = new ArrayList<String>();
	    for (int i=0; i<animals.length; i++)
	    {
	       animalsList.add(animals[i]);
	    }
	    
	    ArrayList<String> catsList = cattyB(animalsList);
	    
	    String cats[] = new String[catsList.size()];
	    for (int i=0; i<catsList.size(); i++)
	    {
	       cats[i]=catsList.get(i);
	    }

	    return cats;
	}

	public static ArrayList<String> cattyB(ArrayList<String> animalsList) 
	{    
		ArrayList<String> result=new ArrayList<String>();
		for (int i=0;i<animalsList.size();i++) {
			if ( animalsList.get(i).toUpperCase().contains("CAT")) {
				result.add(animalsList.get(i));
			}
		}
			
		return result;
	}

}
