package users;

import tools.FileReaderAndWriter;

import java.util.ArrayList;

public class UserChecker {
    public String isUser(String firstInput, String secondInput) {
        FileReaderAndWriter<User> fileReaderAndWriter = new FileReaderAndWriter<>();
        ArrayList<User> usersList = (ArrayList<User>) fileReaderAndWriter.readFile("/src/users/UsersList.txt");

        for (User user: usersList) {
            if (firstInput.equals(user.getName()) || firstInput.equals(user.getEmail())) {
                if (secondInput.equals(user.getPassword())) {
                    if ((user.getType()).equals("Admin")) {
                        return "Admin";
                    }
                    else {
                        return "true";
                    }
                }
            }
        }
        return "false";
    }

    public boolean isValidUser(String input) {
        FileReaderAndWriter<User> fileReaderAndWriter = new FileReaderAndWriter<>();
        ArrayList<User> usersList = (ArrayList<User>) fileReaderAndWriter.readFile("/src/users/UsersList.txt");

        for (User user: usersList) {
            if (input.equals(user.getName()) || input.equals(user.getEmail())) {
                return false;
            }
        }
        return true;
    }

    public void saveNewUser(String name, String email, String password) {
        User user = new User(name, email, password, "User");
        FileReaderAndWriter<User> fileReaderAndWriter = new FileReaderAndWriter<>();

        ArrayList<User> usersList = (ArrayList<User>) fileReaderAndWriter.readFile("/src/users/UsersList.txt");

        usersList.add(user);
        fileReaderAndWriter.writeToFile(usersList, "/src/users/UsersList.txt");
    }

    public void saveNewUserInfo(String name, String email, String password) {
        FileReaderAndWriter<User> fileReaderAndWriter = new FileReaderAndWriter<>();

        ArrayList<User> usersList = (ArrayList<User>) fileReaderAndWriter.readFile("/src/users/UsersList.txt");

        for (User user: usersList) {
            if (name.equals(user.getName()) && email.equals(user.getEmail())) {
                user.setPassword(password);
            }
        }

        fileReaderAndWriter.writeToFile(usersList, "/src/users/UsersList.txt");
    }
}
