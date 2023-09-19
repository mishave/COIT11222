public class SwapNumbers {
    public static void main(String[] args) throws Exception {
        int x = 5;
        int y =200;
        System.out.println("At the start");
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        //we want x to have the value that was in y
        //and y to have the value that was in x (i.e. swap their values)
        //Because each variable can only hold one value at a time, we need
        //to have a third variable to temporarily save the value about to
        //be overwritten. We'll call it temp and use it to achieve the swap
        int temp = x;
        x = y;
        y = temp;
        System.out.println("At the end");
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        
    }
}
