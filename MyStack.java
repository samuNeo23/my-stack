package mystack;

public class MyStack {

    int[] stack;
    int nextElementIndex;

    public MyStack(int n){
        this.stack = new int[n];
        this.nextElementIndex = 0;
    }

    // inserisce un elemento nello stack
    public void push(int element){
        if(nextElementIndex < stack.length){
            this.stack[nextElementIndex] = element;
            nextElementIndex++;
        }
    }

    public int pop() throws Exception{
        if(nextElementIndex == 0){
            throw new Exception("Lo stack è vuoto");
        }
        int aux = this.stack[nextElementIndex - 1];
        this.stack[nextElementIndex - 1] = 0;
        nextElementIndex--;
        return aux;
    }


}