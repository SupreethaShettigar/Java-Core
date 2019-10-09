package arrays;

public class Post {
	int pid;
	String title;
	String body;
	Comment[] comments;
	public Post() {
		
	}
	public Post(int pid, String title, String body, Comment[] comments) {
		super();
		this.pid = pid;
		this.title = title;
		this.body = body;
		this.comments = comments;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Comment[] getComments() {
		return comments;
	}
	public void setComments(Comment[] comments) {
		this.comments = comments;
	}
	public void printPost()
	{
		System.out.println("Post id= " + pid);
		System.out.println("Post title= " + title);
		System.out.println("Post body= " + body);
		for (Comment comment :comments) {
			comment.printComment();
		}
	}
	

}
