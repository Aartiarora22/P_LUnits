
## Problem Statement
Given a string as input. Clean the string by removing all occurrence of character 
'#'

**Sample Test Case**
```
Input:
"#global#"

Output:
New String=global
```
## Other Test cases
**Test Case 1**
```
Input:
"#1#2#3"

Output:
New String=123
```
**Test Case 2**
```
Input:
"####"

Output:
New String=
```

**Test Case 3**
```
Input:
"#C#O#D#E#"

Output:
New String= CODE
```
**Test Case 4**
```
Input:
"*#@@#*"

Output:
New String=*@@*
```


## How to attempt?
For the given task the solution is already provided. Refer the steps below to execute your second code.

For the given problem the system will provide user inputs directly. You don't need to write any code to take user input.

### Steps to Run your second code
1. Copy the source code from [Source Code Link](https://raw.githubusercontent.com/Aartiarora22/Lab_assignments/main/Q3/T1/Main.java)
2. Paste in the editor window on the right
3. Refer the solution code given below and make necessary changes to your code
4. Hit **Submit** button
5. If you followed the steps then your code will pass test cases

### Solution/ Hint
1. Create a new string.
2. Apply loop on the given string. Inside loop apply condition on removal character using != operator. like if(ch!="#")
3. Add character in new string inside the if condition.
4. Print final string outside the loop.
