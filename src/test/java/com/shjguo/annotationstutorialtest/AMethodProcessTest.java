package com.shjguo.annotationstutorialtest;

import com.shjguo.annotationstutorial.AMethodProcess;
import com.shjguo.annotationstutorial.User;
import junit.framework.TestCase;

/**
 * Created by byhieg on 17/2/14.
 * Mail to byhieg@gmail.com
 */
public class AMethodProcessTest extends TestCase {
    public void testInitMethod() throws Exception {
        AMethodProcess.initMethod(new User());
    }

}