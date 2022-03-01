package basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Test.class, args);
		Message m = context.getBean(Message.class);
		m.setValue("t");
		
		System.out.println(m.getValue());
	}
	

	/*
	 * @Bean CommandLineRunner runner(UserService userService) { return args -> { //
	 * read json and write to db ObjectMapper mapper = new ObjectMapper();
	 * TypeReference<List<User>> typeReference = new TypeReference<List<User>>(){};
	 * InputStream inputStream =
	 * TypeReference.class.getResourceAsStream("/json/users.json"); try { List<User>
	 * users = mapper.readValue(inputStream,typeReference); userService.save(users);
	 * System.out.println("Users Saved!"); } catch (IOException e){
	 * System.out.println("Unable to save users: " + e.getMessage()); } }; }
	 */
}
