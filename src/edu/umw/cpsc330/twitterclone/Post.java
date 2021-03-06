package edu.umw.cpsc330.twitterclone;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Container class for posts.
 * 
 * @author Alex Lindeman
 */
public class Post {
    
    /**
     * ID of the post.
     */
    public int id;

    /**
     * Author of the post.
     */
    public String author;

    /**
     * Date when the post was made.
     */
    public Date date;

    /**
     * Contents of the post.
     */
    private String content;

    /**
     * Defines if the message is directed at everyone or just followers of the
     * author.
     */
    public boolean isPublic;
    
    /**
     * Default constructor
     */
    public Post() {
	
    }
    
    /**
     * Returns the post as a string.
     * @return post as a String
     */
    public String toString() {
	// format the date
	Format f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String d = f.format(this.date);
	
	return author + " - " + content + " (" + d + ")";
    }

    /**
     * @return Contents of the post.
     */
    public String getContent() {
	return content;
    }

    /**
     * Sets content of the post. Also checks that the post is 140 characters or
     * less. If the post is longer than 140 characters, it is truncated to fit.
     * @param content Content to add
     */
    public void setContent(String content) {
	if (content.length() <= 140)
	    this.content = content;
	else
	    this.content = content.substring(0, 139);
    }
}
