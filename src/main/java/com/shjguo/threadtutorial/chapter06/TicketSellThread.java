package com.shjguo.threadtutorial.chapter06;

public class TicketSellThread extends Thread{

    // 通过构造方法给线程名字赋值
    public TicketSellThread(String name) {
        super(name);// 给线程名字赋值
    }

    // 为了保持票数的一致，票数要静态
    private static int tick = 20;

    // 创建一个静态钥匙
    private static final Object ob = "aa";//值是任意的

    /**
     * java多线程同步锁的使用
     * 示例：三个售票窗口同时出售10张票
     * */
    public static void main(String[] args) {
        //实例化站台对象，并为每一个站台取名字
        TicketSellThread station1=new TicketSellThread("窗口1");
        TicketSellThread station2=new TicketSellThread("窗口2");
        TicketSellThread station3=new TicketSellThread("窗口3");

        // 让每一个站台对象各自开始工作
        station1.start();
        station2.start();
        station3.start();

    }
    // 重写run方法，实现买票操作
    @Override
    public void run() {
        while (tick > 0) {
            synchronized (ob) {// 这个很重要，必须使用一个锁，
                // 进去的人会把钥匙拿在手上，出来后才把钥匙拿让出来
                if (tick > 0) {
                    System.out.println(getName() + "卖出了第" + tick + "张票");
                    tick--;
                } else {
                    System.out.println("票卖完了");
                }
            }
            try {
                sleep(1000);//休息一秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
