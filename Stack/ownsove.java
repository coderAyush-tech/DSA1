public class ownsove {
    int [] stack;
    int capacity;
    int top;
    
    
    ownsove(int size){
        capacity = size;
        top=-1;
        stack = new int[size];
    }

    public void push(int value){
        stack[++top] = value;
    }
    public int pop(){
        return stack[--top];
    }
    public void top(){
        System.out.println(stack[top]);

    }
    public void size(){
        System.out.println(top+1);
    }
    public static void main(String[] args) {
        ownsove obj = new ownsove(5);
        obj.push(1);
        obj.push(2);
        obj.size();
        obj.push(12);
        System.out.println(obj.pop());
        obj.top();
        obj.size();

    }
}
