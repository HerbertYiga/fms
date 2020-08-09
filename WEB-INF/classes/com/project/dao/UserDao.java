package com.project.dao;

import com.project.model.User;
import java.util.List;

public interface UserDao {
  void addUser(User paramUser);
  
  void enableUser(int paramInt);
  
  void disableUser(int paramInt);
  
  List<User> listUser();
  
  void removeUser(int paramInt);
}


/* Location:              C:\Users\ODEL\Downloads\classes\!\com\project\dao\UserDao.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */