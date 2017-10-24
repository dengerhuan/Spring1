package cn.nokia.helloword;

/**
 * Created by fan on 2017/10/21.
 */
public class HUser {
    private String user;

    public HUser() {
        System.out.println("HUser's constructor...");
    }

    public void setUser(String user) {
        System.out.println("setUser:" + user);
        this.user = user;
    }

    public HUser(String user) {
        this.user = user;
    }

    public void hello() {
        System.out.println("Hello: " + user);
    }
}
