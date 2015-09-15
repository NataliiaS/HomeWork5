package sourseit.HomeWork.Sydorenko.HomeWork5;

import java.util.Collection;
import java.util.Iterator;

public class ToCollection
{
    public static <T extends Collection> T convert(Object array[], T ob)
    {

        for (Object i : array)
        {
            ob.add(i);
        }
        return ob;
    }

    public static <T extends Collection> void print(T ob)
    {
        System.out.println("Collections: " + ob.getClass());
        Iterator iter = ob.iterator();
        while (iter.hasNext())
        {
            System.out.print(iter.next() + " ");
            System.out.println();
        }
    }
}
