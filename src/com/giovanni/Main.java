package com.giovanni;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String decimalInput;
        int modulus;
        int decimalInputInt;
        int quotientInt;
        int prod=0;
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> binaryOutput = new ArrayList <Integer>();

	    Scanner scanner = new Scanner(System.in);
        System.out.println("press (D)ecimal to bonary or (B)inary to decimal");
        String typeInput = scanner.nextLine();
        if(typeInput.equals("D")) {
        //System.out.println("you chosen decimal");
                decimalInput = scanner.nextLine();
                int decimalLength = decimalInput.length();
                decimalInputInt = Integer.parseInt(decimalInput);
                    //System.out.println(decimalInputInt);
                modulus = decimalInputInt%2;
                binaryOutput.add(modulus);
                for(int i=decimalInputInt;i>1;i=quotientInt){
                    //System.out.println("this is iteration n." + i);
                    int quotient =i/2;
                    //System.out.println("Quotient" + r);
                    quotientInt = (int)quotient;
                    modulus = (Integer)quotient%2;
                    binaryOutput.add(modulus);
                    //System.out.println("Remainder:" + modulus);
                }
                for(int x:binaryOutput) {
                System.out.print(x);
                }
                System.out.println("");
                System.out.println("The binary number of your number is:");
                for(int j=binaryOutput.size()-1; j>=0;j--) {
                    System.out.print(binaryOutput.get(j));
                }
                //String finale = StringBuilder.(binaryOutput.get(j)))
        } else {
                if(typeInput.equals("B")){
                    String input = scanner.next();
                     int length = input.length();
                //System.out.println(input.length());
                for (int i = length - 1; i >= 0; i--) {
                    String character = String.valueOf(input.charAt(i));
                    if (character.equals("1")) {
                        int pow = (int) Math.pow(2, i);
                        prod += pow;
                        //sb.append(prod);
                        //System.out.println("pow:" + pow);
                        //System.out.println("prod" + prod);
                        //System.out.println("i" + i);
                        //System.out.println("pow" + pow);
                        //System.out.println("charAt" + input.charAt(i));
                    }
                }
            }

    }
       // for(int i:sb){
            System.out.print(prod);
        }

}
