# Java Classes and Objects

## 1. What is a Class?

A **class** is a blueprint or design used to create objects.

### Example:

```ss
class Student
{
    String name;
    int marks;
}
```

Here, `Student` is a class.

It contains:

* `name` → data
* `marks` → data

### Remember:

**Class = Blueprint**

---

## 2. What is an Object?

An **object** is a real instance of a class.

### Example:

```java
Student s1 = new Student();
```

Here:

* `Student` → class name
* `s1` → reference variable
* `new Student()` → creates an object

### Remember:

**Object = Real thing created from a class**

---

## 3. Creating an Object

Syntax:

```java
ClassName objectName = new ClassName();
```

Example:

```java
Student s1 = new Student();
```

Another object:

```java
Student s2 = new Student();
```

Now there are two Student objects.

```text
s1 → Student object 1
s2 → Student object 2
```

---

## 4. Accessing Object Data

Use the **dot (`.`) operator**.

Example:

```java
s1.name = "Nikhith";
s1.marks = 80;
```

To print:

```java
System.out.println(s1.name);
System.out.println(s1.marks);
```

Output:

```text
Nikhith
80
```

### Remember:

```text
object.variable
```

---

# 5. Multiple Objects

We can create many objects from the same class.

```java
Student s1 = new Student();
Student s2 = new Student();

s1.name = "Nikhith";
s1.marks = 80;

s2.name = "Anil";
s2.marks = 90;
```

They are **different objects**.

```text
s1
 ├── name = Nikhith
 └── marks = 80

s2
 ├── name = Anil
 └── marks = 90
```

---

# 6. What is a Method?

A **method** is a block of code that performs an action.

Example:

```java
class Student
{
    String name;

    void sayHello()
    {
        System.out.println("Hello");
    }
}
```

Call the method using:

```java
s1.sayHello();
```

### Remember:

**Method = Action/behavior of an object**

---

# 7. Variables and Methods in a Class

A class can contain:

### Variables

Store data.

```java
String name;
int marks;
```

### Methods

Perform actions.

```java
void display()
{
    System.out.println(name);
}
```

Example:

```java
class Student
{
    String name;
    int marks;

    void display()
    {
        System.out.println(name);
        System.out.println(marks);
    }
}
```

---

# 8. Constructor

A **constructor** is used when an object is created.

Example:

```java
class Student
{
    Student()
    {
        System.out.println("Student created");
    }
}
```

When we write:

```java
Student s1 = new Student();
```

the constructor runs automatically.

Output:

```text
Student created
```

### Important:

Constructor has:

* Same name as class
* No return type

Example:

```java
Student()
{
}
```

---

# 9. `this` Keyword

`this` refers to the **current object**.

Example:

```java
class Student
{
    String name;

    void setName(String name)
    {
        this.name = name;
    }
}
```

Here:

```java
this.name
```

means the object's `name`.

---

# 10. Getter and Setter

When variables are `private`, we normally use getters and setters.

Example:

```java
class Student
{
    private String name;

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
```

### Setter

Used to **set/store** a value.

```java
s1.setName("Nikhith");
```

### Getter

Used to **get/read** a value.

```java
System.out.println(s1.getName());
```

### Easy trick:

**SET = Put**

**GET = Take**

---

# 11. `private`

`private` means the variable cannot be directly accessed outside the class.

Example:

```java
private String name;
```

This is not allowed:

```java
s1.name = "Nikhith";
```

Instead:

```java
s1.setName("Nikhith");
```

and:

```java
s1.getName();
```

---

# 12. Array of Objects

We can store multiple objects using an array.

Example:

```java
Student[] s = new Student[10];
```

This creates space for 10 Student references.

Initially:

```text
s[0] → null
s[1] → null
s[2] → null
...
s[9] → null
```

We must create the objects:

```java
for(int i = 0; i < 10; i++)
{
    s[i] = new Student();
}
```

Now:

```text
s[0] → Student object
s[1] → Student object
s[2] → Student object
...
s[9] → Student object
```

---

# 13. Taking Input

Use `Scanner`.

First:

```java
import java.util.Scanner;
```

Then:

```java
Scanner scan = new Scanner(System.in);
```

### Integer input

```java
int n = scan.nextInt();
```

### String input

```java
String name = scan.nextLine();
```

### One word

```java
String name = scan.next();
```

### Decimal

```java
double marks = scan.nextDouble();
```

---

# 14. Example – Student Class

```java
import java.util.Scanner;

class Student
{
    String name;
    int marks;

    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        Student s1 = new Student();

        System.out.print("Enter name: ");
        s1.name = scan.nextLine();

        System.out.print("Enter marks: ");
        s1.marks = scan.nextInt();

        s1.display();
    }
}
```

---

# 15. Most Important Syntax

### Create class

```java
class Student
{
}
```

### Create object

```java
Student s1 = new Student();
```

### Store data

```java
s1.name = "Nikhith";
```

### Read data

```java
System.out.println(s1.name);
```

### Call method

```java
s1.display();
```

### Array of objects

```java
Student[] s = new Student[10];
```

### Create objects in array

```java
s[i] = new Student();
```

---

# 🧠 Easy Memory Trick

Remember:

```text
CLASS
  ↓
Blueprint

OBJECT
  ↓
Real thing

VARIABLE
  ↓
Stores data

METHOD
  ↓
Does an action

CONSTRUCTOR
  ↓
Runs when object is created

GET
  ↓
Take value

SET
  ↓
Put value

ARRAY
  ↓
Store multiple objects
```

## One-line definitions for exam

**Class:** A class is a blueprint or template for creating objects.

**Object:** An object is an instance of a class.

**Method:** A method is a block of code that performs a specific task.

**Constructor:** A constructor is a special method-like member that is automatically called when an object is created.

**Encapsulation:** Encapsulation means wrapping data and methods together in a class and controlling access to the data.

**Array of objects:** An array of objects is used to store multiple objects of the same class.
