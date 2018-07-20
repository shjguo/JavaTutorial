package com.shjguo.threadtutorialtest.char02test;

import com.shjguo.threadtutorial.char02.RunService;
import com.shjguo.threadtutorial.char02.SynVolaThreadA;
import com.shjguo.threadtutorial.char02.SynVolaThreadB;
import junit.framework.TestCase;

/**
 * Created by byhieg on 17/1/5.
 * Mail to byhieg@gmail.com
 */
public class RunServiceTest extends TestCase {
    public void testRunMethod() throws Exception {
        RunService service = new RunService();
        SynVolaThreadA threadA = new SynVolaThreadA(service);
        threadA.start();
        Thread.sleep(1000);
        SynVolaThreadB threadB = new SynVolaThreadB(service);
        threadB.start();
        System.out.println("已经发起停止的命令了");

        Thread.sleep(1000);
    }

}