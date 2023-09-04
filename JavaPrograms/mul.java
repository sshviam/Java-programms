abstract class Inh{
    public void add (int x , int y )
    {
        int sum = x=y;
        System.out.println(sum);
    }
    public abstract void sleep();
}
class mul extends Inh{
    public void sleep()
    {
        System.out.println("im sleeping");
    }
     public static void main(String[] args) {
        mul obj = new mul();
        obj.sleep();
     }
}
/*class Multi extends mul{
    public static void main(String[] args){
        Multi obj = new Multi();
        obj.sleep();
    }
}
 */
