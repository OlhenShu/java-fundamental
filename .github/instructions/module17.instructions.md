---
applyTo: "**/module17/**"
---

# Module 17 — I/O streams and debugging

Allowed: modules 1–16, plus `File`, `InputStream`, `OutputStream`, `Reader`, `Writer`, `FileInputStream`, `FileOutputStream`, `BufferedReader`, `BufferedWriter`, `Scanner` on a file, and `try-with-resources`.

Do not suggest or require: `java.nio.file`, web frameworks, logging frameworks, or a debugger setup as a code change.

Suggest `try-with-resources` when the task opens a stream that must be closed.
