
public class ExecpcationHandling {
    public static void main(String[] args){
        String s = "xyz";
        try{
            Integer.parseInt(s);

        }
        catch(NumberFormatException e)
        {
            System.out.println(e);

        }
        System.out.println("rest of code ..");

    }
}
