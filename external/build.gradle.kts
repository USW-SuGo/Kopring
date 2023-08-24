dependencies {
    implementation("org.springframework.cloud:spring-cloud-aws-context:2.2.6.RELEASE")
}

tasks.bootJar {
    enabled = false
}

tasks.jar {
    enabled = true
}
