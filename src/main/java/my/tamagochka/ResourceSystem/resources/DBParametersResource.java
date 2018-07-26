package my.tamagochka.ResourceSystem.resources;

public class DBParametersResource {
    private final String name;
    private final String user;
    private final String pass;

    public DBParametersResource() {
        name = "";
        user = "";
        pass = "";
    }

    public DBParametersResource(String name, String user, String pass) {
        this.name = name;
        this.user = user;
        this.pass = pass;
    }

    public String getName() { return name; }
    public String getUser() { return user; }
    public String getPass() { return pass; }

    @Override
    public String toString() {
        return "DBParametersResource{name='" + name + "', user='" + user + "', pass='" + pass + "']";
    }

}
