## operators
symbols that the compiler to perform some operation
sum = a + b => a & b =operands // + - * / Operators

> ### Type of Operator
>Arithmatic operator (binary/Unary)\
>Relational operator\
>Logical operator\
>Bitwise operator
>Assignment operator

 
## binary: normal operator 
+ __+__ -> A+B = 10+5=15
+ **-** -> A+B = 10+5=5
+ __*__-> A+B = 10+5=50
+ __/__-> A+B = 10+5=2
+ __%__(Modulo)-> A+B = 10+5=0
---

## unary operator
| Operator | Name               | Description                               | Example           |
| -------- | ------------------ | ----------------------------------------- | ----------------- |
| `+`      | Unary plus         | Indicates a positive value (rarely used)  | `+a`              |
| `-`      | Unary minus        | Negates a value                           | `-a`              |
| `++`     | Increment          | Increases value by 1                      | `a++` or `++a`    |
| `--`     | Decrement          | Decreases value by 1                      | `a--` or `--a`    |
| `!`      | Logical NOT        | Inverts boolean value                     | `!true` = `false` |
| `~`      | Bitwise complement | Flips bits (advanced, used in binary ops) | `~a`              |

```java
int a = 5;

System.out.println(++a); // 6 (Pre-increment: increases before using)
System.out.println(a++); // 6 (Post-increment: uses first, then increases)
System.out.println(a);   // 7 (a is now 7)```
```

## relational opretor
`==,!=,<,>,<=,>=`

## Logical Operators
`&& ,||, !`
| A | B | A && B | A \|\| B |
| - | - | ------ | -------- |
| T | T | ✅ T    | ✅ T      |
| T | F | ❌ F    | ✅ T      |
| F | T | ❌ F    | ✅ T      |
| F | F | ❌ F    | ❌ F      |


| A | !A  |
| - | --- |
| T | ❌ F |
| F | ✅ T |


## Assignment Operators
`=, +=,-=,*=,/=,%=`
| Operator | Meaning           | Equivalent to          |
| -------- | ----------------- | ---------------------- |
| `+=`     | Add & assign      | `a += 5` → `a = a + 5` |
| `-=`     | Subtract & assign | `a -= 3` → `a = a - 3` |
| `*=`     | Multiply & assign | `a *= 2` → `a = a * 2` |
| `/=`     | Divide & assign   | `a /= 4` → `a = a / 4` |
| `%=`     | Modulo & assign   | `a %= 3` → `a = a % 3` |
