package businesslayer;

public class User {
    private String name;
    private String email;
    private String password;
    private boolean isAdmin;

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isAdmin = false;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

	public void setName(String newName) {
		// TODO Auto-generated method stub
		
	}

	public void setPassword(String newPassword) {
		// TODO Auto-generated method stub
		
	}
}
