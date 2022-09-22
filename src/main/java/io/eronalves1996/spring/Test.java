package io.eronalves1996.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("io/eronalves1996/spring/config.xml");
		ShoppingCart shoppingCart = (ShoppingCart) ctx.getBean("shoppingcart");
		System.out.println(shoppingCart);

	}

}
