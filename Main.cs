using System;

class ArithmeticX
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

class main
{
	public static void Main(string[] args)
	{
		Console.WriteLine("Enter Number");
		int iValue = Convert.ToInt32(Console.ReadLine());

		ArithmeticX aobj = new ArithmeticX();
		int iRet = aobj.DigitDiff(iValue);

		Console.WriteLine(iRet);
	}
}