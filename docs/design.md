# design : eventGuess

> **version 1** : player gets a *single chance* to guess the random number, result is *success* or *fail*

- The **flowchart** first of all "*tells the story*" of guessing the number from beginning to end as a kind of *timeline*.
- The **structure diagram** presents the same design but the layout is aimed at showing how the steps have to be organised.

![eventGuess v1 design](https://lh3.googleusercontent.com/sZAUGP_zT7VQWFRkL1xCmAmNinuNcAh9BZ8BRrdIEzn2L5rD2JSIt2omqLPTksYGjsEZLWwbsais=s1000 "eventGuess v1 flowchart and structure diagram")

- the diamond section of the *flowchart* shows an `IF-ELSE` conditional construct
- the steps are : 
  - a random number is set up with a given range, 
  - the player gets one guess, 
  - a decision is made about which result to display based on whether or not the condition `mystery = guess` is true or not. 
- the *structure diagram* shows the **same** `IF-ELSE` conditional construct

> pseudo code: use the flowchart and structure diagram to complete
```java
1 mystery = random number between 1 and ??  // range must be set
2 set ?? to value entered by user from keyboard
3 if (?? = ??) then 					    // condition goes at the start
4    display "????"						    // true option goes first
5 else
6    dislpay "????" with mystery		    // false option goes second
7 end if
```
- *go back to the assignment at this point to look at implementing version 1*
---
> **version 2** : allow player to *repeat* guessing until the guess is correct

- The conditional step in the flowchart now has a *return link*. The `if` construct has turned into a *conditional loop*.
- When the player enters a guess which *does not match* they will now be asked to *type a new guess* which is again checked.
- You can only *leave* the loop when the conditional is `true`.
- The step for entering the first guess is *duplicated inside the loop* to allow additional guesses.

![enter image description here](https://lh3.googleusercontent.com/UvaG9M0mQHRyo3iuCRX_hr_z_uzkMzH4cVgRsSh4noUuUV04M2MrSFbkCqWeOdg2YwqH09Wff8xH=s1000 "eventGuess v1-2 flowchart")

- The structure diagram shows the same `while` loop.
  - again the 'if' construct has been replaced by a `while` loop construct.
  - the condition is expressed differently `repeat while (mystery != guess)` instead of `(mystery = guess)`.
  - A `while` loop repeats as long as the condition is `true` and stops when the condition becomes `false`. So as long as the guess is **not** correct the guessing *continues*.
  - notice some of the steps have moved position.
  - the random *mystery number* is set up before the loop, otherwise the number would change every repeat making it much more difficult to guess.
 - Make sure you compare how the loop is shown in each diagram, match up each part of the loop.

![eventGuess upgrade v1 to v2](https://lh3.googleusercontent.com/FOj0ecbHotXrjxSwt6yAqvOsdBIZKIWKecQYyo2WyadVTmZc9DIRYOT7FxNThVA0OxQSGgm-EW0G=s1000 "eventGuess v1-2 structure diagram")

> pseudo code : compare to the flowchart and structure diagrams, complete the pseudocode
```java
  1 mystery = random number between 1 and 10
  2 set guess to value entered by user from keyboard	// first guess
* 3 repeat ???? (???? != ????)						// START conditional loop
* 4   display "????"					// don't show mystery (answer!)
  5   set guess to value entered by user from keyboard  // ask again
* 6 end while loop										// END loop
  7 display "????"
```
---
> version 3 : count how many guesses it takes

- adding a `guessCount` variable provides a way to calculate how many guesses are taken to get the right answer.

### design
- flowchart design

![enter image description here](https://lh3.googleusercontent.com/so9vSci2KRvQuRdBp-_FVfEMhE-1UHmNdQSj_e9R6jZtwxLyDM-2GSc1F5IspdmUGZT_3F0LlVr0=s1000 "eventGuess design v2-3 flowchart")

- structure diagram design

![enter image description here](https://lh3.googleusercontent.com/3grTVgNCO9uI5lICcxrat8Rn8OYGqQMpJHzejWvKV6Sk6hjJWHbY7QiHOUhXqJbkTf5hw-TO2CKG=s1000 "eventGuess design v2-3 structure diagram")

> pseudo code : use flowchart and structure diagram to complete
```java
  1 mystery = random number between 1 and 10
  2 set guess to value entered by user from keyboard
* 3 set guessCount to ????									// initialise guessCount
  4 repeat ???? (???? != ????)
  5   display "????"
  6   set guess to value entered by user from keyboard
* 7   add 1 to ????								// update guessCount
  8 end while loop
  9 display "????"
*10 display "You took " + ???? + " guesses"		// display guessCount
```

> Written with [StackEdit](https://stackedit.io/).
<!--stackedit_data:
eyJoaXN0b3J5IjpbMzkyNzcxMDQwLC0xNTc4ODM4ODAsLTg2ND
k4OTk3LC0xNTQ4NjU2NDQ1LC00NDIxNTk2OTBdfQ==
-->