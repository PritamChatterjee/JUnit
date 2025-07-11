# JUnit

A sample Java project to demonstrate unit testing using **JUnit 5**. This repository contains simple and clear examples of how to write and run unit tests in Java using the JUnit testing framework.

---

## 📚 What is JUnit?

JUnit is a popular open-source testing framework for Java. It is used to write and run repeatable automated tests to ensure your code behaves as expected. JUnit 5 (also known as Jupiter) is the latest version that brings many improvements and new features.

---

## 🛠️ Technologies Used

- Java 17+
- JUnit 5 (Jupiter)
- Maven / Gradle (build tool)
- IDE: IntelliJ IDEA / Eclipse

---

## 📦 Project Structure

```
JUnit/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/example/calculator/
│   │           └── Calculator.java
│   └── test/
│       └── java/
│           └── com/example/calculator/
│               └── CalculatorTest.java
├── pom.xml (or build.gradle)
└── README.md
```

---

## ✅ Example Code

### 🔢 Calculator.java

```java
package com.example.calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return a / b;
    }
}
```

---

### 🧪 CalculatorTest.java

```java
package com.example.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(6, 3));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0));
    }
}
```

---

## 🚀 Running the Tests

If you're using **Maven**, run:

```bash
mvn test
```

If you're using **Gradle**, run:

```bash
gradle test
```

---

## 🧾 License

This project is licensed under the [MIT License](LICENSE).

---

## 🙋‍♂️ Contributions

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

---

## 📧 Contact

For any questions or feedback, please contact [your-email@example.com](mailto:your-email@example.com)

---

Happy Testing! 🎉
