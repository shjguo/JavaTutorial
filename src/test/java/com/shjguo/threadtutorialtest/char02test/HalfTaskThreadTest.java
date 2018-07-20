package com.shjguo.threadtutorialtest.char02test;

import com.shjguo.threadtutorial.char02.HalfSynTask;
import com.shjguo.threadtutorial.char02.HalfTaskThread;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2017/1/3.
 * Mail byhieg@gmail.com
 */
public class HalfTaskThreadTest extends TestCase {
    public void testRun() throws Exception {
        HalfSynTask task = new HalfSynTask();
        HalfTaskThread threadA = new HalfTaskThread(task);
        threadA.setName("A");
        threadA.start();

        HalfTaskThread threadB = new HalfTaskThread(task);
        threadB.setName("B");
        threadB.start();

        Thread.sleep(1000 * 10);
    }

}