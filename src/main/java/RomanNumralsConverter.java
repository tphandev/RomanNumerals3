import java.util.Arrays;

public class RomanNumralsConverter {
    public static int convert(String romanNumrals){
       // int result= Arrays.stream(romanNumrals.split("")).mapToInt(i-> RomanNumralsEnum.getValuebySymbol(i)).sum();
        String[] arrayNumber= romanNumrals.split("");
        int result=0;
        for (int i=0;i<arrayNumber.length;i++)
        {
            if((i+1)>=arrayNumber.length){
                result=result+ RomanNumralsEnum.getValuebySymbol(arrayNumber[i]);
            }
            else {
                result = result + getValueTwoSymbols(arrayNumber[i], arrayNumber[i + 1]);
                
            }
        }
        return result;
    }

    private static int getValueTwoSymbols(String firstSymbol, String secondSymbol){
        int firstValue= RomanNumralsEnum.getValuebySymbol(firstSymbol);
        int secondValue= RomanNumralsEnum.getValuebySymbol(secondSymbol);
        if(firstValue>=secondValue){
            return firstValue;
        }
        else{
            return secondValue-firstValue;
        }
    }

}
