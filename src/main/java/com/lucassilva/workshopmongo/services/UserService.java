package com.lucassilva.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucassilva.workshopmongo.domain.User;
import com.lucassilva.workshopmongo.dto.UserDTO;
import com.lucassilva.workshopmongo.repository.UserRepository;
import com.lucassilva.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(String id) {
	    Optional<User> user = repo.findById(id);
	    return user.orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado"));
	}
	
	public User insert(User obj) {
		return repo.insert(obj);
	}
	
	public void delete(String id) {
	   findById(id);
	   repo.deleteById(id);
	   
	}
	
	public User update(User obj) {
		User newObj = repo.findById(obj.getId()).
				orElseThrow(() -> new ObjectNotFoundException("Usuário não encontrado"));
		updateData(newObj, obj);
		return repo.save(newObj);
	}
	
	private void updateData(User newObj, User obj) {
		newObj.setName(obj.getName());
		newObj.setEmail(obj.getEmail());
		
	}

	public User fromDTO(UserDTO objdto) {
		return new User(objdto.getId(),objdto.getName(),objdto.getEmail());
	}

}
