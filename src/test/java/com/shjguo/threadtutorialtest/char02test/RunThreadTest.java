package com.shjguo.threadtutorialtest.char02test;

import com.shjguo.threadtutorial.char02.RunThread;
import junit.framework.TestCase;

/**
 * Created by byhieg on 17/1/5.
 * Mail to byhieg@gmail.com
 */
public class RunThreadTest extends TestCase {
    public void testRun() throws Exception {
        RunThread thread = new RunThread();
        thread.start();
        Thread.sleep(1000);
        thread.setRunning(false);
        System.out.println("已经赋值为false");

        Thread.sleep(1000 * 3);
    }

}