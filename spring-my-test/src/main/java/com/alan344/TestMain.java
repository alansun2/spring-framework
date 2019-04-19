package com.alan344;

import com.alan344.config.Appconfig;
import com.alan344.service.ProductDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author AlanSun
 * @date 2019/4/19 9:48
 **/
public class TestMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
		ProductDao productDao = (ProductDao) annotationConfigApplicationContext.getBean("productDao");
		System.out.println(productDao);
	}
}
