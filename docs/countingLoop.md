# counting loop

> counting is a very basic calculation and is easy to do with a list.
- there are *three* steps to counting
```java
 1. start counting at 0 ("declare and initialise")
 2. add on 1 to "update" or "increment" the count every time you need to
 3. display the answer at the end
```
- step 1 is done **once** at the *beginning*, (you would need to declare an `int` variable first, perhaps call it `count`.
- step 2 is probably *inside a loop* to keep counting over and over.
- step 3 could be done **inside** the loop to give a *running count*, it could also be done **after** the loop for a *final count*.
> pseudocode example of counting
```java
 1. set count to 0          // initialise
 2. while count < 10        // 0-9
 3.     count = count + 1   // will make 1-10
 4.     display count       // latest update
 5. end while loop
 6. display count           // final value
```
> output from counting 
```java
 > 1                        // latest value, running count
 > 2                             "      "
 > 3                             "      "
 > 4                             "      "
 > 5                             "      "
 > 6                             "      "
 > 7                             "      "
 > 8                             "      "
 > 9                             "      "
 > 10                            "      "
 > 10                        // final value
```
> java code for counting
```java
  int count = 0;               // declare and initialise ONCE
  while (count < 10)           // runs for count : 0,1,2,3,4,5,6,7,8,9
  {
    count = count + 1;         // update on EVERY repeat of loop
    System.out.println("total so far is : " + count);
  }
  System.out.println("Final total is : " + count);
```
- look at the code : `count = count + 1`, this code :
  - takes the *current value* of the `count` variable, then .. 
  - adds on **`1`** to get a *new result*, then ..
  - stores the *result* back into the `count` variable again.
  - updates and reuses the `count` variable **every** time the loop repeats
  - has an alternative short cut: `count++;` it is sometimes called increment.
 - the count so far is displayed *every repeat* it is **inside** the loop,
 - the final total is displayed *once at the end*, it is placed **after** the loop.
 - the count can be displayed either every loop repeat or once at the end or both.

> Written with [StackEdit](https://stackedit.io/).
<!--stackedit_data:
eyJoaXN0b3J5IjpbLTIwNTg0Mjk4NjFdfQ==
-->