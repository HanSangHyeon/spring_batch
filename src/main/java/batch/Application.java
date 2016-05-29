package batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@ComponentScan
@ImportResource({"classpath:META-INF/spring/context.xml"})
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) {
		logger.info("start!!!!!!!");
		SpringApplication.run(Application.class, args);
		logger.info("stop!!!!!!!!");
//		ConfigurableBeanFactory beanFactory = context.getBeanFactory();
//		String[] beannames = context.getBeanDefinitionNames();
//		for (String beanname : beannames) {
//			logger.info("bean name : {}", beanname);
//		}
	}

}
