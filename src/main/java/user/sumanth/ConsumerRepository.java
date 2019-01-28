package user.sumanth;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsumerRepository extends MongoRepository<ConsumerResource,String> {
	ConsumerResource findByArea(String area);
	ConsumerResource findByName(String name);
	ConsumerResource findByApiKey(String apikey);

}
