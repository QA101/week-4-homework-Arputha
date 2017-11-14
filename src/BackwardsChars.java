import java.util.ArrayList;
import java.util.Arrays;

public class BackwardsChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("Career Center");
		String[] str1;
		str1=backwardChars(str);
		System.out.println(Arrays.toString(str1));
	}
	

public static String[] backwardChars(String str) { 

    ArrayList<String> charsList = backwardCharsB(str);
    
    String chars[] = new String[charsList.size()];
    for (int i=0; i<charsList.size(); i++)
    {
       chars[i]=charsList.get(i);
    }

    return chars;
}

public static ArrayList<String> backwardCharsB(String str) 
{    
	ArrayList<String> list=new ArrayList<String>();
	int j=0; //iterator for array list temp position
	for(int i=str.length()-1;i>=0;i--) {
		list.add(j,Character.toString(str.charAt(i)));
		j++;
	}
	return list;
}
}
