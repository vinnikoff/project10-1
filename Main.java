/**
 * Created by VINNI on 15.01.17.
 */

import java.lang.String;

public class Main {
    public static void main(String[] args) {
        try{
            throw new Ex("null");
        }

        catch (Ex e)
        {System.out.println("error: "+e);}
        finally {
            System.out.println("finally");
        }
    }
}