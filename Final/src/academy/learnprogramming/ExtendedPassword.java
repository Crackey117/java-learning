package academy.learnprogramming;

public class ExtendedPassword extends Password{
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }
    //final methods cannot be overridden
    //@Override
    //public void storePassword() {
    //    System.out.println("Saving password as " + this.decryptedPassword);
    //}
}
