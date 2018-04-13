package cn.clothes.service;

import java.util.List;

import cn.clothes.domain.UserTable;
/**接口：用户服务*/
public interface UserService {//接口：用户服务
	List<UserTable> findAll();//对UserTable进行集合的泛型处理，并将其创建对象为findAll()
	UserTable findUserByName(String username);//集合UserTable创建对象findUserByName，根据用户名查询
	void addUser(UserTable userTable);//从类UserTable（用户表）中添加增加用户的方法addUser
}
