package com.shjguo.annotationstutorialtest;

import com.shjguo.annotationstutorial.AConstructorProcess;
import com.shjguo.annotationstutorial.User;
import junit.framework.TestCase;

/**
 * Created by byhieg on 17/2/14.
 * Mail to byhieg@gmail.com
 */
public class AConstructorProcessTest extends TestCase {
    public void testInit() throws Exception {
        User user = new User();
        AConstructorProcess.init(user);
        System.out.println(user.toString());
    }

}