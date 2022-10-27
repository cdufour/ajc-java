package project.service;

import java.util.List;
import java.util.ArrayList;

import project.room.Room;
import project.dao.IDao;

public class RoomService implements IDao<Room> {

    private List<Room> rooms;

    public RoomService() {
        this.rooms = new ArrayList<Room>();
    }

    public boolean create(Room room) {
        return this.rooms.add(room);
    }
    
    public boolean update(Room room) {
        for(Room r : this.rooms) {
            if (r.getId() == room.getId()) {
                r.setCode(room.getCode());
                r.setLabel(room.getLabel());
                return true;
            }
        }
        return false;
    }
    
    public boolean delete(Room room) {
        return this.rooms.remove(room);
    }

    public List<Room> findAll() {
        return this.rooms;
    }

    public Room findById(int id) {
        for(Room r : this.rooms) {
            if (r.getId() == id)
                return r;
        }
        return null;
    }

}