# redacted

Components to redact sensitive information from `toString` output. <br />
<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chRyNaN/redacted">

This library was inspired by
this [article](https://mustafaali.net/2018/01/14/Kotlin-data-classes-and-sensitive-information/) that I was introduced
to by a coworker. I often find myself needing this functionality in projects, so I decided to advance the functionality
and make it a reusable library.

```kotlin
data class Credentials(
    val email: String,
    val password: RedactedProperty<String>
)

val credentials = Credentials(
    email = "test@example.com",
    password = RedactedProperty(value = "jhdgldfi248nd!39d?")
)
```

## Using the library

Simply use the `RedactedProperty` in place of any property that contains sensitive information that should not be
printed out.

```kotlin
data class Credentials(
    val email: String,
    val password: RedactedProperty<String>
)
```

To obtain an instance of a `RedactedProperty`, just use the constructor:

```kotlin
RedactedProperty(value = "jhdgldfi248nd!39d?")
```

To override the default value that is printed when `toString` is called on the `RedactedProperty`, provide
the `redactedString` value:

```kotlin
RedactedProperty(
    value = "jhdgldfi248nd!39d?",
    redactedString = "******"
)
```

To specify an amount of times the `redactedString` value should be repeated when the `toString` function is called,
provide the `repeatCount` value (which defaults to `RepeatCount.Exact(count = 1)`):

```kotlin
RedactedProperty(
    value = "jhdgldfi248nd!39d?",
    redactedString = "*",
    repeatCount = RepeatCount.MatchLength
)

RedactedProperty(
    value = "jhdgldfi248nd!39d?",
    redactedString = "*",
    repeatCount = RepeatCount.Exact(count = 5)
)
```

**Note:** that the redacted property can still be printed out and obtained if explicitly calling the `toString` function
on the `RedactedProperty.value` property.

## Building the library

The library is provided through [Repsy.io](https://repsy.io). Checkout
the [releases page](https://github.com/chRyNaN/redacted/releases) to get the latest version. <br/>
<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chRyNaN/redacted">

### Repository

```groovy
repositories {
    maven { url = "https://repo.repsy.io/mvn/chrynan/public" }
}
```

### Dependencies

**Core:**

```groovy
implementation "com.chrynan.redacted:redacted-core:VERSION"
```

**Serialization:**

```groovy
implementation "com.chrynan.redacted:redacted-serialization:VERSION"
```

## Documentation

More detailed documentation is available in the [docs](docs) folder. The entry point to the documentation can be
found [here](docs/index.md).

## License

```
Copyright 2021 chRyNaN

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
