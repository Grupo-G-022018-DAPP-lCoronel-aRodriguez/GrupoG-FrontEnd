package ar.edu.unq.desapp.grupoG;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso
//para poder usar el login de google debemos usar esta anotacion

public class DesappGroupGFrontendApplication {


	public static void main(String[] args) {
		SpringApplication.run(DesappGroupGFrontendApplication.class, args);
	}
}
