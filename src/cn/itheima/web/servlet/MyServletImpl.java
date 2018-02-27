package cn.itheima.web.servlet;

public class MyServletImpl implements MyServlet {

	@Override
	public void init() {
		System.out.println("a,俺来也");

	}

	@Override
	public void service() {
		System.out.println("我可以为你服务");

	}

	@Override
	public void destory() {
		System.out.println("俺去也");

	}

}
