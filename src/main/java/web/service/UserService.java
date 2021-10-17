package web.service;

import web.model.User;

import java.util.List;

public interface UserService {


    public List<User> getAllUsers ();
    public User getUserById (Long id);

    public void addUser (User user);
    public void deleteUser (Long id);
    public void editUser (User user);



}
