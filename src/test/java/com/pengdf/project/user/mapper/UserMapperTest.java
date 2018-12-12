package com.pengdf.project.user.mapper;

import com.pengdf.project.user.entity.UserEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private UserMapper usermapper;

    @Test
    public void findAll() throws Exception {
        List<UserEntity> list = usermapper.findAll();
        System.out.println(list);
    }

}