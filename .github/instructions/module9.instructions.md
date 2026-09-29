---
applyTo: "**/module9/**"
---

# Module 9 — exceptions

Allowed: modules 1–8, plus `try`, `catch`, `finally`, `throw`, `throws`, custom exceptions, and `assertThrows`.

Do not suggest or require: nested classes, inner classes, anonymous classes, collections, regular expressions, lambda expressions, method references, `Optional`, the Date-Time API, the Stream API, threads, file I/O, or web APIs.

`try-with-resources` and file classes belong to module 17. Do not require them here. Suggest `try-catch` only when the task is about exceptions or the code calls something that must be handled for the task. Do not wrap every method in `try-catch`.
