public class Main {
    public static void main(String[] args) {
        User user = new User("rk","123");
        Login login = new Login();
        Logout logout = new Logout();
        boolean isLogin= login.userLogin(user,"rk","123");
        if(isLogin){
            System.out.println("User login Successfully");
            logout.userLogout(user);

        }
        else {
            System.out.println("User login Unsuccessfully");
        }
    }
}