package com.morimorig3.learningSpringApp;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    // クラス内でnewするのをやめて、インターフェースを引数で受け取る形にする
    // 結合度が少し下がった
    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder){
        // データベース上のユーザー情報を操作するクラス
        this.userRepository = userRepository;
        // BCryptアルゴリズムでハッシュ化するクラス
        this.passwordEncoder = passwordEncoder;
    }

    public void register(){
        System.out.println("execute register");
    }
}
