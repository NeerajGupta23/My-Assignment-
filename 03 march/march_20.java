// Ans 01: The Java collections framework provides a set of interfaces and classes to implement various data structures and algorithms. For example, the LinkedList class of the collections framework provides the implementation of the doubly-linked list data structure.



// Ans 02: 
// ArrayList:
// => This class uses a dynamic array to store the elements in it. With the introduction of generics, this class supports the storage of all types of objects.
// => Manipulating ArrayList takes more time due to the internal implementation. Whenever we remove an element, internally, the array is traversed and the memory bits are shifted.
// => Inefficient memory utilization
// => It can be one, two or multi-dimensional.
// => Insertion operation is slow.


// LinkedList:
// => This class uses a doubly linked list to store the elements in it. Similar to the ArrayList, this class also supports the storage of all types of objects.
// => Manipulating LinkedList takes less time compared to ArrayList because, in a doubly-linked list, there is no concept of shifting the memory bits. The list is traversed and the reference link is changed.
// => Good memory utilization
// => It can either be single, double or circular LinkedList.
// => Insertion operation is fast.



// Ans 03: 
// Iterator
// => Can traverse elements present in Collection only in the forward direction.
// => Helps to traverse Map, List and Set.
// => Indexes cannot be obtained by using Iterator.
// => Cannot modify or replace elements present in Collection
// => Cannot add elements and it throws ConcurrentModificationException

// ListIterator
// => Can traverse elements present in Collection both in forward and backward directions.
// => Can only traverse List and not the other two.
// => It has methods like nextIndex() and previousIndex() to obtain indexes of elements at any time while traversing List.
// => We can modify or replace elements with the help of set(E e)
// => Can easily add elements to a collection at any time.


// Ans 04: 
// Iterator
// => Iterator is a universal cursor as it is applicable for all the collection classes.
// => Iterator has the remove() method.
// => Iterator can do modifications (e.g using remove() method it removes the element from the Collection during traversal).
// => Iterator is not a legacy interface. Iterator can be used for the traversal of HashMap, LinkedList, ArrayList, HashSet, TreeMap, TreeSet .

// Enumeration
// => Enumeration is not a universal cursor as it applies only to legacy classes.
// => Enumeration does not have the remove() method.
// => Enumeration interface acts as a read only interface, one can not do any modifications to Collection while traversing the elements of the Collection.
// => Enumeration is a legacy interface which is used for traversing Vector, Hashtable.



// Ans 05: 
// The main difference between List and Set is that Set is unordered and contains different elements, whereas the list is ordered and can contain the same elements in it.



// Ans 06: 
// Hash Set
// => Hash set is implemented using HashTable 
// => HashSet allows a null object 
// => Hash set use equals method to compare two objects
// => Hash set doesn't now allow a heterogeneous object 
// => HashSet does not maintain any order

// Tree Set
// => The tree set is implemented using a tree structure.
// => The tree set does not allow the null object. It throws the null pointer exception. 
// => Tree set use compare method for comparing two objects.
// => Tree set allows a heterogeneous object 
// => TreeSet maintains an object in sorted order 



// Ans 07: 
// Array: 
// => It can be single-dimensional or multidimensional
// => For and for each generally is used for iterating over array
// => length keyword can give the total size of the array.
// => It is static and of fixed length
// => It is faster as above we see it of fixed size


// ArrayList:
// => It can only be single-dimensional 
// => Here iterator is used to traverse riverArrayList 
// => size() method is used to compute the size of ArrayList.
// => It is dynamic and can be increased or decreased in size when required.
// => It is relatively slower because of its dynamic nature 