package seleniumBuiltins;

import java.util.Date;

public class Dates

{
public static void main(String arg[])
{
    Date date  = new Date();
    System.out.println(date);

    String path = "Agenda";

    String dt = date.toString().replace(" ","").replace(":","");

    System.out.println(path+dt+".txt");

}
}
