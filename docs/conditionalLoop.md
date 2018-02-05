# conditional loop
### previous constructs
 - You have probably already used a *fixed loop* (also called an *unconditional* or *for* loop).
 - A fixed loop has a set *limit* to the number of repeats. The limit can be set by a *number* or an *integer variable*.

```java
for (int i=0 ; i<4 ; i++)		// loop 4 times
{
	System.out.println("Hello ");
}
```

- You have also used an `if` conditional construct. The condition is checked to see whether it is `true` or `false`.

```java
if (score > 100)	                // (score > 100) will be true or false
{
	System.out.println("You win ");
}
```
### conditional loop construct
- A conditional loop does NOT have a limit.
- Instead it will only stop repeating once a **condition** is met. 
- So it combines the *repeating features of a loop* with the *conditional features of an* `if` *construct*. 
- It is a bit like an `if` that repeats!
- - A `while` loop repeats when the condition is `true` and stops when the condition is `false`.
- Study the example task below which uses a conditional loop.
---
> sample problem : insert coins into vending machine to pay for bottled water

![coin vending machine](https://i1.wp.com/bookacan.com/wp-content/uploads/2018/01/coin-operated-water-vending-machine.jpg?resize=250,250&ssl=1)
- the bottled water costs 90 (pence).
- the user can pay using any coins (50 + 20 + 20 **or** 20 + 20 + 20 + 20 + 5 + 5 *etc*).
- each time another coin is inserted, the program will add it to the payment, this is a *repeated action* and will need a *loop*.
- the program *does not know in advance how many coins there will be* so a *fixed loop* is **not** appropriate.
- the program repeatedly asks for another coin until the payment is complete.
- a *condition* is needed to decide if the payment is complete

### design
- the *flowchart* shows the *logic* of how the code controls the steps of the payment processes.
- the *structure diagram* shows how the code is organised to handle the process.

![bottled water loop example](https://lh3.googleusercontent.com/stKY_Th1qYx6fUyO5Zyp2BrM2O_eKoaMftgQEQuR8PDPUR9h-aiY0fLJcIexgMD1jLHtP6He031U=s1000 "bottled water loop example")

- compare how the loop is represented in both diagrams, they both show the **same** plan.
- the flowchart may look like an `if` construct, but there is a return arrow so this is a loop.
- read the pseudocode and java code below and match them to the flowchart and structure diagram designs. It is important that you see the connections between the design and the code.

> pseudocode : bottledWater

```java
	// declare bottleCost, payment and coinValue as int(eger) variables
  1 set bottleCost to 90
  2 set payment to 0
  3 set coinValue to 0
  
  4 repeat while (payment < bottleCost)					// loop starts with a condition
  5     set coinValue to number entered by the player
  6     set payment to payment + coinValue
  7 end while loop										// end or loop
  
  8 display "thankyou, change due is" + (bottleCost - payment)
``` 
> java code : bottledWater
```java
 Scanner keyboard = new Scanner(System.in);			// declare and initialise
 int bottleCost = 0;								// declare and initialise
 int payment = 0;									// declare and initialise
 int coinValue = 0;									// declare and initialise

 bottleCost = 90;									// assign
 
 while (payment < bottleCost)						// loop starts with a condition
 {
     System.out.print("Enter the coin value : ");
     coinValue = keyboard.nextInt();
     payment = payment + coinValue;
 }													// end of loop
 
 System.out.print("thankyou, change due is : " + (bottleCost - payment));
``` 
- the java `while` loop construct is very similar to an `if` construct, simply use `while` instead of `if` to turn it into a loop.
- The condition can include complex conditions just like an `if` construct.

### variations on conditional loop
> there are 2 types of conditional loop: `while` and `until`, both can have further options of checking the condition at the **start** or the **end** of the loop. It is simple to *convert* between `while` and `until` loops.
- The basic action of a `while` loop is: 
  - **continue** repeating as long as a condition is `true`, 
  - *otherwise* **stop**.
```java
  while (condition is true)
    // continue doing something
  end while loop
```
- The basic action of an `until` loop (an *alternative* conditional loop) is : 
  - **stop** when the condition is `true`, 
  - *otherwise* **continue** repeating
```java
  until (condition is true)
    // continue doing something
  end while loop
```
- Another variation is to place the conditional statement at the ***end** of the loop*.
- The difference is that the loop action **must** be done *at least once* since the condition is not checked at the start.
- The more usual format above the condition **is** checked at the **start** which means there is a *possibility that the loop will not run at all*.
```java
  do loop
    // continue doing something
  while (condition is true)
``` 
```java
  do loop
    // continue doing something
  until (condition is true)
``` 
- Java has both versions of the while loop, Java does not have an until style loop.
> convert until loop into a java while loop

```java
 1. set count to 0          // initialise
 2. until count == 10       // stop when count is already 10, continue otherwise
 3.     count = count + 1   // will make 1-10
 4.     display count       // latest update
 5. end while loop
 6. display count           // final value
```
- convert to `while` loop by *changing the condition*
```java
 1. set count to 0          // initialise
 2. while count < 10        // continue as long as count is 0-9
 3.     count = count + 1   // will make 1-10
 4.     display count       // latest update
 5. end while loop
 6. display count           // final value
```
> java code for alternative `while` loop with condition checked at the **end**
```java
  int count = 0;               
  do                           // start loop
  {
      count = count + 1;            
  } while (count < 10) ;       // end loop
  
  System.out.println("Final total is : " + count);
```

> Written with [StackEdit](https://stackedit.io/).


<!--stackedit_data:
eyJoaXN0b3J5IjpbMzU3ODk5MTU3XX0=
-->