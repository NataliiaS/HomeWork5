package sourseit.HomeWork.Sydorenko.HomeWork5;

import java.util.Iterator;
import java.util.Map;

public class FromMap
{
    static <T extends Map> Object[][] convert(T o)
    {
        Object [] arr1 = new Object[o.size()];
        Iterator itr = o.keySet().iterator();
        int i = 0;
        while (itr.hasNext())
        {
            arr1[i] = itr.next();
            i++;
        }

        Object [] arr2 = new Object[o.size()];
        for (int j = 0; j<o.keySet().size(); j++){
            arr2 [j] = o.get(arr1[j]);
        }
        Object [][] arr = {arr1, arr2};
        return arr;
    }

    static void print(Object[][] o)
    {
        System.out.println("Array of keys: ");
        Object [] arr1 = o[0];
        for (int i = 0; i<arr1.length; i++)
        {
            System.out.println(arr1[i] + " ");
        }
        System.out.println();
        System.out.println("Array of values: ");
        Object [] arr2 = o[1];
        for (int j = 0; j<arr2.length; j++)
        {
            System.out.println(arr2[j] + " ");
        }
        System.out.println();

    }
}
