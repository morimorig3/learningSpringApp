package com.morimorig3.learningSpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

//    // クラス内でnewするのをやめて、インターフェースを引数で受け取る形にする
//    // 結合度が少し下がった
//    @Autowired
//    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder){
//        // データベース上のユーザー情報を操作するクラス
//        this.userRepository = userRepository;
//        // BCryptアルゴリズムでハッシュ化するクラス
//        this.passwordEncoder = passwordEncoder;
//    }

    public void register(){
        userRepository.userByUsername("execute register!!");
    }
}
