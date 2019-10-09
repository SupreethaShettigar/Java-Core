package arrays;

public class User {
int uid;
String uname;
Post[] posts;
public User() {

}
public User(int uid, String uname, Post[] posts) {
	super();
	this.uid = uid;
	this.uname = uname;
	this.posts = posts;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public Post[] getPosts() {
	return posts;
}
public void setPosts(Post[] posts) {
	this.posts = posts;
}

public void printUser()
{
	System.out.println("User id= " + uid);
	System.out.println("User name= " + uname);
	for (Post post :posts) {
		post.printPost();
	}
}
}
