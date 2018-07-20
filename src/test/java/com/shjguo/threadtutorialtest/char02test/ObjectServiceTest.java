package com.shjguo.threadtutorialtest.char02test;

import com.shjguo.threadtutorial.char02.DoubleSynThreadA;
import com.shjguo.threadtutorial.char02.DoubleSynThreadB;
import com.shjguo.threadtutorial.char02.ObjectService;
import junit.framework.TestCase;

/**
 * Created by byhieg on 17/1/3.
 * Mail to byhieg@gmail.com
 */
public class ObjectServiceTest extends TestCase {
    public void testServiceMethod() throws Exception {
        ObjectService objectService = new ObjectService();
        DoubleSynThreadA a = new DoubleSynThreadA(objectService);
        a.setName("A");
        a.start();

        DoubleSynThreadB b = new DoubleSynThreadB(objectService);
        b.setName("B");
        b.start();

        Thread.sleep(1000 * 3);
    }



}