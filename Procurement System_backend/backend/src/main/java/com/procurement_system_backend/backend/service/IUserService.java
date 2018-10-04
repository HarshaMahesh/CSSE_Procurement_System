
package com.procurement_system_backend.backend.service;

import com.procurement_system_backend.backend.entity.Users;

/**
 * @author windula
 *
 */
public interface IUserService {

	Users loginUser(String username,String pwd);
}
