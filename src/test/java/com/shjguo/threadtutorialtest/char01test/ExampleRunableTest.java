package com.shjguo.threadtutorialtest.char01test;

import com.shjguo.threadtutorial.char01.ExampleRunable;
import junit.framework.TestCase;

/**
 * Created by shiqifeng on 2016/12/27.
 * Mail byhieg@gmail.com
 */
public class ExampleRunableTest extends TestCase {
    public void testRun() throws Exception {
        new Thread(new ExampleRunable()).start();

        Thread.sleep(1000);
    }

}