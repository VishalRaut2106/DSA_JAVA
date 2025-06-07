# Variables and Data Types



## byte → short → int → long → float → double
## char → int → long → float → double
> [!IMPORTANT]
!!! NO CAST NEEDE

---


## double → float → long → int → short → byte
## int → char (and vice versa)
> [!IMPORTANT]
!!! CAST NEEDED

---

```
Small to Big = OK ✅

Big to Small = Cast needed ⚠️

```
| Conversion Type | Direction   | Data Loss | Casting Needed |
| --------------- | ----------- | --------- | -------------- |
| Widening        | Small → Big | ❌         | ❌ (auto)       |
| Narrowing       | Big → Small | ✅         | ✅ (manual)     |


| Data Type | Size (Bytes) | Range                                                   | Category       |
| --------- | ------------ | ------------------------------------------------------- | -------------- |
| `byte`    | 1 byte       | -128 to 127                                             | Integer        |
| `short`   | 2 bytes      | -32,768 to 32,767                                       | Integer        |
| `int`     | 4 bytes      | -2,147,483,648 to 2,147,483,647                         | Integer        |
| `long`    | 8 bytes      | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | Integer        |
| `float`   | 4 bytes      | \~ ±3.4e−38 to ±3.4e+38                                 | Floating Point |
| `double`  | 8 bytes      | \~ ±1.7e−308 to ±1.7e+308                               | Floating Point |
| `char`    | 2 bytes      | 0 to 65,535 (Unicode)                                   | Character      |
| `boolean` | 1 bit\*      | `true` or `false`                                       | Logical        |
---

# Type Casting
| Expression           | Casting Type | Safe? | Output |
| -------------------- | ------------ | ----- | ------ |
| `double d = 5;`      | Widening     | ✅     | 5.0    |
| `int i = (int) 5.9;` | Narrowing    | ⚠️    | 5      |
