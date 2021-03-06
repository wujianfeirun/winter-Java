package com.main.jmx.JMX002_JdkJmx;


import com.sun.jdmk.comm.HtmlAdaptorServer;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class HelloAgent {
    public static void main(String[] args) throws Exception {
// MBeanServer server = MBeanServerFactory.createMBeanServer();
        MBeanServer server = ManagementFactory.getPlatformMBeanServer();
        ObjectName helloName = new ObjectName("chengang:name=HelloWorld");
        server.registerMBean(new Hello(), helloName);
        ObjectName adapterName = new ObjectName(
                "HelloAgent:name=htmladapter,port=8082");
        HtmlAdaptorServer adapter = new HtmlAdaptorServer();     //管理界面
        server.registerMBean(adapter, adapterName);
        adapter.start();
        System.out.println("start.....");
    }
}