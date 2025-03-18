#My Explanation https://drive.google.com/file/d/1wXxCQxW-vkZv1yEMWj-dWRTek-DkDX2h/view?usp=sharing
# 📚 Low Coupling Principle 

## 🛑 Problem Statement  

In a **Library Management System**, we need to manage book issuing and returning. A common mistake is to let the `Library` class directly handle `Book` and `Member` operations.  

### ❌ Without Low Coupling (Bad Design)  
- The `Library` class has **direct dependencies** on `Book` and `Member`.  
- If `Book` or `Member` changes, the `Library` class **must also be updated**.  
- The system becomes **hard to maintain** and **not scalable**.  

For example, if we add new rules for issuing books, we must modify the `Library` class, leading to **tight coupling**.  

---

## ✅ How Low Coupling Helps (Good Design)  

By applying **Low Coupling**, we introduce an **`IssueManager`** class to **separate the responsibilities** of book issuing and returning.  

### 🔹 Advantages of Low Coupling  
✔️ **Flexible Code**: `Library` does not need to change when `Book` or `Member` changes.  
✔️ **Better Maintainability**: `IssueManager` handles book-issuing logic separately.  
✔️ **Scalability**: We can add new rules for issuing books without modifying the `Library` class.  

### 💡 Simple Example  

### ❌ Instead of this **(Bad Design – High Coupling)**:  

```java
class Library {
    public void issueBook(Book book, Member member) {
        System.out.println(member.name + " borrowed " + book.title);
    }
}
```

The `Library` class **directly handles** book issuing.  
Any changes in `Book` or `Member` **affect `Library`**, making the system hard to maintain and modify.


### ✅ We use **(Good Design – Low Coupling)**: 

```java
class IssueManager {
    public void issueBook(Book book, Member member) {
        System.out.println(member.name + " borrowed " + book.title);
    }
}
```
Now, `Library` does **not directly** handle book issuing.  
We can **modify book-issuing rules** without changing `Library`.


## 🎯 Conclusion  

Applying **Low Coupling** makes our system **more maintainable, scalable, and flexible**.  
It ensures that **changes in one part do not force changes in another**, leading to **better software design**.  

💡 **In short:** Keep classes **independent** and **focused on a single responsibility** for a cleaner and more efficient system! 

