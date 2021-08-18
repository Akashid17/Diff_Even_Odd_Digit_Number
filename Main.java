
import java.lang.*;
import java.io.*;

class Arithmetic
{
	public int DigitDiff(int iNo)
	{
		if(iNo < 0)
		{
			iNo = -iNo;
		}

		int iCnt = 0;

		while(iNo != 0)
		{
			if((iNo%10)%2 == 0)
			{
				iCnt += iNo%10;
			}
			else
			{
				iCnt -= iNo%10;
			}

			iNo /= 10;
		}
		return iCnt;
	}
}

class Main
{
	public static void main(String Arg[])
	{
		BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));

		int iValue = 0;

		try
		{
			System.out.println("Enter Number");
			iValue = Integer.parseInt(bobj.readLine());
		}
		catch(Exception eobj)
		{}

		Arithmetic aobj = new Arithmetic();

		int iRet =  aobj.DigitDiff(iValue);

		System.out.println(iRet);
	}
}