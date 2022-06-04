import java.util.*;

class Stack
{
   int[] a;
   int top;
   Stack()
   {	
	a=new int[100];
	top=-1;
   }
  
  void push(int x)
  {	
	if(top==a.length-1)
	  System.out.println("Overflow");
	else
	 a[++top]=x;
   }
   
   int pop()
   {
     if(top==-1)
		{System.out.println("Underflow");
	     return -1;
		}
	 else
	   return(a[top--]);
	}
	
	void display()
	{
		for(int i=0;i<=top;i++)
			System.out.print(a[i]+" ");
		System.out.println();	
	}
	
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		else 
			return false;
	}
	
	int peek()
	{
		if(top==-1)
			return -1;
		return (a[top]);
	}
	
	
}

public class Demo
{
	public static void main(String args[])
	{
		
		Stack s=new Stack();
		Scanner in= new Scanner(System.in);
		
		 do
			{System.out.println("\n******** MENU *******\n1.PUSH\n2.POP\n3.PEEK\n4 IS EMPTY\n5.EXIT");
			 System.out.println("\n enter ur choice : ");
			 switch(in.nextInt())
				{
				 case 1: 
					 System.out.println("\nenter the value ");
					 s.push(in.nextInt());
					 break;
				 case 2: 
					System.out.println("\n popped element : "+ s.pop());
					 break;
				 
				case 3: 
					System.out.println("\n top element : "+ s.peek());
					 break;
				 case 4: System.out.println("\n is empty : "+ s.isEmpty());
						 break;
				 case 5: System.exit(0);
						 break;
				 default: System.out.println("\n Wrong Choice!");
						  break;
				}
			 System.out.println("\n Do you want to continue? ");
			}while(in.nextInt()==1);

	}
}

