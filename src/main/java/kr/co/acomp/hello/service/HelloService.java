package kr.co.acomp.hello.service;

import kr.co.acomp.hello.dao.AnotherDAO;
import kr.co.acomp.hello.dao.HelloDAO;

public class HelloService {
	
	private HelloDAO helloDAO;
	private AnotherDAO anotherDAO;
//	public HelloService(HelloDAO helloDao){
//		this.helloDAO = helloDao;
//	}
	public void setAnotherDAO(AnotherDAO anotherDAO){
		this.anotherDAO = anotherDAO;
	}

	public void setHelloDAO(HelloDAO helloDao) {
		this.helloDAO = helloDao;
	}
	
	public int calcTwoNumbersAndSquare(int a, int b) {
		int result = helloDAO.addTwoNumber(a, b);
		int result2 = anotherDAO.square(a,b);
		return result2;
	}





}
