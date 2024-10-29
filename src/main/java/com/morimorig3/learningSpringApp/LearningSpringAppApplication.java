package com.morimorig3.learningSpringApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootApplication
public class LearningSpringAppApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(LearningSpringAppApplication.class, args);
		// DIを利用することでこの実装でよくなる
		// 依存関係を記述するのはAppConfig.class
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcRoomDao jdbcRoomDao = context.getBean(JdbcRoomDao.class);
		List<Room> roomList = jdbcRoomDao.getAllRoom();
		for (Room room: roomList){
			System.out.println(room.getRoomName());
		}

		Room newRoom = new Room("A002", "地獄の黙秘録", 1000);

		jdbcRoomDao.updateByRoomId(newRoom);

		List<Room> newRoomList = jdbcRoomDao.getAllRoom();
		for (Room room: newRoomList){
			System.out.println(room.getRoomName());
		}
	}
}
