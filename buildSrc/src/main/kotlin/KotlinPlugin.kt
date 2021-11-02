import org.gradle.api.Plugin
import org.gradle.api.Project

class KotlinPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.tasks.create("pluginTask") {
            println("Hello from Kotlin plugin!") // ${project.name}
        }
    }

}
