import org.gradle.kotlin.dsl.`maven-publish`

plugins {
    kotlin("multiplatform") version "2.1.20-RC"
    `maven-publish`
}

group = "kt.dependency"
version = "1.0"

repositories {
    mavenCentral()
}

kotlin {
    js {
        nodejs()
    }
}
