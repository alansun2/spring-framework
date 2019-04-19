package com.alan344.config;

import com.alan344.service.ProductDao;
import org.springframework.context.annotation.Bean;

/**
 * @author AlanSun
 * @date 2019/4/19 11:49
 **/
public class Appconfig {
	@Bean
	public ProductDao productDao(){
		return new ProductDao();
	}
}
