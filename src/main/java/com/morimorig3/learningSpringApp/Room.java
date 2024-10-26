package com.morimorig3.learningSpringApp;

public class Room {
    private String roomId;
    private String roomName;
    private int capacity;

    public Room(String roomId, String roomName, int capacity){
        this.roomId = roomId;
        this.roomName = roomName;
        this.capacity = capacity;
    }
    Room(){}

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
