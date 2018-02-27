package cn.itheima.web.servlet1;

public class MyServlet1 implements MyServlet{

	@Override
	public void init() {
		// TODO Auto-generated method stub
		System.out.println("111111来了");
	}

	@Override
	public void service() {
		// TODO Auto-generated method stub
		System.out.println("1为你服务");
	}

	@Override
	public void destory() {
		// TODO Auto-generated method stub
		System.out.println("1销毁");
	}

}
