package teststack;

/**
 *
 * @author Samuele
 */
public class MyStack {

    int[] stack;
    int nextElementIndex;

    public MyStack(int n) {
        this.stack = new int[n];
        this.nextElementIndex = 0;
    }

    // inserisce un elemento nello stack
    public void push(int element) {
        if (nextElementIndex < stack.length) {
            this.stack[nextElementIndex] = element;
            nextElementIndex++;
        }
    }

    public int pop() throws Exception {
        if (nextElementIndex == 0) {
            throw new Exception("Lo stack è vuoto");
        }
        int aux = this.stack[nextElementIndex - 1];
        this.stack[nextElementIndex - 1] = 0;
        nextElementIndex--;
        return aux;
    }
// to string -- top -- is empty;

    public int top() {

        int top= 0;
         if (nextElementIndex == 0) {
             System.out.println("lo stack è vuoto");
         }else{
         top= stack[nextElementIndex -1];
         }
        
        return top;
    }
    
    public boolean isEmpty(){
        
        boolean isEmpty= false;
        
        if (nextElementIndex == 0){
        isEmpty= true;
        }
    
    return isEmpty;
    }
    
    
    public String toString(){
        
        for (int i = 0; i < nextElementIndex ; i++) {
            System.out.println(stack[i]);
            
        }
        return"";
    }

}//fine
