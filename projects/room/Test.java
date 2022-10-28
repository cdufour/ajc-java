package project.test;

import java.util.Scanner;
import project.room.Room;
import project.service.RoomService;

public class Test
{
    public static void main(String[] args) {
        RoomService rs = new RoomService();

        rs.create(new Room("A", "Salle 1"));
        rs.create(new Room("B", "Salle 2"));
        rs.create(new Room("C", "Salle 3"));
        rs.create(new Room(42, "D", "Salle 4"));

        System.out.println("Liste des salles: ");
        for(Room r : rs.findAll())
            System.out.println("\t" + r);

        System.out.println("Supprime la salle d'id 1");
        rs.delete(rs.findById(1));

        System.out.println("Modifile la salle d'id 2");
        Room room = rs.findById(2);

        System.out.println("\tSalle a modiifer : " + room);
        Scanner sc = new Scanner(System.in);

        System.out.println("Donner le nouveau code: ");
        room.setCode(sc.nextLine());

        System.out.println("Donner le nouveau libelle: ");
        room.setLabel(sc.nextLine());

        rs.update(room); // redondant cat les setters ont déjà modifié l'original par réf.

        System.out.println("Liste des salles post modification: ");
        for(Room r : rs.findAll())
            System.out.println("\t" + r);

    }
}