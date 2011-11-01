
package pt.uac.cafeteria.model;

public class Administrator {

    private String username;
    private String password;

    public Administrator(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean isPasswordValid(String password) {
        return this.password.equals(password);
    }

}
