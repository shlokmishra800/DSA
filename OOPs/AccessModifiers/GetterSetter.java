
class Account {
    public String name;
    protected String email;
    private String password;

    // Getter and Setter
    public String getPassword() {
        return this.password;

    }

    public void setPassword(String pass) {
        this.password = pass;

    }
}

public class GetterSetter {
    public static void main(String[] args) {

        Account s1 = new Account();
        s1.name = "Shlok";
        s1.email = "shlok@gmail.com";
        s1.setPassword("abcd");
        System.out.println(s1.getPassword());

    }
}
