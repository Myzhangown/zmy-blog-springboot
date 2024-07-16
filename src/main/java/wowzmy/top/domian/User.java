package wowzmy.top.domian;

import java.io.Serializable;
//系统用户实体类
public class User implements Serializable {
    //  - user_id (主键)
    private String userId;
    //  - username (用户名)
    private String username;
    //  - password (密码，需要加密存储)
    private String password;
    //  - email (邮箱)
    private String email;
    //  - created (创建时间)
    private String created;
    //  - last_modified (更新时间)
    private String lastModified;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }
}
