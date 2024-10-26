package com.morimorig3.learningSpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class JdbcRoomDao {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @Autowired
    NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public int findMaxCapacity(){
        String sql = "SELECT MAX(capacity) FROM room";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    public String findRoomNameById(String room_id){
        String sql = "SELECT room_name FROM room WHERE room_id = ?";
        return jdbcTemplate.queryForObject(sql, String.class, room_id);
    }

    public Room getRoomById(String roomId){
        String sql = "SELECT room_id, room_name, capacity from room WHERE room_id = :roomId";
        Map<String, Object> params = new HashMap<>();
        params.put("roomId", roomId);
        Map<String, Object> result = namedParameterJdbcTemplate.queryForMap(sql,params);
        Room room = new Room();
        room.setRoomName((String) result.get("room_name"));
        room.setRoomId((String) result.get("room_id"));
        room.setCapacity((Integer) result.get("capacity"));
        return room;
    }

    public List<Room> getAllRoom(){
        String sql = "SELECT room_id, room_name, capacity from room";
        List<Map<String, Object>> resultList = jdbcTemplate.queryForList(sql);
        List<Room> roomList = new ArrayList<Room>();
        for(Map<String, Object> result: resultList){
        Room room = new Room();
        room.setRoomName((String) result.get("room_name"));
        room.setRoomId((String) result.get("room_id"));
        room.setCapacity((Integer) result.get("capacity"));
        roomList.add(room);
        }
        return roomList;
    }
}
