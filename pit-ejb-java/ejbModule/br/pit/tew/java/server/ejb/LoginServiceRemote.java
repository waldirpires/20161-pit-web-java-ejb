package br.pit.tew.java.server.ejb;

import javax.ejb.Remote;

@Remote
public interface LoginServiceRemote {

	public boolean checkLogin(String username, String password);
}
