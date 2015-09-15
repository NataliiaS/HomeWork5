package sourseit.HomeWork.Sydorenko.HomeWork5;

import java.util.Map;

public class ToMap
{
    public static <T extends Map> T convert(Object keys [], Object values [], T ob)
    {

        for (int i = 0; i<keys.length; i++)
        {
            ob.put(keys[i], values[i]);
        }
        return ob;
    }

    public static <T extends Map> void print(T ob)
    {
        System.out.println("Map: " + ob.getClass());
        for (Object o: ob.keySet()){
            System.out.println(o + " " + ob.get(o));

        }
        System.out.println();

    }
}
