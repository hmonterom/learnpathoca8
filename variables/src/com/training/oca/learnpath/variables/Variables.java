package com.training.oca.learnpath.variables;

public class Variables {
    public static void main(String[] args) {

        //numerical values, all signed
        //notice naming convention for variables
        byte aByte = 127;   //behaves like 8 bits
        short aShort = 037654; //behaves like 16 bits
        int anInt = 123456; //behaves like 32 bits
        long aLong =0xCAFE; //behaves like 64 bits

        //floating point numbers
        float aFloat = 99.9f;
        double aDouble = 98.0E+99;

        //unsigned number, represents a character
        //coded in Unicode
        char aCharacter = 'A'; //behaves like 16 bits
        aCharacter = '\u0041'; //hexadecimal literal
        aCharacter = '\n';  //new line

        //logical value, true or false
        boolean aBoolean = true; //behaves like 1 bit
    }
}
