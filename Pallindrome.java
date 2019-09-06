package linked_List;

import java.util.Stack;
import java.util.*;

class Palindrome
{
    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head) 
    {
        int noOfNodes = 0;
        boolean isPallindrome=true;
        Node temp = head;
        System.out.println("M");
        while(temp.next!=null){
            noOfNodes++;
            temp = temp.next;
        }
        noOfNodes++;
        System.out.println("No of nodes= "+ noOfNodes );
        int middle=noOfNodes/2;
        Stack<Integer> stacky = new Stack<Integer>();
        Node mid = head; // node of the middle
        for(int i =0; i<middle; i++){
            stacky.push(mid.data);
            mid=mid.next;
        }
        System.out.println(stacky.toString());
        // number of nodes is even
        if(noOfNodes%2==0){
            for(int x=0; x<middle; x++){
	            if(stacky.pop()==mid.data){
	              //System.out.println(mid.data);
	              //continue;
	              mid=mid.next;
	              isPallindrome = true;
	              }
	            
	            else{
	                isPallindrome = false;
	                }
	            }
        }
        //System.out.println("We are out of it");
        // number of nodes is odd
        else{
        	mid = mid.next;
            for(int x=0; x<middle; x++){
            	
	            if(stacky.pop()==mid.data){
	              System.out.println(mid.data);
	              //continue;
	              mid=mid.next;
	              isPallindrome = true;
	              }
	            
	            else{
	                isPallindrome = false;
	                }
	            
            }
            
        }
        return isPallindrome;
    }
    
}


class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}
public class Pallindrome
{
	 Node head;  
	
	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
    }
	
 
    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) 
	{
		if (head == null) 
		{
			head = node;
		} else 
		{
		   Node temp = head;
		   while (temp.next != null)
		   temp = temp.next;
		   temp.next = node;
		}
    }
	
	public static void main(String args[])
	{
		System.out.println("Araam");
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		System.out.println("Took number of test cases: "+t);
		 
		while(t>0)
        {	System.out.println("Enter the number of nodes");
			int n = sc.nextInt();
			System.out.println("Nodes = "+ n);
			//int k = sc.nextInt();
			Pallindrome llist = new Pallindrome();
			//int n=Integer.parseInt(br.readLine());
			int a1=sc.nextInt();
			Node head= new Node(a1);
			System.out.println("karna");
            llist.addToTheLast(head);
            System.out.println("hai");
            for (int i = 1; i < n; i++) 
			{System.out.println("Araam");
				int a = sc.nextInt(); 
				llist.addToTheLast(new Node(a));
			}
            System.out.println("Araam");
			Palindrome g = new Palindrome();
			System.out.println("Hey");
			if(g.isPalindrome(llist.head) == true)
			System.out.println(1);
		else
			System.out.println(0);
			t--;
		}
		
	}
}

