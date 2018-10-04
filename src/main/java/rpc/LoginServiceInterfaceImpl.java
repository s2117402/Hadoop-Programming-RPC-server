package rpc;

public class LoginServiceInterfaceImpl implements LoginServiceInterface {
    public String login(String username, String password) {
        return username+" Welcome!";
    }
}
