plugins {
    id("java")
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    testImplementation("org.testng:testng:7.1.0")
}

tasks.test {
    useTestNG()
}