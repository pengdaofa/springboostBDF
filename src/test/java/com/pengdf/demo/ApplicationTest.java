package com.pengdf.demo;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.pengdf.demo.entity.Yh;
import com.pengdf.demo.entity.YhExample;
import com.pengdf.demo.mapper.YhMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class ApplicationTest {

    @Autowired
    private YhMapper yhMapper;

    @Test
    public void contextLoads() {
        YhExample example = new YhExample();
        PageHelper.startPage(1, 10);
        List<Yh> list = yhMapper.selectByExample(example);
        PageInfo pageInfo = new PageInfo(list);
        System.out.println(pageInfo.getTotal());
        System.out.println(pageInfo.getPageSize());
    }

}
