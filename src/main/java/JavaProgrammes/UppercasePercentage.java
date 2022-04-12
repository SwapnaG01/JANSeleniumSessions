/*
 * To find percentage of Uppercase,Lowercase,numbers,digits and special characters in a given string.
 */
package JavaProgrammes;

public class UppercasePercentage {
	
	
	public static void percentage(String s)
	{
	int	uppercasecount=0;
	int lowercasecount=0;
	int digitcount=0;
	int specialcharcount=0;
	char ch;
	int len=s.length();
	for(int i=0;i<len;i++)
	{
		ch=s.charAt(i);
		if(Character.isUpperCase(ch))
		{
			uppercasecount++;
		}
		else if(Character.isLowerCase(ch))
		{
			lowercasecount++;
		}
		else if(Character.isDigit(ch))
		{
			digitcount++;
		}
		else
		{
			specialcharcount++;
		}
	}
	double uppercasepercentage=(uppercasecount*100.0)/len;
	double lowercasepercentage=(lowercasecount*100.0)/len;
	double digitcountpercentage=(digitcount*100.0)/len;
	double specialcharcountpercentage=(specialcharcount*100.0)/len;
	
	System.out.println("In the given string: "+s);
	System.out.println("Uppercase percentage--->"+uppercasepercentage);
	System.out.println("Lowercase percentage--->"+lowercasepercentage);
	System.out.println("Digitpercentage--->"+digitcountpercentage);
	System.out.println("Specialcharpercentage--->"+specialcharcountpercentage);
		
	}
public static void main(String[] args) {
	
	percentage("Naveen AutomationLabs 123");
		
	}

}
