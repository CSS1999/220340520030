class stack2{
	
	int a1[];
	int s;
	int top1, top2;
	stack2(int n){
		s = n;
		a1 = new int[n];
		top1 = n/2 +1;
		top2 = n/2;
	}
	public void push1(int x){
		if(top1>0){
			top1--;
			a1[top1] = x;
		} else {
			System.out.print("Stack Overflow!! ");
		}
	}
	public void push2(int x){
		if(top2>0){
			top2++;
			a1[top2] = x;
		} else {
			System.out.println("Stack Overflow!! ");
		}
	}
	int pop1(){
		if(top1 <= s/2){
			int x = a1[top1];
			top1++;
			return x;
		} else {
			System.out.println("Stack Underflow!! ");
		}
		return 0;
	}
	int pop2(){
		if(top2 >= s/2){
			int x = a1[top2];
			top2--;
			return x;
		} else {
			System.out.println("Stack Underflow!! ");
		}
		return 1;
	}
	
}
class Stack{
	
	public static void main(String[] args){
		stack2 s1 = new stack2(10);
		s1.push1(5); 
		s1.push2(10); 
		s1.push2(15); 
		s1.push1(11); 
		s1.push2(7); 
		s1.push2(40);
		System.out.println("Popped element from stack1 is "+s1.pop1());
		System.out.println("Popped element from stack1 is "+s1.pop2());
	}
}