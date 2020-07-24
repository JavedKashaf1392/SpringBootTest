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
		
	}



	

}
