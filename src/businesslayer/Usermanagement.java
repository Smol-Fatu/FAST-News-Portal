package businesslayer;

import java.util.ArrayList;
import java.util.List;

public class Usermanagement {
    
    private List<User> userList;
    
    public Usermanagement() {
        this.userList = new ArrayList<>();
    }
    
    public boolean createUser(String name, String email, String password) {
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                return false; // email already exists, cannot create user
            }
        }
        User newUser = new User(name, email, password);
        userList.add(newUser);
        return true; // user created successfully
    }
    
    public boolean updateUser(String email, String newName, String newPassword) {
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                user.setName(newName);
                user.setPassword(newPassword);
                return true; // user updated successfully
            }
        }
        return false; // user not found
    }
    
    public boolean deleteUser(String email) {
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                userList.remove(user);
                return true; // user deleted successfully
            }
        }
        return false; // user not found
    }
    
    public User getUserByEmail(String email) {
        for (User user : userList) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null; // user not found
    }
    
    public List<User> getUserList() {
        return userList;
    }
    
}
