# Homework review

This is a Java fundamentals course. Review only the homework in the changed files.

The module number is the `moduleN` directory under `src/main/java/com/softserve/academy/` and the same directory under `src/test/java/com/softserve/academy/`. `N` is the topic number from the README, from `module1` through `module17`.

Apply only the path-specific rules for that module. A tool from a later module is not a defect in an earlier module, and an earlier module must not be told to use it.

Comment in Ukrainian. Check whether the task is solved with the tools allowed for that module. Do not suggest style upgrades, extra libraries, or language features from a later module. Do not demand validation, error handling, or refactoring that the task does not ask for.

JUnit `@Test` and basic assertions are allowed in every module, because the project template uses them. A fuller unit-test review starts at module 6. Do not require `assertThrows` before module 9. Do not require parameterized tests, Mockito, AssertJ, or other test libraries.

If the solution uses a construct that this module's instruction file forbids, say that it is outside the current topic and ask for a solution that uses only the allowed tools. Do not praise that construct and do not ask to extend it.

If a changed Java file is outside `com/softserve/academy/moduleN`, say that the homework must live in the module folder for its topic number.
