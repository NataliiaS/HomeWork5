package sourseit.HomeWork.Sydorenko.HomeWork5;

import java.util.Collection;
import java.util.Iterator;

public class FromCollections
{

    static <T extends Collection> Object[] convert(T o)
    {
        Object[] array = new Object[o.size()];
        Iterator itr = o.iterator();
        int i = 0;
        while (itr.hasNext())
        {
            array[i] = itr.next();
            i++;
        }
        return array;
    }

    static void print(Object[] o)
    {
        System.out.println("Array:");
        for (Object ob : o)
        {
            System.out.println(ob + " ");
        }
        System.out.println();
    }
}

