package arrays;

public class Comment {
int cid;
String ctext;
public Comment() {
	
}

public Comment(int cid, String ctext) {
	super();
	this.cid = cid;
	this.ctext = ctext;
}

public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCtext() {
	return ctext;
}
public void setCtext(String ctext) {
	this.ctext = ctext;
}
public void printComment() {
	System.out.println("Comment id= " + cid);
	System.out.println("Comment text= " + ctext);
	
}
}
