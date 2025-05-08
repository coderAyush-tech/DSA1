class MyStack {
    private int[] stack;
    private int top;
    private int capacity;

    public MyStack(int size) {
        stack = new int[size]; 
        capacity = size;
        top = -1;
    }

  
    public void push(int value) {
        if (top < capacity - 1) {
            stack[++top] = value;
        } else {
            System.out.println("Stack is full!");
        }
    }

   
    public int pop() {
        if (top >= 0) {
            return stack[top--];
        } else {
            System.out.println("Stack is empty!");
            return -1; 
        }
    }

  
    public int top() {
        if (top >= 0) {
            return stack[top];
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }

  
    public int size() {
        return top + 1;
    }
}


public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(5);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        System.out.println("Top element: " + myStack.top()); 
        System.out.println("Stack size: " + myStack.size()); 
        myStack.pop();
        System.out.println("Top element after pop: " + myStack.top());
    }
}