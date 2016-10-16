package br.pit.tew.java.server.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import br.pit.tew.java.server.util.StringUtil;

/**
 * Session Bean implementation class LoginService
 */
@Stateless
@LocalBean
public class LoginService implements LoginServiceRemote, LoginServiceLocal {

    /**
     * Default constructor. 
     */
    public LoginService() {    }

	@Override
	public boolean checkLogin(String username, String password) {
		if (StringUtil.isEmpty(username) || StringUtil.isEmpty(password))
		{
			return false;
		}
		if ("admin".equals(username) && "admin".equals(password)){
			return true;
		} else {
			return false;
		}
	}    
}
