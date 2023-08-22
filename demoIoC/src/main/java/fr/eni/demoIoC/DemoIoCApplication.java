package fr.eni.demoIoC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoIoCApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(DemoIoCApplication.class, args);
		
//		for (String bean : ctx.getBeanDefinitionNames()) {
//			
//			System.err.println(bean);
//			
//		}
		
		
	}

}
