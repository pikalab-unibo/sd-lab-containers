// Redefine the task named `run', which is of type `JavaExec'
tasks.named<JavaExec>("run") {
  // The qualified name of the class to be run
  main = "my.app.App"
  // A tdescription for the task
  description = "Runs App.java"
  // Set the application stdin to Gradle's stdin
  standardInput = System.`in`              // NOTICE BACKTICKS
  // Set the application classpath
  sourceSets.main { classpath = runtimeClasspath }
  // Checks whether a property with key "username" exists
  if (rootProject.hasProperty("username")) {
    // in case, appends its value to the application arguments
    args(rootProject.property("username"))
  } else {
    // otherwise, appends a default value to the application arguments
    args("nobody")
  }
}