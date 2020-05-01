

# Anatomy of a Class & Interface, Annotations

1. Look at the class module2.SuperStudy.

   a. What is the problem? 

   ​	**Answer:** The Java source file compiled successfully, but couldn't execute. 

   ​					Error: Could not find or load main class SuperStudy 

   b. How can we rectify the problem?

   ​	**Answer:** Create a folder module2 and put there the Java source file, compile ( javac module2/SuperStudy.java ), and execute ( java module2.SuperStudy ).

   ​		Output: 

   ​			` I am in SuperStudy.X()
   ​	   I am in SuperStudyChild.X()`

2. Create an abstract base class Quadrilateral.

   a. Derive the following classes – Square, Rectangle and Parallelogram. 

   b. The base class should have the following attributes – base (Integer), height (Integer). 

   c. The base class should have the following methods – area, getter and setter methods for the attributes.

   d. The base should have default and parameterised constructors.

   **Class:** Main.java

   e. Can a Square be modelled as a Rectangle?

   **Answer:** It's possible, but a Square is a Quadrilateral with four equal sides. 

3. Expand the example of AbstractSearch class to IntegerSearch and StringSearch classes.

   public abstract class AbstractSearch {

   ​	public abstract boolean search(Object [] obj_list, Object obj);

   }

   **Class:** MainSearch.java

4. Write a class to find integers from an array of integer based on the given input. 

   a. Scan the whole input list to find matches.

   b. When the integer is found a listener would be informed and the listener will print a message saying the number and at what index it is found. 

   c. The print message should not be hardcoded.

   **Class:** MainSearchAll.java