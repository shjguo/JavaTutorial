package com.shjguo.threadtutorial.chapter06;

public class PersonB extends Thread{
    //创建银行对象
    Bank bank;

    //通过构造器传入银行对象,确保进入的是同一个银行
    public PersonB(Bank bank){
        this.bank =bank;
    }

    //重写run方法实现ATM机取钱

    @Override
    public void run() {
        while (Bank.money>=100){
            //每次取200
            bank.ATM(100);
            try{
                sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
}
