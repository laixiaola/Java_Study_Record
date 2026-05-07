/*
    【问题描述】
        如果某个数的平方的末尾几位数等于这个数，那么就称这个数为自守数。
        显然，5和6是一位自守数，因为5*5=25,6*6=36，他们的最后一位分别是5和6。
        25和76是两位的自守数，因为25*25=625,76*76=5776，
        求10000以内的自守数。
 */
package com.lesson3.test;

public class Automorphic {
    public static void main(String[] args){
        for (int i = 1; i < 10000; i++) {
            int digit=0;
            int sqi=i*i;
            for (int j = i; j >0 ; j/=10) {
                digit++;
            }
            int end=1;
            for (int j = 0; j < digit; j++) {
                end*=10;
            }
            if(sqi%end==i){
                System.out.print(i+" ");
            }
        }
    }
}
