plugins {
    `java-library`
    kotlin("jvm") version "1.4.31"
}

group = "com.sofi"

repositories {
    mavenCentral()
}

dependencies {
    val logbackVersion = "1.2.2"
    val jwtVersion: String by project
    api("com.fasterxml.jackson.core:jackson-databind:2.10.5")
    api("io.jsonwebtoken:jjwt-api:$jwtVersion")
    testImplementation("ch.qos.logback:logback-classic:$logbackVersion")
    api("io.github.openfeign:feign-core:9.4.0")
}
