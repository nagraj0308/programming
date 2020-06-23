//convert a array in linkedlist
import java.util.Scanner;
class Node{
 int val;
 Node nextNode;

	public Node(int val){
		this.val=val;
	}

	int getVal(){
		return val;
	}

	void setNextNode(Node nextNode){
		this.nextNode=nextNode;
	}
      Node getNextNode(){
		return nextNode;
	}

}

class LinkedList1{
	public static void main(String args[]){
		LinkedList1 ll=new LinkedList1();
		Node head,cur;
		Scanner in = new Scanner(System.in);
		System.out.print("Plese enter the number of intergers");
		int n= in.nextInt();
		int i=0;
                head=new Node(0);
		cur=head;
		while(i<n){
			if(i==0){
				head=new Node(in.nextInt());
				cur=head;
			}else{
			cur.setNextNode(new Node(in.nextInt()));
			cur=cur.getNextNode();
			} 
			i++;
			
		}
		printLinkedList(head);
     }

void printLinkedList(Node head){
      Node node=head;
		while(node!=null){
		 System.out.println(node.getVal());
		node=node.getNextNode();
		}
}



}