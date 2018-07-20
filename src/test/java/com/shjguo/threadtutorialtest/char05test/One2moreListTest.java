package com.shjguo.threadtutorialtest.char05test;

import com.shjguo.threadtutorial.char05.one2more.Customer;
import com.shjguo.threadtutorial.char05.one2more.MyQueue;
import com.shjguo.threadtutorial.char05.one2more.Producer;
import junit.framework.TestCase;

/**
 * Created by byhieg on 17/2/1.
 * Mail to byhieg@gmail.com
 */
public class One2moreListTest extends TestCase {

   public void testList() throws Exception {
       MyQueue queue = new MyQueue();

       new Thread(new Producer(queue)).start();
       new Thread(new Customer(queue)).start();

       new Thread(new Customer(queue)).start();
       new Thread(new Customer(queue)).start();
       new Thread(new Customer(queue)).start();
       new Thread(new Customer(queue)).start();

       Thread.sleep(1000 * 3);


   }
}
