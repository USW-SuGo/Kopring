application {
    mainClass.set("com.usw.sugo.SugoApplicationKt")
}

dependencies {
    api(project(":core"))
    implementation("org.springframework.boot:spring-boot-starter-validation")
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}
