package br.pit.tew.java.server.ejb;

import javax.ejb.Local;

@Local
public interface LoginServiceLocal {

	public boolean checkLogin(String username, String password);
}
