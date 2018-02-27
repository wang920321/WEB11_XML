package cn.itheima.web.servlet;

import org.junit.Test;

public class TestMyServlet {
    @Test
    public void testMyServlet(){
    	MyServletImpl my=new MyServletImpl();
    	my.init();
    	my.service();
    	my.destory();
    }
    @Test
    public void testMyServlet1(){
        String classname="cn.itheima.web.servlet.MyServletImpl";
        try {
			Class<?> clazz = Class.forName(classname);
			MyServletImpl my = (MyServletImpl) clazz.newInstance();
			my.init();
			my.service();
			my.destory();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
