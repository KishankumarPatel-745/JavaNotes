package com.collections.scjp;

public class Java11 {
    public static void main(String[] args) {
        /*
        Map Interface...

        Refer Image.

        Map is not child interface of Collection.
        If we won't to represent a group of Objects as Key-Value pair then we should go for Map.

        key--value
        101--Kishan
        102--ravi
        103--jinal

        Both keys and Values are Objects only.
        Duplicate keys are not allowed but values can be duplicated.

        Each key-value pair is called Entry.Hence Map is considered as a Collection of entry objects.

        Map interface methods.

        1, Object put(Object key,Object value);

        To add one key-value pair to the Map.
        If the key is already present then old value will be replaced with new value, and return old value.

        eg.
        m.put(101,"durga"); null
        m.put(102,"siva"); null
        m.put(101,"Kishan"); Kishan 

        2,
        void putAll(Map m);

        3,
        Object get(Object key);
        returns the value associated with the specified key.

        4.
        Object remove(Object key);
        removes the entry associated with the specified key.

        5,
        boolean containsKey(Object key);

        6,
        boolean containsValue(Object value);

        7,
        boolean isEmpty();

        8,
        int size();

        9,
        void clear();

        10,
        Set keySet();

        11,
        Collection values();

        12,
        Set entrySet();

        Collection views of Map.

        ..
        Entry Interface.
        A Map is a Group of key-value pairs and each key-value pair is called an entry hence Map is considered as a Entry Objects.
        Without Existing Map Object, there is no chance of existing entry object.
        Hence Entry interface is defined inside Map interface.

        interface Map{
            interface Entry{
                Object getKey();

                Object getValue();

                Object setValue(Object newObject);

                There are entry specific methods and we can apply only on Entry Object.


            }
        }

        Implementation classes HashMap(I).
        Underlying Data Struture is  Hashtable.
        Insertation order is not preserved and it is based on hashcode of keys.
        Duplicates keys are not allowed but values can be duplicated.
        Heterogeneous Objects are allowed for both key and value.
        null is allowed for keys but only once.
        null is allowed for values (any number of times).

        HashMap implements Serializable and Cloneable interface but not RandomAccess.

        HashMap is a best choice if our frequent operation is search operation.

        Constructor.

        HashMap m=new HashMap();

        Creates an empty HashMap object with default initial capacity 16 and default fill ration 0.75.


        HashMap m=new HashMap(int initialCapacity);

        Creates an empty HashMap Object with specified initial capacity and default fill ratio 0.75.


        HashMap m=new HashMap(int initialCapacity,float fillRatio);


        HashMap m=new HashMap(Map m);

        eg.
        code but i skipped.

        Differenecs between HashMap and Hashtable.

        Every method present in HashMap is not synchronized.
        Every method present in Hashtable is synchronized.

        At a time, multiple Threads are allowed to operate on HashMap Object hence it is not Thread-Safe.
        At a time, only one thread is allowed to operate on Hashtable and hense it is Thread-safe.

        Relatively performance is high because Threads are no required to wait to operate on HashMap object.
        Relatively performance is low because Threads are required to wait to operate on Hashtable Object.

        null is allowed for both key and value.
        null is not allowed for keys and values.Otherwise we will get NullPointerException.

        HashMap introduced in 1.2 version and it is not legacy.
        Introduced in 1.0 version and it is legacy.

        How to get synchronized version of HashMap object.

        By default, HashMap is non-synchronized but we can get synchronied version of HashMap by using synchronizedMap method of Collections class.

        HashMap m=new HashMap();
        Map m1=Collections.synchronizedMap(m);
        //m1 is synchronized 
        //m is non-synchronized.

        
















        */
    }
}
