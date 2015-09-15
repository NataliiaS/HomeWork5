package sourseit.HomeWork.Sydorenko.HomeWork5;


import java.util.*;

public class Convert
{
    Car car1 = new Car("Audi", 845654411, "white");
    Car car2 = new Car ("Ferrari", 547554744, "red");
    Car car3 = new Car("Tesla", 571458455, "white");
    Car car4 = new Car("Infiniti", 725517841, "silver");
    Car car5 = new Car ("Lamborghini", 625524824, "yellow");

    int [] ints = {1, 2, 3, 4, 5};
    long [] longs = {111111111L, 222222222L, 3333333333L, 4444444444444L, 5555555555555L};
    boolean [] booleans = {true,true, false,true,false};
    String [] strings = {"one", "two", "three", "four", "five"};
    String [] values = {"value1", "value2", "value3", "value4", "value5"};
    double [] doubles = {1.1d, 2.2d, 3.3d, 4.4d, 5.5d};
    Car [] cars = {car1, car2, car3, car4, car5};

    ArrayList arrayList = new ArrayList();
    LinkedList linkedList = new LinkedList();
    HashSet hashSet = new HashSet();
    TreeSet treeSet = new TreeSet();
    PriorityQueue priorityQueue = new PriorityQueue();
    ArrayDeque arrayDeque = new ArrayDeque();


    Object[] arrays = {ToWrapperClass.toInteger(ints), ToWrapperClass.toLong(longs), ToWrapperClass.toBoolean(booleans), strings,
            ToWrapperClass.toDouble(doubles), cars};

    Object[] list = {arrayList, linkedList, hashSet, treeSet, priorityQueue, arrayDeque};

    void convertToAndFromColections()
    {

        for (Object o : list)
        {
            for (Object ob : arrays)
            {
                ToCollection.convert((Object[]) ob, (Collection) o);
                ToCollection.print((Collection) o);
                System.out.println();
                FromCollections.print(FromCollections.convert((Collection) o));
                System.out.println();
                ((Collection) o).clear();
            }
        }
    }

    HashMap hashMap = new HashMap();
    TreeMap treeMap = new TreeMap();
    LinkedHashMap linkedHashMap = new LinkedHashMap();

    Object[] arraysKeys = {ToWrapperClass.toInteger(ints), strings, ToWrapperClass.toInteger(ints), strings, strings,
            ToWrapperClass.toInteger(ints), strings};

    Object[] arraysValues = {strings, values, ToWrapperClass.toLong(longs), ToWrapperClass.toBoolean(booleans),
            ToWrapperClass.toDouble(doubles), cars, cars};

    Map[] maps = {hashMap, treeMap, linkedHashMap};

    void convertToAndFromMap(){

        for (Map m: maps){
            for (int i = 0; i<arraysKeys.length; i++){
                ToMap.convert((Object[])arraysKeys[i], (Object[])arraysValues[i], m);
                ToMap.print(m);
                System.out.println();
                FromMap.convert(m);
                FromMap.print( FromMap.convert(m));
                System.out.println();
                m.clear();
            }
        }

    }

    void converter(){
        convertToAndFromColections();
        convertToAndFromMap();
    }


}


