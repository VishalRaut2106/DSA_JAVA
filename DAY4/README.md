# LOOP
| Loop Type  | Use Case Example                      |
| ---------- | ------------------------------------- |
| `for`      | Jab repeat count **pata ho**          |
| `while`    | Jab repeat count **na pata ho**       |
| `do-while` | Jab at least **ek baar run** karna ho |


##  while loop

```java
while (condition){
    // Do something
}

```
"Jab tak condition true hai, tab tak repeat karte raho!"



## For Loop

```java
for(initialization; condition; update) {
    //do something
}
```
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

“For loop is best when you know how many times you want to repeat a task — it’s frequently used in DSA for iteration over arrays, strings, matrices, and table-based DP.”




>   [!note]
if you want last digit of any number take the reminder `i.e : num % 10`
 if you want to remove the last digit divide it
`i.e: num/10`

## Do While Loop

```java
do{
    //Do something
}while(condition);
```
> [!note]
do-while ek aisa loop hai jo code ko kam se kam ek baar chalata hai, uske baad condition check karta hai. Agar condition true hai to phir se chalega, warna ruk jayega.


## Break statement
to exit the loop

## Continue Statement
to skip an iteration