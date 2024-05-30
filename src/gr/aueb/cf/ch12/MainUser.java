package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.User;
import gr.aueb.cf.ch12.model.UserCredentials;

public class MainUser {

    public static void main(String[] args) {
        User steve = new User(1, "Steve", "Harris");
        UserCredentials steveAccount = new UserCredentials(1, "SHarris", "12345613");

        System.out.println("User's id, firstname, lastname: {" + steve.getId() + ", " + steve.getFirstname() + ", " + steve.getLastname() + "}");
        System.out.println("User's account_id, username, password: {" + steveAccount.getId() +  ", " + steveAccount.getUsername() + ", " + steveAccount.getPassword() + "}");
    }
}
