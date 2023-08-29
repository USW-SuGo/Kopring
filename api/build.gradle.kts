application {
    mainClass.set("com.usw.sugo.SugoApplicationKt")
}

dependencies {
    api(project(":core"))
    implementation("org.springframework.boot:spring-boot-starter-security")
    implementation("org.springframework.boot:spring-boot-starter-validation")
}

tasks.bootJar {
    enabled = true
}

tasks.jar {
    enabled = false
}
