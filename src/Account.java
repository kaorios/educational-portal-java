public class Account {
    private String username;
    private String password;

    Account () {
        this.username = "";
        this.password = "";
    }

    Account (String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
