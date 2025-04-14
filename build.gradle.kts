plugins {
    java
    id("org.springframework.boot") version "3.4.4"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "roshka.diegoduarte"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation(platform("roshka.diegoduarte:mssc-brewery-bom:0.0.1-SNAPSHOT"))
    annotationProcessor(platform("roshka.diegoduarte:mssc-brewery-bom:0.0.1-SNAPSHOT"))
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-web")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
    implementation ("org.springframework.boot:spring-boot-starter-validation")
    testImplementation("org.springframework.boot:spring-boot-starter-test")

    implementation ("org.mapstruct:mapstruct")
    implementation ("org.projectlombok:lombok")

    annotationProcessor ("org.mapstruct:mapstruct-processor")
    annotationProcessor ("org.projectlombok:lombok")
    annotationProcessor ("org.projectlombok:lombok-mapstruct-binding")
    // JUnit 5 (Jupiter)
    testImplementation ("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine")
    testImplementation ("org.mockito:mockito-core")
    testImplementation ("org.mockito:mockito-junit-jupiter")
    //database
    runtimeOnly ("com.h2database:h2")

    implementation("javax.cache:cache-api")
    implementation("org.ehcache:ehcache::jakarta")

}

tasks.withType<Test> {
    useJUnitPlatform()
}
tasks.withType<JavaCompile> {
    options.compilerArgs.add("-Amapstruct.defaultComponentModel=spring")
}
