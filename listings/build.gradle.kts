plugins {
  // Apply the java plugin to add support for Java
  java
  // Apply the application plugin to add support for building an application
  application 
}

// In this section you declare where to find the dependencies of your project
repositories {
  // Use jcenter for resolving your dependencies.
  jcenter()
  // Use Maven Central for resolving your dependencies.
  mavenCentral() // PREFER THIS ONE
}

application {
    // Define the main class for the application
    mainClassName = "it.unibo.my.app.App"
}

dependencies {
    // This dependency is found on compile classpath of this component and consumers.
    implementation("com.google.guava:guava:33.1.0-jre")

    // Use JUnit test framework
    testImplementation("junit:junit:4.13")
}
