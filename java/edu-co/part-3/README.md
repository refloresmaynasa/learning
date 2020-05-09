# Assignment

1. If  you  have  noticed  class  SearchHelper  does  not  have  a  state  but  just  a  bunch  of  helper methods.  What  changes  can  you  do  to  such  classes?  Make  the  relevant  changes  in  the SearchHelper class.

   **Answer**: Change the methods to static methods.

2. Write  an  overloaded  method  in  module3.MySearchHelper  with  the following  signature:  public Integer [] search(Double [] list, Double number) where the return type is an integer array containing the list of indexes where the number occurs.

3. There are 2 imports in module3.TestEventSource class

   import java.util.ArrayList;

   import java.util.Vector;

   Even  though  these  classes  are  not  used  in  the  programme  why  is  there  a  need  to  have these imports. 

   [Hint: For a change, you don’t need to look at the code, read the Javadoc comments]

   **Answer:** Because they are referred in the method documentations.

4. A class scans a list of random numbers generated on the fly (using java.lang.Math.random() method).  If the number in  the  10000 th decimal place  is  an  even  number then  registered listeners would be notified about this event. 

   Write a programme to achieve this. 

   If you are able to complete this you can handle any type of custom event handling and you have also learnt Observer design pattern (which we will learn in the last module). [Solution in module3.randevent package]

   **Answer:** module3/ScanRandomNumbers.java

5. Create  a  resource  bundle  with  the  keys  being  country  name  and  values  being  their respective capitals in the  resource folder. The locale should be for India with language code “en” and country code “IN”.

   **Answer:** resources/Capitals_en_IN.properties

6. Write a programme to load this resource bundle and print the country names along with their  capitals.  The  names should  be  printed  in  the  format: 

   The  capital  of  <country>  is <capital>.

   **Answer:** CapitalsI18n.java

