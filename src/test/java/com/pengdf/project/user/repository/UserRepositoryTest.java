package com.pengdf.project.user.repository;

import com.pengdf.project.user.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveTest() {
        UserEntity u = new UserEntity();
        u.setName(UUID.randomUUID().toString());
        u.setPassword("XXXXX");
        userRepository.save(u);
        u.setName("kkkkk");
        userRepository.save(u);
    }

}