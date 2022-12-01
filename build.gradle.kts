plugins {
    kotlin("jvm") version "1.7.21"
}

repositories {
    mavenCentral()
}
dependencies {
    implementation("junit:junit:4.13.1")
    implementation(kotlin("stdlib-jdk8"))
    implementation("junit:junit:4.13.1")
}

tasks {
    sourceSets {
        main {
            java.srcDirs("src")
        }
    }

    wrapper {
        gradleVersion = "7.5.1"
    }
}