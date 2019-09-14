package kw.suanfa.demo;

/**
 * 	给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 我们将其加起来
 * @author Administrator
 *
 */
public class Demo02 {
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	}
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	ListNode l3 = new ListNode(0);
	ListNode p1=l1,p2=l2,curr=l3;
	int c = 0;
	int a=0;
	int b=0;
	while(p1!=null||p2!=null) {
		int l1num,l2num;
		if(p1!=null) {
			l1num=p1.val;
		}else {
			l1num=0;
		}
		if(p2!=null) {
			l2num=p2.val;
		}else {
			l2num=0;
		}
		c=l1num+l2num;
		b=c%10;
		curr.next=new ListNode(b);
		a=c/10;
		curr=curr.next;
      p1=p1.next;
      p2=p2.next;
	}
	if(a>0) {
		curr.next=new ListNode(a);
	}
	return l3;
}
    
    public static void main(String[] args) {
    	
	}
   /* public static ListNode addTwoNumbers1() {
    	ListNode l1;
    	l1.next = new ListNode(2);
    	l1.next = new ListNode(4);
    	l1.next = new ListNode(3);
    	 
    	ListNode l2=new ListNode(1);
    	l2.next = new ListNode(5);
    	l2.next = new ListNode(6);
    	l2.next = new ListNode(4);
    	
    	
    	ListNode l3 = new ListNode(0);
    	ListNode p1=l1,p2=l2,curr=l3;
    	int cur=0;
    	int c=0;
    	while(p1!=null&&p2!=null) {
    		cur=p1.val+p2.val;
    		if(c>0) {
    			cur+=c;
    		}
    		if(cur>9) {
    			cur=cur%10;
    			c=1;
    		}
    		
    		curr.next=new ListNode(cur);
    		p1=p1.next;
    		p2=p2.next;
    	}
    	if(p1!=null) {
    		if(c>0) {
    			curr.next=new ListNode(p1.val+c);
    		}else {
    			curr.next=new ListNode(p1.val);
    		}
    		p1=p1.next;
    	}
    	
    	if(p2!=null) {
    		if(c>0) {
    			curr.next=new ListNode(p2.val+c);
    		}
    		else {
    			curr.next=new ListNode(p2.val);
    		}
    		p2=p2.next;
    	}
   
    	return l3;
    }*/
}

/**
 * java.lang.NullPointerException
  at line 18, Solution.addTwoNumbers
  at line 54, __DriverSolution__.__helper__
  at line 81, __Driver__.main
 */
