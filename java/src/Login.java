public class Login {
    public boolean userLogin(User user, String userName, String password){
        return user.getUsername().equals(userName) && user.getPassword().equals(password);
    }
}
