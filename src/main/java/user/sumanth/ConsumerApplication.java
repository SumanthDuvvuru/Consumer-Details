package user.sumanth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@SpringBootApplication
@EnableEurekaClient
@EnableMongoRepositories
public class ConsumerApplication {


	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
}

