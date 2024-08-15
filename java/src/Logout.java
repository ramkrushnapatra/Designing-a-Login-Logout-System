public class Logout {
    public void userLogout(User user)
    {
        user.setUsername(null);
        user.setPassword(null);
        System.out.println("userLogout SuccessFull");
    }
}
