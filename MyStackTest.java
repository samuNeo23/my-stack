package teststack;

/**
 *
 * @author Samuele
 */
public class TestStack {

    public static void main(String[] args) {

        MyStack stack = new MyStack(5);
        stack.push(10);
        stack.push(10);
        stack.push(4);
        stack.push(4);
        stack.push(10);

        int elem;
//        try{
//            elem = stack.pop();
//            elem = stack.pop();
//            elem = stack.pop();
//            elem = stack.pop();
//            elem = stack.pop();
//            elem = stack.pop();
//            elem = stack.pop();
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//        }
        System.out.println(stack.top());
        System.out.println(stack.isEmpty());
        System.out.println(stack.toString());
    }//fine main

}
