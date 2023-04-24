package com.mutsa.backend.week2;

import java.security.spec.RSAOtherPrimeInfo;

public class VariableEx {

    public static void main(String[] args) {
        // 3가지 Type 1출력
        String sOne = new String("1");


        // int float의 경계
        int iOne = 1;
        int iTwo = 2;
        int iNine = 9;
        float fOne = 1.0f;
        float fTwo = 2.0f;
        float fNine = 9.0f;


        System.out.printf("%f\n", fOne + fOne/fTwo);
        System.out.printf("%d\n", iOne + iOne/iTwo);

        System.out.printf("%f\n", fNine/fTwo);
        System.out.printf("%d\n", iNine/iTwo);

    }

}
