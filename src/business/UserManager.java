package business;

import java.util.List;

import domain.User;

public interface UserManager {
	public void add(String id, String name, String password, String email, String type, String authority);//�����û�����

	public void edit(String id, String name, String password, String email, String type, String authority);//�༭�û�����

	public void delete(String id);

	public List<User> list();
	
	public List<User> listone(String id);
	
	public List<User> listtype(String type);//list the specific user

	public boolean login(String id, String password, String type);
	
	public boolean checkuser(String id);
	
	public User getUser(String id);
	
}
