plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.apache.poi:poi:5.0.0")
    implementation("org.apache.poi:poi-ooxml:5.0.0")
    implementation("org.redundent:kotlin-xml-builder:1.7.3")
}

gradlePlugin {
    plugins {
        create("KotlinPlugin") {
            id = "com.danieloskarsson.kotlin.plugin"
            implementationClass = "KotlinPlugin"
            version = "1.0.0"
        }
    }
}
