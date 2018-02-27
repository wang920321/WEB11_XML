package cn.itheima.web.servlet1;

import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

public class TestMyServlet {
   
    @Test
    public void testMyServlet(){
    	
    	try {
    		//1创建解析器对象
    		SAXReader sax=new SAXReader();
    		//2使用解析器加载web.xml文件得到document对象
			Document document = sax.read("src/cn/itheima/web/servlet1/web.xml");
			//3获取根元素节点
			Element rootElement = document.getRootElement();
			//4获取所有servlet节点
			List<Element> elementServlets = rootElement.elements("servlet");
			for (Element element : elementServlets) {
				//5得到节点里面的文本内容
				String className=element.element("servlet-class").getText();
				System.out.println(className);
				//6通过类全名获取字节码文件
				Class<?> clazz = Class.forName(className);
				if("cn.itheima.web.servlet1.MyServlet1".equals(className)){
					//7创建实例
				MyServlet1 my = (MyServlet1) clazz.newInstance();
				my.init();
				my.service();
				my.destory();
				}
				if("cn.itheima.web.servlet1.MyServlet2".equals(className)){
					MyServlet2 my = (MyServlet2) clazz.newInstance();
					my.init();
					my.service();
					my.destory();
					}
				
			}
			
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
