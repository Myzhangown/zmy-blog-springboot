package wowzmy.top.domian;

import java.io.Serializable;

public class Article implements Serializable {
    // - post_id (主键)
    private String postId;
    // - title (标题)
    private String title;
    // - content (内容)
    private String content;
    // - user_id (作者ID，关联到用户表)
    private String userId;
    // - created (创建时间)
    private String created;
    // - last_modified (更新时间)
    private String lastModified;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
