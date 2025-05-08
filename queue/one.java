
public class one {
    int []queue;
    int start;
    int end;
    one(int size){
        queue = new int[size];
        start = 0;
        end = -1;
    }
    void push(int value){
        if(end < queue.length-1){
            queue[++end] = value;
        }else{
            System.out.println("Queue is full!");
        }
    
    }
    void pop(){
        if(start <= end){
            System.out.println(queue[start++]);
        }else{
            System.out.println("Queue is empty!");
        }
    }
    void top(){
        System.out.println(queue[start]);
    }
    void size(){
        System.out.println(end-start+1);
    }
    public static void main(String[] args) {
        one obj = new one(5);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.pop();
        obj.pop();
        obj.pop();
        obj.top();
        obj.size();

    }
}
