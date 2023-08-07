# 2023.05.25-Hidden-Message
Nemo is trying to help Dory work her brain (and hopefully improve her memory!). Nemo invents the following game - he'll create a collection of seemingly random letters, and Dory will have to determine if a given word is inside of it. To make things especially tricky, the letters do not have to be next to each other (but they have to be in the right order). For example, benluemgao, contains the word nemo.

be*n*lu*em*ga*o*

To add one more level of difficulty, Nemo also wants Dory to tell him what is left in the message after the given word is removed. In the example above, what's left after removing nemo is:

beluga

Nemo realizes that the same word may be inside the hidden message multiple times, so he adds the rule that you only have to delete the first occurrence of the word (reading left to right). Help Dory right a program to help her with this challenging task!

https://drive.google.com/open?id=0BxxolsFkwnDqVk9RUi1VaEFua1E

##### Input Format
The first line will have a single number n, the number of games to play The next n lines will contain strings Ai and Bi, separated by a space

##### Constraints
1 <= n <= 1000 Ai only contains lowercase alphabetical letters Bi only contains lowercase alphabetical letters The length of both Ai and Bi are under 10000 characters

##### Output Format
There will be n lines of input. Each line's output will follow these rules If Bi is inside of Ai, then the output will consist of the contents of Bi after Ai is removed from it. If Bi is not inside of Ai, then the output will be NO MATCH

##### Sample Input 0
1
benluemgao nemo

##### Sample Output 0
beluga

##### Sample Input 1
2
benluemgao marlin
findingmarlin far

##### Sample Output 1
NO MATCH
indingmlin
