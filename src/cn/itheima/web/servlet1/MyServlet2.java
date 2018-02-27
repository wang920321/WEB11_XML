package cn.itheima.web.servlet1;

public class MyServlet2 implements MyServlet {

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("2222来了");
	}

	@Override
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("2为你服务");
	}

	@Override
	public void destory() {
		// TODO Auto-generated method stub
		System.out.println("2销毁");
	}

}
