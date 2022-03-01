package basic;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Message {
	private String value;

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
