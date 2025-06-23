package org.springframework.test.ioc;

public class UserService {

    private String uid;

    private UserDao userDao;

    public String queryUserInfo() {
        System.out.println("查询用户信息：" + userDao.queryUserName(uid));
        return userDao.queryUserName(uid);
    }

    // ...get/set

    public UserDao getUserDao() {
        return userDao;
    }

    public void setuId(String uId) {
        this.uid = uId;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public String getuId() {
        return uid;
    }
}
