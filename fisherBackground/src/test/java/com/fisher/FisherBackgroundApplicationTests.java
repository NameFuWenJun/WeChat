package com.fisher;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import com.fisher.mapper.UserMapper;
import com.fisher.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=FisherBackgroundApplication.class)
public class FisherBackgroundApplicationTests {
	@Autowired
	private UserMapper userMapper;
	@Test
	public void contextLoads() {
		User test=new User();
		test.setUserId(1);
		test.setUserName("test");
		test.setOpenid("test");
		test.setUserPassword("123456");
		userMapper.insert(test);
		
	}

}
