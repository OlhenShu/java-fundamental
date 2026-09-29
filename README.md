# Java Fundamentals Course 🚀

[Українською](#українською) · [English](#english)

[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://www.oracle.com/java/technologies/javase/jdk21-archive-downloads.html)
[![Maven](https://img.shields.io/badge/Maven-3.16.0-blue.svg)](https://maven.apache.org/)
[![JUnit](https://img.shields.io/badge/JUnit-6.1.3-green.svg)](https://docs.junit.org/6.1.3/overview.html)

## Українською

Це репозиторій групи **UA-<group_number>-Java-Fundamentals** для домашніх і практичних завдань курсу «Java Fundamentals». Курс дає базові поняття Java, потрібні для подальшого навчання розробці програмного забезпечення.

### Зміст
- [Огляд курсу](#огляд-курсу)
- [Основні теми курсу](#основні-теми-курсу-)
- [Структура проєкту](#структура-проєкту)
- [Папки домашніх робіт](#папки-домашніх-робіт)
- [Гілки репозиторію](#гілки-репозиторію)
- [Початок роботи](#початок-роботи)
    - [Вимоги](#вимоги)
    - [Налаштування проєкту](#налаштування-проєкту)
    - [Запуск тестів](#запуск-тестів)
- [Як здавати роботу](#як-здавати-роботу)

### Огляд курсу
Курс послідовно знайомить із програмуванням на Java: від базового синтаксису до багатопотоковості та введення-виведення.

### Основні теми курсу 📚
1. **Знайомство з Java**: можливості Java, налаштування середовища і перша програма.
2. **VCS. GIT**: базові команди Git і принципи керування версіями.
3. **Вступ до ООП**: класи, об'єкти та інкапсуляція.
4. **Умови**: `if-else` і `switch` для керування ходом програми.
5. **Масиви і цикли**: масиви та цикли `for`, `while`, `do-while`.
6. **Enum. Модульне тестування**: переліки та модульні тести на JUnit.
7. **ООП: наслідування і поліморфізм**: наслідування, абстрактні класи і поліморфізм.
8. **ООП: інтерфейси**: інтерфейси та їх реалізація.
9. **Винятки**: створення і обробка винятків.
10. **Вкладені і внутрішні класи**: вкладені, внутрішні та анонімні класи.
11. **Колекції. Частина 1**: `List`, `Set` та їх реалізації.
12. **Колекції. Частина 2**: `Map`, сортування і пошук.
13. **Рядки. Регулярні вирази**: робота з рядками і регулярними виразами.
14. **Функціональні інтерфейси, Date and Time API**: лямбда-вирази, функціональні інтерфейси та Date-Time API.
15. **Streams API**: послідовна і паралельна обробка даних через Stream API.
16. **Багатопотоковість**: основи багатопотоковості і створення потоків.
17. **Потоки введення-виведення. Дебагінг**: потоки введення-виведення і базове налагодження.

### Структура проєкту
```
UA-<group_number>-Java-Fundamentals/
├── .github/               # правила рев'ю Copilot, окремий файл на модуль
├── src/
│   ├── main/java/com/softserve/academy/module1/ ... module17/
│   └── test/java/com/softserve/academy/module1/ ... module17/
├── .gitignore
├── pom.xml
└── README.md
```

### Папки домашніх робіт

Назва папки — це слово `module` і номер теми з розділу [Основні теми курсу](#основні-теми-курсу-). Той самий номер використовуйте і в `main`, і в `test`. Назва пакета збігається з назвою папки.

| Тема | Назва папки | Пакет |
|---|---|---|
| 1. Знайомство з Java | `module1` | `com.softserve.academy.module1` |
| 2. VCS. GIT | `module2` | `com.softserve.academy.module2` |
| 3. Вступ до ООП | `module3` | `com.softserve.academy.module3` |
| 4. Умови | `module4` | `com.softserve.academy.module4` |
| 5. Масиви і цикли | `module5` | `com.softserve.academy.module5` |
| 6. Enum. Модульне тестування | `module6` | `com.softserve.academy.module6` |
| 7. ООП: наслідування і поліморфізм | `module7` | `com.softserve.academy.module7` |
| 8. ООП: інтерфейси | `module8` | `com.softserve.academy.module8` |
| 9. Винятки | `module9` | `com.softserve.academy.module9` |
| 10. Вкладені і внутрішні класи | `module10` | `com.softserve.academy.module10` |
| 11. Колекції. Частина 1 | `module11` | `com.softserve.academy.module11` |
| 12. Колекції. Частина 2 | `module12` | `com.softserve.academy.module12` |
| 13. Рядки. Регулярні вирази | `module13` | `com.softserve.academy.module13` |
| 14. Функціональні інтерфейси, Date and Time | `module14` | `com.softserve.academy.module14` |
| 15. Streams API | `module15` | `com.softserve.academy.module15` |
| 16. Багатопотоковість | `module16` | `com.softserve.academy.module16` |
| 17. Потоки введення-виведення. Дебагінг | `module17` | `com.softserve.academy.module17` |

Кожен клас кладіть так:

```
src/main/java/com/softserve/academy/module4/ConditionTask.java
src/test/java/com/softserve/academy/module4/ConditionTaskTest.java
```

Папка пишеться малими літерами, без пробілу, дефіса і зайвого слова: `module4`, а не `module-4`, `Module4`, `module04` чи `conditions`.

Не кладіть розв'язок у пакет за замовчуванням, у папку зі своїм ім'ям або в папку, названу темою. Copilot визначає тему pull request за назвою цієї папки і перевіряє лише ті засоби, які вже пройдені до цього модуля.

Каталог `.github` не змінюйте. Гілку створюйте від актуального `main`, щоб правила рев'ю були у вашій гілці.

### Гілки репозиторію

- `main` – шаблон, від якого створюють нові гілки
- `mentor-branch` – приклади з занять. Гілки `mentor` і `mentor-branch` Copilot не перевіряє
- `your_name` – особиста гілка студента (замість `your_name` підставте своє ім'я, наприклад `olha_shevchenko`)

### Початок роботи

#### Вимоги
- Java Development Kit (JDK) 21+
- Git
- IDE (рекомендовано IntelliJ IDEA або Eclipse)

#### Налаштування проєкту

##### Як створити свою гілку:

1. Створіть папку на диску 📂
2. Відкрийте командний рядок, Git Bash або **термінал** в IDE (IntelliJ IDEA чи Eclipse) 💻
3. Клонуйте репозиторій 🔗:
    ```bash
    git clone <link_for_actual_repo>
    ```
4. Перейдіть у теку репозиторію:
    ```bash
    cd name_of_the_folder
    ```
5. Перевірте активну гілку:
    ```bash
    git branch
    ```
6. Створіть свою гілку і перейдіть на неї:
    ```bash
    git switch -c your_name
    ```
7. Відкрийте проєкт в IDE (IntelliJ IDEA або Eclipse) і починайте писати код.

#### Запуск тестів
У проєкті тести написані на JUnit 6. Щоб їх запустити:

1. Через Maven:
    ```bash
    ./mvnw test
    ```
   або у Windows:
    ```bash
    mvnw.cmd test
    ```

2. Через IDE:
    - Клацніть правою кнопкою по файлу тесту або по каталогу тестів
    - Оберіть «Run Tests» або відповідну команду вашої IDE

### Як здавати роботу
1. Створіть гілку від актуального `main` (`git switch -c your_name`)
2. Покладіть домашку в `moduleN` цієї теми, як описано в розділі [Папки домашніх робіт](#папки-домашніх-робіт)
3. Закомітьте зміни (`git commit -m 'Add module 4 solution'`)
4. Запуште гілку (`git push -u origin your_name`)
5. Відкрийте pull request у `main`

Copilot перевіряє pull request за правилами з `.github`. Ментор вмикає це один раз на GitHub: **Settings → Copilot → Code review → Automatic code review**, і має бути увімкнено **Use custom instructions when reviewing pull requests**.

---
> **Примітка**: усі команди вище можна виконувати з термінала IDE (IntelliJ IDEA або Eclipse). ✨

## English

This is the repository for the **UA-<group_number>-Java-Fundamentals** group, created for completing homework and practical tasks for the "Java Fundamentals" course. The course is designed to teach basic Java programming concepts that are essential for further development in the field of software engineering.

### Table of Contents
- [Course Overview](#course-overview)
- [Key Course Topics](#key-course-topics-)
- [Project Structure](#project-structure)
- [Homework Folders](#homework-folders)
- [Repository Branches](#repository-branches)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Setting Up the Project](#setting-up-the-project)
    - [Running Tests](#running-tests)
- [Contributing](#contributing)

### Course Overview
This course provides a comprehensive introduction to Java programming, covering everything from basic syntax to multithreading and I/O.

### Key Course Topics 📚
1. **Java Introduction**: Overview of Java's capabilities, setting up the environment, and writing your first program.
2. **VCS. GIT**: Basic Git commands and version control principles.
3. **Introduction to OOP**: Basics of OOP, creating classes and objects, and understanding encapsulation.
4. **Conditionals**: Using `if-else` and `switch` statements for controlling the program flow.
5. **Arrays and Loops**: Operations with arrays and using loops (`for`, `while`, `do-while`) to handle repetitive tasks.
6. **Enum. Unit testing**: Enumerations and unit tests with JUnit.
7. **OOP: Inheritance and polymorphism**: Inheritance, abstract classes, and polymorphism.
8. **OOP: Interfaces**: Interfaces and their implementation.
9. **Exceptions**: Creating and handling exceptions.
10. **Nested and Inner classes**: Nested, inner, and anonymous classes.
11. **Collections. Part 1**: `List`, `Set`, and their implementations.
12. **Collections. Part 2**: `Map`, sorting, and searching.
13. **String. Regular expressions**: Manipulating strings and using regular expressions.
14. **Functional interfaces, Date and Time API**: Lambda expressions, functional interfaces, and the Date-Time API.
15. **Streams API**: Parallel and sequential data processing with the Stream API.
16. **Multithreading**: Basics of multithreading and creating threads.
17. **IO Streams. Debugging**: Input/output streams and basic debugging.

### Project Structure
```
UA-<group_number>-Java-Fundamentals/
├── .github/               # Copilot review rules, one file per module
├── src/
│   ├── main/java/com/softserve/academy/module1/ ... module17/
│   └── test/java/com/softserve/academy/module1/ ... module17/
├── .gitignore
├── pom.xml
└── README.md
```

### Homework Folders

The folder name is the word `module` plus the topic number from [Key Course Topics](#key-course-topics-). Use the same number in `main` and `test`. The package name is the folder name.

| Topic | Folder name | Package |
|---|---|---|
| 1. Java Introduction | `module1` | `com.softserve.academy.module1` |
| 2. VCS. GIT | `module2` | `com.softserve.academy.module2` |
| 3. Introduction to OOP | `module3` | `com.softserve.academy.module3` |
| 4. Conditionals | `module4` | `com.softserve.academy.module4` |
| 5. Arrays and Loops | `module5` | `com.softserve.academy.module5` |
| 6. Enum. Unit testing | `module6` | `com.softserve.academy.module6` |
| 7. OOP: Inheritance and polymorphism | `module7` | `com.softserve.academy.module7` |
| 8. OOP: Interfaces | `module8` | `com.softserve.academy.module8` |
| 9. Exceptions | `module9` | `com.softserve.academy.module9` |
| 10. Nested and Inner classes | `module10` | `com.softserve.academy.module10` |
| 11. Collections. Part 1 | `module11` | `com.softserve.academy.module11` |
| 12. Collections. Part 2 | `module12` | `com.softserve.academy.module12` |
| 13. String. Regular expressions | `module13` | `com.softserve.academy.module13` |
| 14. Functional interfaces, Date and Time | `module14` | `com.softserve.academy.module14` |
| 15. Streams API | `module15` | `com.softserve.academy.module15` |
| 16. Multithreading | `module16` | `com.softserve.academy.module16` |
| 17. IO Streams. Debugging | `module17` | `com.softserve.academy.module17` |

Put each class here:

```
src/main/java/com/softserve/academy/module4/ConditionTask.java
src/test/java/com/softserve/academy/module4/ConditionTaskTest.java
```

The folder is lowercase, with no space, hyphen, or extra word: `module4`, not `module-4`, `Module4`, `module04`, or `conditions`.

Do not put the solution in the default package, in a folder named after yourself, or in a folder whose name is the topic. Copilot reviews a pull request by this folder name and applies only the tools taught up to that topic.

Leave the `.github` directory unchanged. Create your branch from the latest `main`, so those review rules are on your branch.

### Repository Branches

- `main` – template for creating new branches
- `mentor-branch` – examples from training sessions. Copilot does not review the `mentor` or `mentor-branch` branches
- `your_name` – individual student branches (replace `your_name` with your name, for example `olha_shevchenko`)

### Getting Started

#### Prerequisites
- Java Development Kit (JDK)  21+
- Git
- IDE (IntelliJ IDEA or Eclipse recommended)

#### Setting Up the Project

##### How to create a new branch:

1. Create a folder on your local drive 📂
2. Open Command Prompt, Git Bash, or the **terminal** in your IDE (IntelliJ IDEA or Eclipse) 💻
3. Clone the repository 🔗:
    ```bash
    git clone <link_for_actual_repo>
    ```
4. Navigate to your directory:
    ```bash
    cd name_of_the_folder
    ```
5. Check the active branch:
    ```bash
    git branch
    ```
6. Create your own branch and switch to it:
    ```bash
    git switch -c your_name
    ```
7. Open the project in your IDE (IntelliJ IDEA or Eclipse) and start writing code.

#### Running Tests
This project uses JUnit 6 for testing. To run the tests:

1. Using Maven:
    ```bash
    ./mvnw test
    ```
   or on Windows:
    ```bash
    mvnw.cmd test
    ```

2. Using your IDE:
    - Right-click on the test file or test directory
    - Select "Run Tests" or equivalent option in your IDE

### Contributing
1. Create your branch from the latest `main` (`git switch -c your_name`)
2. Put the homework in `moduleN` for that topic, as described in [Homework Folders](#homework-folders)
3. Commit your changes (`git commit -m 'Add module 4 solution'`)
4. Push the branch (`git push -u origin your_name`)
5. Open a pull request into `main`

Copilot reviews the pull request with the rules in `.github`. On GitHub, a maintainer turns this on once: **Settings → Copilot → Code review → Automatic code review**, with **Use custom instructions when reviewing pull requests** enabled.

---
> **Note**: All the commands above can be run directly from the terminal in your IDE (IntelliJ IDEA or Eclipse) for convenience. ✨
