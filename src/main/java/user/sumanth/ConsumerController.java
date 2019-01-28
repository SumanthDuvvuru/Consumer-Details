package user.sumanth;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.UUID;

@RestController
@RequestMapping(value ="/api/consumer")
public class ConsumerController {

	ConsumerRepository consumerRepository;

	public ConsumerController(ConsumerRepository consumerRepository)	{
		this.consumerRepository = consumerRepository;
	}

	@PostMapping(value = "/save")
	public ResponseEntity<ConsumerResource> echoStudentName(@RequestBody Consumer consumer) {
		ConsumerResource cr = new ConsumerResource(consumer.id,consumer.name,consumer.area);
		consumerRepository.save(cr);
		return new ResponseEntity<>(cr, HttpStatus.CREATED);
	}

	@GetMapping(value = "/{name}")
	public ResponseEntity<ConsumerResource> getConsumerByName(@PathVariable(name = "name") String name) {
		return new ResponseEntity<>(consumerRepository.findByName(name),HttpStatus.OK);
	}

	@GetMapping(value = "/{area}")
	public ResponseEntity<ConsumerResource> getConsumerByArea(@PathVariable(name = "area") String area) {
		return new ResponseEntity<>(consumerRepository.findByArea(area),HttpStatus.OK);
	}

	@GetMapping(value = "/apiKey/{apiKey}")
	public ResponseEntity<Boolean> doesApiKeyExist(@PathVariable(name = "apiKey") String apiKey) {
		ConsumerResource c = consumerRepository.findByApiKey(apiKey);
		Boolean b = c!=null?true:false;
		return new ResponseEntity<>(b,HttpStatus.OK);
	}


}
