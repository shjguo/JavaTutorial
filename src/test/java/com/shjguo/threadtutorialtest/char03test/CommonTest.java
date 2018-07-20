package com.shjguo.threadtutorialtest.char03test;

import com.shjguo.threadtutorial.char03.CommonNotify;
import com.shjguo.threadtutorial.char03.CommonWait;
import junit.framework.TestCase;

/**
 * Created by byhieg on 17/1/15.
 * Mail to byhieg@gmail.com
 */
public class CommonTest extends TestCase{

    public void testRun() throws Exception{
        Object lock = new Object();
        new Thread(()->{
            try {
                new CommonWait(lock).doSomething();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                new CommonWait(lock).doSomething();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        Thread.sleep(1000);

        new Thread(()->{
            new CommonNotify(lock).doNotify();
        }).start();

        Thread.sleep(1000 * 3);

    }
}
