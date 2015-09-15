package sourseit.HomeWork.Sydorenko.HomeWork5;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class CollectionMethods <T> implements Collection
{
    private T[] arr;
    private int currentIndex;

    class MyIterator implements Iterator
    {

        @Override
        public boolean hasNext()
        {
            return currentIndex < arr.length;
        }

        @Override
        public Object next()
        {
            if (hasNext())
            {
                return arr[currentIndex++];
            } else
            {
                throw new NoSuchElementException();
            }
        }

        @Override
        public void remove(){
        arr[currentIndex] = null;
        }
    }




    @Override
    public int size()
    {
        MyIterator iter = new MyIterator();
        int count = 0;
        while (iter.hasNext())
        {
            iter.next();
            count++;
        }
        return count;
    }

    @Override
    public boolean isEmpty()
    {
        MyIterator iter = new MyIterator();
        if (!iter.hasNext())
        {
            return true;
        } else
        {
            return false;
        }
    }

    @Override
    public boolean contains(Object o)
    {
        MyIterator iter = new MyIterator();
        while (iter.hasNext())
        {
                if (iter.next().equals(o))
                {
                    return true;
                }
            }
        return false;
    }

    @Override
    public Iterator iterator()
    {
        return new MyIterator();
    }

    @Override
    public Object[] toArray()
    {
        MyIterator iter = new MyIterator();
        Object[] array = new Object[size()];

        for (int i = 0; i<array.length; i++){
            array[i] = iter.next();
        }
        return array;
    }

    @Override
    public boolean add(Object o)
    {
        MyIterator iter = new MyIterator();
        int count = 0;
        if (iter.hasNext())
        {
            while (iter.hasNext())
            {
                iter.next();
                count++;
            }
            arr[count] = (T) o;
            return true;
        }
        return false;
    }


    @Override
    public boolean remove(Object o)
    {
        MyIterator iter = new MyIterator();
        while (iter.hasNext())
        {
            if (iter.next().equals(o))
                {
                    iter.remove();
                    return true;
                }

            }
        return false;
    }

    @Override
    public boolean addAll(Collection c)
    {
        MyIterator iter = (MyIterator) c.iterator();
       if (iter.hasNext()) {
            while (iter.hasNext()) {
                add(iter.next());
            }
            return true;
        }
        return false;
    }

    @Override
    public void clear()
    {
        MyIterator iter = new MyIterator();
        while (iter.hasNext())
        {
            iter.next();
            iter.remove();
        }

    }

    @Override
    public boolean retainAll(Collection c)
    {
        MyIterator iter = (MyIterator)  c.iterator();
        int count = 0;
        while (iter.hasNext()){
            if (!(contains(iter.next())))
            {
                iter.remove();
                count++;
            }
        }
        return count==c.size();
    }

    @Override
    public boolean removeAll(Collection c)
    {
        MyIterator iter = (MyIterator)  c.iterator();
        int count = 0;
        while (iter.hasNext()){
            if (contains(iter.next()))
            {
                iter.remove();
                count++;
            }
        }
        return count==c.size();
    }

    @Override
    public boolean containsAll(Collection c)
    {
        MyIterator iter = (MyIterator)  c.iterator();
        int count = 0;
        while (iter.hasNext()){
            if (contains(iter.next()))
            {
                count++;
            }
        }
        return count==c.size();
    }

    @Override
    public T[] toArray(Object[] a)
    {
        MyIterator iter = new MyIterator();
        Object ar[] = new Object[arr.length];
        if (a.length < arr.length) {
            ar = new Object[a.length];
        }
        int i = 0;

        while (iter.hasNext()) {
            Object o=iter.next();
            for (Object ob : a) {
                if (o.equals(ob)) {
                    ar[i] = ob;
                    i++;
                }
            }
        }


        return (T[]) ar;
    }
}
