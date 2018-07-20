package com.shjguo.threadtutorialtest.char01test;

import com.shjguo.threadtutorial.char01.SleepThread;
import junit.framework.TestCase;

/**
 * Created by byhieg on 16/12/27.
 * Mail to byhieg@gmail.com
 */
public class SleepThreadTest extends TestCase {
    public void testRun() throws Exception {
        SleepThread sleepThread = new SleepThread();
        System.out.println("begin = " + System.currentTimeMillis());
//        sleepThread.run();
        sleepThread.start();
        System.out.println("end = " + System.currentTimeMillis());

        Thread.sleep(3000);
    }

}