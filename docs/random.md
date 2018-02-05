# random number
> The idea of a random number is to have a value that *cannot be predicted*.
- Random values are helpful in games. 
- Often it is useful to limit the **range** for a random number, eg 1-10, 1-100.
- Random values are made by a *random number generator* which can **make** a random number (a die/dice is a *physical* random number generator).
- The feature in a programming language that produces a random value is another example of a **function**. Functions are built-in resources that a programmer can call on for special results. Other `function` examples are : length of text, rounding a number.
> example task using a random number
```java
// pseudocode example: a random number for a winning "lucky" ticket number
 1. set up a random number generator to make random numbers 
 2. set luckyNumber as a value between 1 and 50 from random number generator 
 3. display "The winner's ticket number is: " luckyNumber
```

### Using random numbers in Java
![enter image description here](https://jnet.i.lithium.com/t5/image/serverpage/image-id/11008i36484DF65A488169/image-size/medium?v=mpbl-1&px=-1)
 - Where do the "random" numbers come from? Something is needed to **make** the random number, for example in a game you might need a *die* or dice to roll.
 - In Java a *pre-defined function* is used. Some *preparation* is needed to use the function. 

1. First the program sets up a *random number generator*. This is done **once** in the program. (*A die or dice is a physical random number generator*).
2. Then, when the program needs a **new** random number, it *calls* the random generator to get another value. The random number generator returns a number *within the range* you set. (Just like you roll the die (dice) whenever you want another random number).

- Here is some java code to implement the `lucky number winner` design.
- Notice the **two** steps: 
  - setup the random number generator, then 
  - get a number from the random number generator.

```java
    public void processLuckyNumber() 
    {
        Random randomMaker = new Random();			// set up random generator
        int luckyNumber = 0;
        luckyNumber = randomMaker.nextInt(50) + 1;  // assign a new random value in range
        System.out.print("The winner's ticket number is: " + luckyNumber");
    }
```
### Setting up a random number maker 
`Random randomMaker = new Random();`
- A `Random` generator variable is declared and this is done only **once**. This is **not** the random number itself but it can **make** a random number, *lots of them*. You can name the variable whatever you want, in this example it is called `randomMaker`.
  - In a board game the die / dice is not the score but when you roll the die / dice then you get the score. 
  - You only need one die / dice but you can roll it as many times as you want. 

### Making a random number within range
`luckyNumber = randomMaker.nextInt(50) + 1;`
- The random number generator (`randomMaker`) is *called* to make a random integer.
- The number in brackets is called a **parameter**.
  - A parameter value of `50` means the *highest limit* for the random value is *actually* `49`. 
  - The *lowest limit* is **always** `0`, **not** `1`. 
  - So the random integer will be a value between **`0`** and **`49`**. 
- *`1` is added* on to the random value *after* it is made, since we need a random number between `1` and `50` 
  - adding `1` to `0` will give `1`, 
  - adding `1` to `49` will give `50`.
- Using `randomMaker.nextInt(51)` would **not** be helpful as it would make a value between `0` and `50`, that is `51` different values.
- The random number maker can be *called lots of times*, for example *in a loop*, to make a series of random values. Just as you can repeat rolling 1 die / dice lots of times.

> Lets change the lucky number design to pick **three** winners based on a range 1-100

```java
// pseudocode example
 1. set up a random number maker 
 2. repeat 3 times
 3.     set luckyNumber as pick a random number between 1 and 100 
 4.     display "The next winner's ticket is number : " luckyNumber
 5. end repeat
```

```java
// java example
    public void processLuckyNumber() 
    {
        Random randomMaker = new Random();			    // set up random generator
        int luckyNumber = 0;
        for (int i = 0; i < 3 ; i++)
        {
	        luckyNumber = randomMaker.nextInt(100) + 1;  // assign a new random value in range
	        System.out.print("The winner's ticket number is: " + luckyNumber");
        }
    }
```
- notice the design says a number between **`1 and 100`** and the program code implements this as between **`nextInt(0,100) + 1`**
- take care when calling the calling the random function, you have to add on the start value, the parameter is the number of values needed. Check the table below:

|design random range|code parameter| how many values|
|--|--|--|
|between `1 and 10`|`random(10) + 1`|10 |
|between `100 and 300`|`random(201) + 100`|201 |
|between `0 and 50`|`random(51)`|51 |
---

### Testing with random values

- Testing is tricky when a program uses random values. The expected result might not be predictable since the result could be a different random number each time!
- The program may have to be run lots of times to make sure that the results really do reflect a sequence of random values.
---

### Do you know? Ask yourself!
*- you don't have to write an answer here but if you don't know any of these please ask your teacher to explain them.*
 1. How many times is a random number maker set up?
 2. How many random numbers can a random number maker produce?
 3. How can you set the range for a random number?
 4. Why might you want to add 1 to a random number?
 5. What data type is a random number?
 6. How could you make a random number between 10 and 20?
 7. What does the parameter in calling the random function?
 8. What code is used to set up a random number generator?
---
> Written with [StackEdit](https://stackedit.io/).
<!--stackedit_data:
eyJoaXN0b3J5IjpbLTIxMjU3MDU5MTBdfQ==
-->