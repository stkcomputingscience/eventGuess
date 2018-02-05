## eventGuess

> This assignment introduces conditional loops and random number values. The program will also count the number guesses in a game.

## purpose

The CyberSense event always has competitions to keep delegates entertained. A popular competition is to guess the value of a random number. The app has to set up a random number and then let a player enter their guess. The program should report on the success (or not) of the guess.

![random numbers](https://i.ytimg.com/vi/oBCl5UqooKk/maxresdefault.jpg)

### developer notes

 - You will need to produce *random numbers*, they are described in the `random.md` file.
 - *Conditional loops* are described in the `conditionalLoop.md` file. They are used to repeat instructions when you don't know in advance *how many* repeats will take place.
 - Keeping a count of the number of guesses is required in the final version, the notes are in the `countingLoop` file.
---

> version 1 :a *single*1 chance only to guess a random number 

### analysis
 - The user is asked to enter **one** guess between 1-10 to identify a number the program has set up *at random*.
 - The program decides if the guess is correct (or not). 
 - The result is displayed to say whether or not the player is successful.
 - A random number will be needed. (*There will be no loop in this version as player gets **one** guess only*).
 - You should read the `random.md` file **now** before moving on to studying the design stage.
   
*screen shot of UI : first version looks like this*
![eventGuessScreen](https://lh3.googleusercontent.com/28REr6MhLfHM0Pw2JDKUGhEcFSYapZgCMncaf5KnHZd-858Xa0q9WUjYWrGgFCCZDiyWdozyLOXG "eventGuessScreen")

### Analysis

- the program has to create one random number, the user / player enters a single guess
- the program decides whether or not the guess is correct
- depending on the conditional outcome the program displays a message to show a successful result or a fail.

### Design
- sketch of the user interface, the * items are *alternatives* depending on success of the player's guess.

![eventGuess v1 UI sketch](https://lh3.googleusercontent.com/FYPGTofvjWfRq0sKTxepVIVmw58XFLv_jtM-z-mz0IQPQrvB_gzK874E3KcuzHb1z8YyDjd8Yx4N=s400 "eventGuess v1 UI sketch")
- Look at version 1 design in the `design.md` file to see the logic design.
- You will see a *flowchart*, a *structure diagram* and *pseudocode*.
- Pay attention to how the *random number* feature is designed.
- The flowchart and structure diagram designs are *complete*
  - use them to *complete the missing parts* of the **pseudocode**.

### Implementation

- The version 1 design has been implemented according to the design.
- Read the notes in `random.md` and study the code in the `eventGuess.java` file.
  - Make sure you know where the lines of code for organising the random value are.
  - Pay attention to the parameter used to *set the range and how it is used*.
- Run the program and try to guess the number.

### Testing
- Run the code, keep trying! 
- Until you are both successful and unsuccessful, you don't know if it works properly!
- Testing a program that uses random values is tricky. The expected outcome is random!
- (There is no test note file in this assignment).

### review
- Before you move on make sure you understand the design as shown by the flowchart, structure diagram and pseudo code and can see that the design matches how the program code executes.

---
> version 2 : allow the player to take multiple guesses and stop when the player gets it right.

### developer notes
- read the notes about conditional loops in the `conditionalLoop` file.
- you are going to need a `while` loop in version 2.

### analysis

- there are no new inputs, as before, the user will enter a guess but now it will be as many guesses as it takes to get the number correct.
- the program will set up one random number as before.
- the program will decide the result of the guess and display a suitable message. It will also decide whether or not another guess is needed.
- The random number is *no longer displayed* since that would help the player!

### design

- A while loop repeats to let the player make another guess.
- use the flowchart and structure diagrams to update the pseudo code.
  - the notes in the `conditionalLoop` file will help.

### implementation
- use the designs, especially the pseudocode to implement the conditional loop.
  - the notes in the `conditionalLoop` file will help.
### testing
- run the program several times to check that the results show evidence of random behaviour. For example, when the guess is entered always guess with the same pattern: 1, 2, 3, 4,.. etc. The number of guesses should vary randomly.
---
> version 3 : count the number of guesses taken to get the correct value

### developer notes
 - Keeping a count of the number of guesses is required in the final version, the notes are in the `countingLoop` file.

### analysis

- no new inputs
- the program should initialise a `guessCount` and update it every new guess.
- the program should display the number of guesses taken at the end once the random number has been correctly guessed.

### design
- look at `design` file for version three
- A **count** is *prepared*, *updated* and final result *displayed*.
- The flowchart and structure diagram designs are complete, use them to complete the pseudocode.

### implementation
- use the pseudocode to edit your java code.
- use the notes in the `countingLoop` file.
### testing
- same as v2, run the program several times to check that the results show evidence of random behaviour. For example, when the guess is entered always guess with the same pattern: 1, 2, 3, 4,.. etc. The number of guesses should vary randomly.

### Questions
- answer the questions in the `question` file.
> Written with [StackEdit](https://stackedit.io/).

<!--stackedit_data:
eyJoaXN0b3J5IjpbMTczNTY1Mzg0MSwtOTU3Mjc3MzU4LC05OT
gzNjE5MDUsLTIwNzgwODM1MzcsMTk4MjUyNTg2NCwtMTc5NTIz
MTY3MiwxMTgxNDAzMzY5LDE0OTAyMDU4NTEsMTMxNTk2MjY5MS
wxOTk2MjgzOTA1LDI5MzQ5OTE4OCwtMTAzOTI4MDQ3OSwtNDc0
MjA4NTE4LC00NzQyMDg1MTgsLTUxNTE4NzYyMl19
-->