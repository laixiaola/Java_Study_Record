package com.lesson8.cexc;

public class Student {
    private String name;
    private String address;

    void setName(String s) throws IllegalNameException{
        if(s.length()>5||s.length()<1) {
            throw new IllegalNameException("名字长度异常");
        }
        else{
            name=s;
        }
    }

    void setAddress(String s) throws IllegalAddressException{
        boolean flag=false;
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c=='省'||c=='市'){
                flag=true;
                break;
            }
        }
        if(flag){
            address=s;
        }
        else{
            throw new IllegalAddressException("地址名称异常");
        }
    }

    String getName(){return name;}
    String getAddress(){return address;}
}
