package store.heyizhenjiu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class HeyizhenjiuApplication extends SpringBootServletInitializer implements WebApplicationInitializer{

	//springboot启动
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(HeyizhenjiuApplication.class);
	}

	public static void main(String[] args) { SpringApplication.run(HeyizhenjiuApplication.class, args);
	}

}
