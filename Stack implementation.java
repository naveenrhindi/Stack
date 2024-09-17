class StackImplementation {
    
    int[] st;
    int top;
    int size;
    
    public StackImplementation(int size) {
        st = new int[size];
        top = -1;
        this.size = size;
    }
    
    public void push(int val) {
        if(top<-1) {
            System.out.println("Stack is Full..");
            return ;
        }
        st[++top] = val;
    }
    
    public int size() {
        if(top<=-1) {
            System.out.println("Stack is Empty..");
            return Integer.MIN_VALUE;
        }
        return (top+1);
    }
    
    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty..");
            return Integer.MIN_VALUE;
        }
        return st[top--];
    }
    
    public boolean isEmpty() {
        return (top<=-1);
    }
    
    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE;
        }
        return st[top];
    }
    
    public Boolean isValid(String s) {
        int n = s.length();
        if(n%2 != 0) return false;
    //    if(s.charAt(0) == ']' || ')' || '}') return false;
        for(int i=0;i<n;i++) {
            char ch = s.charAt(i);
            if(ch == '[' || ch == '(' || ch == '{') {
                push(ch);
            }
            else {
                pop();
            }
        }
        return (isEmpty()) ? true : false;
    }
    
    
    public static void main(String[] args) {
      
      StackImplementation st = new StackImplementation(5);
   //   System.out.println(st);
   
      st.push(10);
      st.push(20);
      st.push(30);
      
     System.out.println("size : "+st.size());
     
     System.out.println("Poped element is : "+st.pop());
     
     System.out.println("size : "+st.size());
      
     System.out.println("Is Empty : "+st.isEmpty());
      
     System.out.println("Poped element is : "+st.pop());
     System.out.println("Poped element is : "+st.pop());
     
      
      System.out.println("Peek element is : "+st.peek());
      
      System.out.println("Is Valid : "+st.isValid(")()"));
      
    }
}



  
