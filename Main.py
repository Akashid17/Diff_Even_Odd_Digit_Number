
def DigitDiff(iNo):

    if iNo < 0:
        iNo = -iNo
    
    iCnt = 0

    while iNo != 0:

        if(iNo%10)%2 == 0:
            iCnt += iNo%10
        else:
            iCnt -= iNo%10

        iNo = int(iNo/10)

    return iCnt

def main():
    iValue = int(input("Enter Number\n"))
    iRet = DigitDiff(iValue)
    print(iRet)

if __name__ == "__main__":
    main()