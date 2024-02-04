package businesslayer;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.events.Comment;

public class Newsfeed {
    private String title;
    private String content;
    private Date publishDate;
    private List<Comment> comments;
    private int likes;

    public Newsfeed(String title, String content, Date publishDate) {
        this.title = title;
        this.content = content;
        this.publishDate = publishDate;
        this.comments = new ArrayList<Comment>();
        this.likes = 0;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public void removeComment(Comment comment) {
        this.comments.remove(comment);
    }

    public int getLikes() {
        return likes;
    }

    public void like() {
        this.likes++;
    }

    public void unlike() {
        this.likes--;
    }
}
