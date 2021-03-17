plugins {
    `java-library`
    kotlin("jvm") version "1.4.31"
}

group = "com.sofi"

repositories {
    mavenCentral()
}

dependencies {
    api("com.fasterxml.jackson.core:jackson-databind:2.10.5")
    api("io.jsonwebtoken:jjwt-api:${property("jwtVersion")}")
}
