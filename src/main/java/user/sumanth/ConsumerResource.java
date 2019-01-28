package user.sumanth;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.UUID;

@Setter
@Getter
public class ConsumerResource implements Serializable {
	private static final long SerialVersionUID = 1l;
	@Id
	@JsonIgnore
	ObjectId _id;
	int id;
	String name;
	String area;
	String apiKey;

	public ConsumerResource(){
		apiKey = UUID.randomUUID().toString();
		System.out.println("==================> "+apiKey);
	}

	public ConsumerResource(int id, String name, String area){
		this();
		this.area = area;
		this.id = id;
		this.name = name;
	}

}
