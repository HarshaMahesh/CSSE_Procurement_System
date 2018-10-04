package com.procurement_system_backend.backend.service;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.procurement_system_backend.backend.dao.IMongoUserRepo;
import com.procurement_system_backend.backend.entity.Users;

/**
 * @author windula
 *
 */
@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	private IMongoUserRepo mongoRepoUsers;

	/**
	 * @param username
	 * @param pwd
	 * @return
	 * 
	 */
	@Override
	public Users loginUser(String username) {
		
		Users user=this.mongoRepoUsers.findByUsername(username);
		
		return user;
	}
	
	public String BASE64decode(String encodedString) {
		byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
		String decodedString = new String(decodedBytes);
		
		return decodedString;
	}
	
	public String BASE64encode(String originalURL) {
		String encoded = Base64.getUrlEncoder().encodeToString(originalURL.getBytes());
		
		return encoded;
	}

}
