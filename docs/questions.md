> Task 1: counting algorithm
```java
  attempts = 0
  codeWord = "sesame";
  display "Please enter your password"
  response = value returned from keyboard
  while (response is not equal to codeWord)
  {
      display "Please re-enter your password"
      response = value returned from keyboard
      mistakes = mistakes + 1
  }
  display "attempts to guess the password : " + attempts
```
- a password hacker typed in: `sausage`, `same`, `sesame`
- the expected outcome is `attempts to guess the password : 3`
- how many attempts would *actually* be reported ?
> Answer : 
- Suggest how reorganising the sequence of stpes inside the loop could help:
> Answer : 
---

> Task 2 

- Here is pseudocode for an `until` loop, change it to a `while` loop:
```java
  int timer = 10
  until (timer == 0)
  {
      timer = timer - 1
      display timer
  }
```
- edit the condition below to make the while loop behave same as until loop:
```java
  int timer = 10
  while (?????)
  {
      timer = timer - 1
      display timer
  }
```
---

> task 3 : soft drink vending machine, bottles cost 70 pence
- Here is the design for code to accept coins in payment for a soft drink bottle.
- It is supposed to track coins put in and tell the user how much is still due.
- If the payment goes over 70 pence it displays the change due.
```java
  1 set paymentDue to 70
  2 set coinValue to 0 
  3 repeat while (paymentDue >= 0)
  4     display paymentDue + ": due, enter coin value : "
  5     set coinValue to number entered by the user
  6     set paymentDue to paymentDue - coinValue
  7 end while loop
  8 display "thankyou, change due is" + (0 - paymentDue)
```
> below is the actual output, it is not as expected
```java
70: due, enter coin value : 50
20: due, enter coin value : 10
10: due, enter coin value : 10
0: due, enter coin value : 5
thankyou, change due is : 5
```
- try to explain what is wrong with the design and how it should be changed
> Explanation: 
---

the requirement of an update to alter state within loop, else infinite loop
```java
throws = 0
mystery = random number 1-6
while mystery != 6
mystery = random number 1-6
throws = throws + 1
end while
display "it took " + throws + "throws to get a 6"
```

> Written with [StackEdit](https://stackedit.io/).
<!--stackedit_data:
eyJoaXN0b3J5IjpbOTU3ODA3NzQ5XX0=
-->