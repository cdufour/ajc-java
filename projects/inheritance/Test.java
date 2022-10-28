package project.test;

import project.Profile;
import project.User;

public class Test
{
    public static void main(String[] args) {
        // création de profils
        Profile profiles[] = new Profile[2];
        profiles[0] = new Profile("MN", "Manager");
        profiles[1] = new Profile("DG", "Directeur");

        // création d'utilisateurs
        User users[] = new User[2];
        users[0] = new User("Chris", "D", "", "", 10000, "login", "pass", "net", profiles[0]);
        users[1] = new User("Toto", "T", "", "", 10000, "login", "pass", "net", profiles[1]);

        System.out.println("Liste des utilisateurs: ");
        for (User u : users) {
            u.show();
        }

        System.out.println("\n\nListe des managers: ");
        for (User u : users) {
            if (u.getProfile().getCode().equalsIgnoreCase("mn")) {
                u.show();
            }
        }
    }
}