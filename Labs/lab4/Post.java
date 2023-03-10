import java.util.Calendar;
import java.util.Date;

public class Post implements Likeable, Comparable<Post> {

    protected int likes;
    private Date timeStamp;
    private String userName;

    public Post(String userName) {
        this.userName = userName;
        this.timeStamp = Calendar.getInstance().getTime();
        this.likes = 0;
    }

    public String getUserName() {
	     return userName;
    }

    public Date getTimeStamp() {
	     return timeStamp;
    }

    @Override
    public void like() {
        this.likes++;
    }

    @Override
    public int getLikes() {
        return this.likes;
    }

    public String toString() {
    	  String str = new String();
    	  str = getClass().getName() + ": " + timeStamp + ", " + userName + ", likes = " + likes;
    	  return  str;
    }


  	public int compareTo(Post other) {
        return this.timeStamp.compareTo(other.timeStamp);
  	}

  	public boolean isPopular(){
        if (this.likes > 100) {
            return true;
        } else {
            return false;
        }
  	}

}
