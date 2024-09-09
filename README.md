#header1

Find All Duplicates
Write a function (or static method in the case of Java) that accepts a list of integers and returns a list of only those integers that appear more than once.

Describe Different Approaches to Solving This Problem
Describe the two different ways to figure out all of the duplicate values of a list of integers in english. The first solution is the nested loop solution. The second solution is to use a dictionary or a map (similar to the containsPair method we wrote in class. Describe both in as much detail as you can (with no code) and describe the trade-offs between the two solutions.

With nested loops, we start by getting a value from the list with a for loop, and then check it against all subsequent values in the list with another for loop. We can then use a boolean flag to mark whether we've encountered a duplicate.

If we've found a duplicate, and then we check in the list we want to return whether that value is already there, then we add it. When the full nested loop is finished we return that list.

The more efficient approach varies between java and python.

With Java, list objects have a contains method, which is crucial. We begin by creating two lists, one that will contain a list of the unique numbers we have encountered thus far, and then another that will contain the list of duplicates we want to return.

We have a single loop that examines each value, and then it looks to see whether it's in our list of unique values. If it is, then we check to see if it is in our duplicates list, and if it isn't, then we add it there. If it isn't a duplicate at all, then we add it to the unique list.
At the end we return the list of duplicates.

We python, we have to use a different data structure that allows us to use functionality similar to the contains method for lists in Java. To do this we have to use the set data structure, and then our logic looks very similar:
For each number in the input list:
if the number is in the unique list already, then we add it to the results. If it isn't, then we add it to the unique set. The reason this works is because with set data structures, you cannot have duplicate values thus ensuring that our returned set only includes duplicate values once! 
