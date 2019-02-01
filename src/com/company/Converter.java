package com.company;

public class Converter {
    static private int r, g, b;
    static private int hex;

    // RGB
    public Converter(int a, int z, int c)
    {
        r = a;
        g = z;
        b = c;

        decToHexa(r);
        decToHexa(g);
        decToHexa(b);

        // System.out.println(r + g + b);
    }

    // Hexadecimal
    public Converter(String hexa)
    {
        System.out.println(toRGB(hexa));
    }



    private String toRGB (String value)
    {
        String h = "";
        char [] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int [] dec = new int [100];
        int index = 0;

        for(int i=0; i<hex.length; i++)
            if(hex[i] == value.charAt(0))
                dec[i] = i * 16;


        return String.valueOf(dec[0]);
    }

    private void decToHexa(int n) {

        char[] hexaDeciNum = new char[100];

        // counter for hexadecimal number array
        int i = 0;
            while(n!=0)
            {
            // temporary variable to store remainder
            int temp = 0;

            // storing remainder in temp variable.
            temp = n % 16;

            // check if temp < 10
            if(temp < 10)
            {
                hexaDeciNum[i] = (char)(temp + 48);
                i++;
            }
            else
            {
                hexaDeciNum[i] = (char)(temp + 55);
                i++;
            }

            n = n/16;
        }
        for(int j=i-1; j>=0; j--)
            System.out.print(hexaDeciNum[j]);
    }
}
