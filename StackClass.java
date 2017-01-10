package Stackpack;



interface Stack{
	void  push(int i);
	int pop();
}

class FixedStack implements Stack{
	
	 int i1;
	 FixedStack(int ii)
    {
        this.i1 = ii;
    }

   public int getValue()
    {
        return i1;
    }
   
	int capacity=getValue();
	 int top = -1;

	public void push(int i){
		int arr[]=  new int[i1];

		if(top < i1 -1){
			   top++;
         arr[top]=i;
        System.out.println("Element " + i + " is pushed to Stack !");

		}else {
			   System.out.println("Stack Overflow !");
		 }
		

	}

	public int pop() {
		if(top>=0){
			top--;
			   System.out.println("Pop operation done !");
		}
		else{
			   System.out.println("Stack Underflow !");
		}
		return 0;
	}
	
	


	
}






public class StackClass {
	 public static void main(String[] args) {
		 
		 FixedStack s1 = new FixedStack(3);
		int val =  s1.getValue();

		 s1.pop();
		 s1.push(23);
		 s1.push(2);
		 s1.push(73);
		 s1.push(21);
		


	 }
}