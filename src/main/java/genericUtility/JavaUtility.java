package genericUtility;

import java.util.Random;

public class JavaUtility 
{
	 public int getRandomNum()
		{
			Random ran=new Random();
			int RanNum = ran.nextInt(1000);
			return RanNum;	
		}
		public String getRandomPhoneNumber()
		{
//			return Math.round(Math.random()*1000000000);
			return "9"+Long.toString(Math.round(Math.random()*1000000000));
		}
		
		public char getRandomAlphabet()
		{
			Random rnd = new Random();
		    char c = (char) ('a' + rnd.nextInt(26));
			return c;
		}
		public String getRandomEmail(String... name)
		{
			String nameData;
			if(name.length==0)
			{
				nameData="vikas";
			}
			else
			{
				nameData = name[0];
			}
			return nameData+Long.toString(Math.round(Math.random()*100000))+"@gmail.com";
		}
		public String getRandomName(String... name)
		{
			String nameData;
			if(name.length==0)
			{
				nameData="vikas";
			}
			else
			{
				nameData = name[0];
			}
			return nameData+Long.toString(Math.round(Math.random()*100000));
		}
		
		public String getRandomTournamentTitleName(String... name)
		{
			String nameData;
			if(name.length==0)
			{
				nameData="hello testing";
			}
			else
			{
				nameData = name[0];
			}
			return nameData+Long.toString(Math.round(Math.random()*100000));
		}
		
		public String getRandomNumber()
		{
//			return Math.round(Math.random()*1000000000);
			return Long.toString(Math.round(Math.random()*100));
		}

}
