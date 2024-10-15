package com.morimorig3.learningSpringApp;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    // コンストラクタで実装クラスを作成しているので、UserServiceImpl実装時点ですべてのクラスが揃っている必要がある
    // 故に、結合度が高い
    public UserServiceImpl(javax.sql.DataSource dataSource){
        // データベース上のユーザー情報を操作するクラス
        this.userRepository = new JdbcUserRepository(dataSource);
        // BCryptアルゴリズムでハッシュ化するクラス
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public void register(User user, String rawPassword){

    }
}
