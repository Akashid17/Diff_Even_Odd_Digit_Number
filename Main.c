
#include<stdio.h>

int DigitDiff(int iNo)
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

int main()
{
    int iValue = 0;
    int iRet = 0;

    printf("Enter Number\n");
    scanf("%d",&iValue);

    iRet = DigitDiff(iValue);

    printf("%d\n",iRet);

    return 0;
}