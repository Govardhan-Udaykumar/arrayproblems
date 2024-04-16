package org.beginnertoexpert;

public class IntegerToRoman {

    public static void main(String[] args) {
        int number = 9999;
        int[] integerValues = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanValues = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<integerValues.length;i++){
            while (number >= integerValues[i]) {
                number = number - integerValues[i];
                stringBuilder.append(romanValues[i]);
            }
        }
        /*StringBuilder roman = new StringBuilder();
        for(int i=0;i<integerValues.length;i++)
        {
            while(number >= integerValues[i])
            {
                number = number - integerValues[i];
                roman.append(romanValues[i]);
            }
        }*/
        System.out.println(stringBuilder);


    }
}
