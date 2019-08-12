package work.shashank.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import work.shashank.demo.entities.Dummy;
import work.shashank.demo.entities.User;
import work.shashank.demo.entities.UserProfile;
import work.shashank.demo.entities.enums.Gender;
import work.shashank.demo.repository.DummyRepository;
import work.shashank.demo.repository.UserProfileRepository;
import work.shashank.demo.repository.UserRepository;

import java.util.Date;

@SpringBootApplication
@EnableAsync
@ComponentScan(basePackages = {"work.shashank*"})
@EntityScan(basePackages = {"work.shashank*"})
@EnableJpaRepositories(basePackages = {"work.shashank*"})
public class DemoApplication implements CommandLineRunner {

	@Autowired private UserRepository userRepository;

	@Autowired private DummyRepository dummyRepository;

	@Autowired private UserProfileRepository userProfileRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		User user = new User();
		user.setFirstName("firstName");
		user.setLastName("lastName");
		user.setEmail("sharmashashank@gmail.com");

		user = userRepository.save(user);

		System.out.println(user);

		Thread.sleep(10);

		Dummy dummy = new Dummy();
		dummy.setDummyData("Dummy Data");
		System.out.println(dummyRepository.save(dummy));

		Thread.sleep(10);

		UserProfile userProfile = new UserProfile();
		userProfile.setAddress1("address 1");
		userProfile.setAddress2("address 2");
		userProfile.setCity("City");
		userProfile.setDateOfBirth(new Date());
		userProfile.setCountry("India");
		userProfile.setGender(Gender.MALE);
		userProfile.setState("State");
		userProfile.setUser(user);

		System.out.println(userProfileRepository.save(userProfile));

		Thread.sleep(10);



		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
