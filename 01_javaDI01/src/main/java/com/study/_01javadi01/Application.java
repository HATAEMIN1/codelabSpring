package com.study._01javadi01;

import com.study._01javadi01.bean.Config;
import com.study._01javadi01.bean.Member;
import com.study._01javadi01.bean.Printer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

		Member member1 = (Member) ctx.getBean("member1");
		member1.print();
		Member member2 = (Member) ctx.getBean("member2");
		member2.print();
		Member member3 = ctx.getBean("member2",Member.class);
		member3.print();
		Printer printer = (Printer) ctx.getBean("printerB",Printer.class);
		member1.setPrinter(printer);
		member1.print();
	}



}
