package com.shjguo.threadtutorial.chapter06;

public class MainClass {

    public static void main (String[] args){

        //实例化一个银行对象
        Bank bank = new Bank();
        //实例化2个人,传入同一个眼行对象
        PersonA pa = new PersonA(bank);
        PersonB pb = new PersonB(bank);
        //两个人开始取钱
        pb.start();
        pa.start();
    }

}
