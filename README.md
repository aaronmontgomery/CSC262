# CSC262


Aaron Montgomery 

CSC262

 

The main difference between Array and ArrayList is in the way they grow and shrink.  An Array must be resized by creating a new Array with space for additional values and the values in the old Array must be copied to the new Array.  Additional values may be assigned by indexing the new spaces.  The same is true for removing values from the Array where the values from the old Array would be copied to a new, shorter Array.  An ArrayList is simpler to use and can grow and shrink by calling the ArrayList methods add and remove (Horstmann, 2016, p. 301).  It is not necessary to copy the ArrayList values to another ArrayList or temporary structure first.  Additionally, the length of an Array can be accessed using the length property from the instance of the Array to determine the number of items.  This property is useful when looping each item using a for loop.  The size method of an instance of an ArrayList is similar to the length property that belongs to an instance of an Array and is also useful when iterating the collection.  It is arguably less expensive to replace values in an Array than it is an ArrayList because the value in the Array will be assigned after being indexed, but the set instance method will be called when working with ArrayList (Horstmann, 2016, p. 301).  Method calls generally have some overhead.  Also, an Array is normally declared and instantiated with a finite number of locations or items while it is possible for an ArrayList to be instantiated without an initial size.  Finally, it was required to import java.util.ArrayList to work with ArrayList where the Array functionality was built in. 

 

Horstmann, C. S. (2016). Big Java Late Objects (2nd ed.). Wiley Global Education US. https://online.vitalsource.com/books/9781119321071 

 