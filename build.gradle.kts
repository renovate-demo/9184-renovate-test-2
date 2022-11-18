plugins {
    `java-library`
    kotlin("jvm") version "1.7.21"
}

group = "com.sofi"

repositories {
    mavenCentral()
}

dependencies {
    api("com.fasterxml.jackson.core:jackson-databind:2.14.0")
    api("io.jsonwebtoken:jjwt-api:${property("jwtVersion")}")
}
