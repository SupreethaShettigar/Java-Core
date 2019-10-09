package arrays;

import java.util.Scanner;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of user:");
		User[] users=new User[scan.nextInt()];
		for(int i=0;i<users.length;i++)
		{
			users[i]=new User();
			System.out.println("Enter user id:");
			users[i].setUid(scan.nextInt());
			System.out.println("Enter user Name:");
			users[i].setUname(scan.next());
			System.out.println("Enter the number of post");
			Post[] posts=new Post[scan.nextInt()];
			for(int j=0;j<posts.length;j++) {
				posts[j]=new Post();
				System.out.println("Enter post id:");
			    posts[j].setPid(scan.nextInt());
				System.out.println("Enter post title:");
				posts[j].setTitle(scan.next());
				System.out.println("Enter post body:");
				scan.nextLine();
				posts[j].setBody(scan.nextLine());
				System.out.println("Enter the number of comments");
				Comment[] comments=new Comment[scan.nextInt()];
				for(int k=0;k<comments.length;k++)
				{
					comments[k]=new Comment();
					System.out.println("Enter comment id:");
					comments[k].setCid(scan.nextInt());
					System.out.println("Enter comment text:");
					scan.nextLine();
					comments[k].setCtext(scan.nextLine());		
				}
				posts[j].setComments(comments);
						
			}
			users[i].setPosts(posts);
			
		}
		
		
		for (User user : users) {
			user.printUser();
			System.out.println("-------------------------------");
		}

		

	}

}
