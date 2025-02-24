# KT-75393

Reproducer for [KT-75393](https://youtrack.jetbrains.com/issue/KT-75393).

Just run:

```shell
./gradlew jsNodeDevelopmentRun
```

[There is also a workflow that reproduces the issue.](https://github.com/lupuuss/KT-75393/actions/workflows/tests.yml)

## Overview

`:dependency` has a `foo` function that uses `this` implicitly. This project is compiled with Kotlin `2.1.20-RC`.

Root project depends on `:dependency` and fails to compile with Kotlin `2.1.10`. 
Compilation succeeds, when Kotlin is bumped to `2.1.20-RC` or `this` in `:dependency` is used explicitly.
