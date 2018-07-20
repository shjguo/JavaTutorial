package com.shjguo.threadtutorialtest.char03test;

import com.shjguo.threadtutorial.char03.JoinThreadA;
import com.shjguo.threadtutorial.char03.JoinThreadB;
import com.shjguo.threadtutorial.char03.JoinThreadC;
import junit.framework.TestCase;

/**
 * Created by byhieg on 17/1/11.
 * Mail to byhieg@gmail.com
 */
public class JoinABCThreadTest extends TestCase {

    public void testRun() throws Exception{
        JoinThreadB b = new JoinThreadB();

        JoinThreadA a = new JoinThreadA(b);
        a.start();

        Thread.sleep(1000);
        JoinThreadC c = new JoinThreadC(b);
        c.start();

        Thread.sleep(1000 * 10);
    }
}
