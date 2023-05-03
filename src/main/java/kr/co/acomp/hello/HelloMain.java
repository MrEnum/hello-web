package kr.co.acomp.hello;

import kr.co.acomp.hello.service.BbsService;
import kr.co.acomp.hello.vo.Article;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = 
				new ClassPathXmlApplicationContext("/spring-context.xml");
		
		BbsService dao = ctx.getBean("bbsService", BbsService.class);
		dao.registArticle(new Article());
//		System.out.println();
		
	}

}
