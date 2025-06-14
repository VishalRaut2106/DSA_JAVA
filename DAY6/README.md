# Function /Methods
Java mein, method aur function ka matlab almost same hota hai.
Function ek code ka block hota hai jo specific kaam karta hai, aur jisko hum baar-baar call kar sakte hain.

```java
returnType name(){
    // body
    return statement
}
```


### sysntax with parameters
```java
returnType  name (type param1 , type param2){
    // body
    return statement;
}
```


> java always calls by value , every time variable ki copy jati hai


## function Overloading
"Function Overloading tab hota hai jab ek hi function ka naam hota hai, lekin uske parameters alag hote hain.

➡️ Java mein methods overload tab hote hain jab:

Number of parameters alag ho
OR

Type of parameters alag ho
OR

Order of parameters alag ho"

### 📌 Why Use Overloading?
+ Code reusable banata hai

+ Function ka kaam same hota hai, bas input type ya count change hota hai

+ Readability aur maintainability increase hoti hai

**Using Parameters** 

**Using Datatypes**


## binary to decimal

Binary number = 1011
Decimal conversion =
1×2³ + 0×2² + 1×2¹ + 1×2⁰
= 8 + 0 + 2 + 1 = 11
---
Right to Left:
1 × 2⁰ = 1  
0 × 2¹ = 0  
0 × 2² = 0  
1 × 2³ = 8  
---------------
Total      = 9

---

**STEPS**
1) Start from rightmost digit

2) Multiply digit with 2^i

3) Add to result

4) Move to next digit

5) Repeat till number ends

| 🧮 Digits | 🟢 Smallest Binary | 🔴 Largest Binary | Decimal Range   |
| --------- | ------------------ | ----------------- | --------------- |
| 2         | `10`               | `11`              | `2` to `3`      |
| 4         | `1000`             | `1111`            | `8` to `15`     |
| 6         | `100000`           | `111111`          | `32` to `63`    |
| 8         | `10000000`         | `11111111`        | `128` to `255`  |
| 10        | `1000000000`       | `1111111111`      | `512` to `1023` |
