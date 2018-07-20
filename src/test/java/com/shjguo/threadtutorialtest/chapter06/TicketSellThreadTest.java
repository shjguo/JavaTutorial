package com.shjguo.threadtutorialtest.chapter06;

import com.shjguo.threadtutorial.chapter06.TicketSellThread;
import junit.framework.TestCase;

public class TicketSellThreadTest extends TestCase{

    public void testRun() throws Exception{
        TicketSellThread ticketSellThread = new TicketSellThread("seller01");
        TicketSellThread ticketSellThread1 = new TicketSellThread("seller02");
        TicketSellThread ticketSellThread2 = new TicketSellThread("seller03");

        ticketSellThread.start();
        ticketSellThread1.start();
        ticketSellThread2.start();
    }
}
