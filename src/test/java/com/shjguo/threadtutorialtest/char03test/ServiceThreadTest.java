package com.shjguo.threadtutorialtest.char03test;

import com.shjguo.threadtutorial.char03.ServiceThread;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2017/1/10.
 * Mail byhieg@gmail.com
 */
public class ServiceThreadTest extends TestCase {

    public void testRun() throws Exception {
        Object lock = new Object();
        new ServiceThread(lock).start();
        new ServiceThread(lock).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("aaa");
            }
        }).start();

        Thread.sleep(1000 * 4);
    }

}