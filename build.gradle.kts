plugins {
    kotlin("multiplatform") version "2.1.10"
}

group = "kt.example"
version = "1.0"

repositories {
    mavenCentral()
}

kotlin {
    js {
        nodejs()
        binaries.executable()
    }
}

dependencies {
    commonMainImplementation("kt.dependency:dependency:1.0")
    commonTestImplementation(kotlin("test"))
}
