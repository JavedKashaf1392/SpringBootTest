package in.nit.SpringBootTest;

import java.io.IOException;

import javax.activation.CommandObject;
import javax.activation.DataHandler;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hi its First Programe to I am running");
		System.out.println("Enter mail");
		System.out.println("Gmail.com");
		System.out.println("Javed kashaf is a good boy");
		System.out.println("Hello");
	}



	

}
