package com.lucassilva.workshopmongo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.lucassilva.workshopmongo.domain.Post;
import com.lucassilva.workshopmongo.domain.User;
import com.lucassilva.workshopmongo.repository.PostRepository;
import com.lucassilva.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userrepo;
	
	@Autowired
	private PostRepository postrepo;
	
	@Override
	public void run(String... args) throws Exception {
		userrepo.deleteAll();
		postrepo.deleteAll();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu Viagem!", "Vou Viajar para São Paulo. Abraços!", maria);
		Post post2 = new Post(null, sdf.parse("23/03/2018"), "Bom dia!", "Acordei feliz hoje!", maria);
		
		
		userrepo.saveAll(Arrays.asList(maria,alex,bob));
		postrepo.saveAll(Arrays.asList(post1,post2));
		
	}

}
