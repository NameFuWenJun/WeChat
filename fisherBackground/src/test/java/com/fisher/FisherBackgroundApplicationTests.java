package com.fisher;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.fisher.mapper.PathMapper;
import com.fisher.mapper.UserMapper;
import com.fisher.pojo.User;
import com.fisher.service.ImageService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=FisherBackgroundApplication.class)
public class FisherBackgroundApplicationTests {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private ImageService imageService;
	@Autowired
	private PathMapper pathmapper;
	@Test
	public void contextLoads() {
		User test=new User();
		test.setUserName("test");
		test.setOpenid("test1");
		test.setUserPassword("123456");
		userMapper.insert(test);
		
	}
	@Test
	public void test(){
	    System.out.println(pathmapper.selectString(1).get(0));
	}

}
