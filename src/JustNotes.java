public class JustNotes {
    /*

    ArrayList vs Array review
    ArrayList
        - use if performance is big issue
        - if simple things -> arrayList is better

    link list -> add nodes(elements, 2 parts -> 1> that stores the data and 2> that points to the next element and 3> that points to the previous element)
    anywhere in memory and the elements are linked together
        - only able to use linear search
        - by default remove from the head
        - double linked list, can go backwards as well
        When to use a linked list:
            -You are concerned about the efficiency of inserting or removing elements
            -You rarely need element access in random order

     LinkedList<String> list = new LinkedList();
     list.addLast("Harry");
     list.addFirst("Sally);
     list.getFirst();
     list.getLast();
     String removed = list.removeFirst();
     ListIterator<String> iter = list.listIterator();


     */





    /*
    //The ArrayList class implements collection interface
    Collection <String> coll = new ArrayList();

    //The TreeSet class also implements the collection interface
    coll = new TreeSet<>();

    //Gets the size of the collection, n is now 0
    int n = coll.size();

    //adds elements to the collection
    coll.add("Harry");
    coll.add("Sally");

    //Returns a string with all the elements in the collection, s is now [Harry, Sally]
    String s = coll.toString();

    //Invokes toString method and prints [Harry, Sally]
    System.out.println(coll);

    //Removes an element from the collection, returning false if the element is not present, b is false
    coll.remove("Harry");
    boolean b = coll.remove("Tom);

    //Checks whether the collection contains a given element. b is now true
    b = coll.contains("Sally");

    //You can use the "for each" loop with any collection. This loop prints the elements on separate lines
    for(String s : coll)
    {
        System.out.println(s);
    }

    //You can use an iterator for visiting the elements in the collection
    Iterator <String> iter = coll.iterator();
     */

    /*
    Stacks

        -insert and remove elements only at one end
                -last in, first out policy
        -add and remove methods are called "push" and "pop"
        Stack<String> s = new Stack<>();
        s.push("A"); s.push("B"); s.push("C");
        while (s.size() > 0)
        {
            System.out.print(s.pop() + " "); // Prints C B A
        }

        //Constructs an empty stack
        Stack<Integer> s = new Stack<>();

        //Adds to the top of the stack; s is now [1,2,3] (Following the toString method of the Stack class we show the top of the stack at the end)
        s.push(1);
        s.push(2);
        s.push(3);

        //Removes the top of the stack; top is set to 3, and s is now [1,2]
        int top = s.pop();

        //Gets the top of the stack without removing it; head is set to 2
        head = s.peek()

        //we use a stack for push and pop
        //if you have to search for elements there is no reason to use stack or queue

     */

    /*
    Map
        -map is similar to dictionary, stores key-value pairs
        -constant access time, fastest to find
     */

    /*
    Set
        - unordered collection
        - does not allow duplicates
     */
}
