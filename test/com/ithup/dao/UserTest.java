package com.ithup.dao;

import org.junit.Test;

import com.ithuplion.dao.UserDao;
import com.ithuplion.domain.User;
import com.ithuplion.utils.CommonsUtils;

/**
 * 用户测试
 * @author acer
 *
 */
public class UserTest {
	/**
	 * 测试用户添加数据是否成功
	 */
	@Test
	public void addUser(){
		UserDao userDao = new UserDao();
		User user = new User();
		user.setUid(CommonsUtils.getUUID());
		user.setUsername("tom");
		user.setPassword("123");
		userDao.register(user );
	}
}
