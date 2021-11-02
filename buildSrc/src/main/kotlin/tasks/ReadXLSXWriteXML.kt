package tasks

import org.apache.poi.xssf.usermodel.XSSFWorkbook
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.redundent.kotlin.xml.PrintOptions
import org.redundent.kotlin.xml.xml
import java.io.File

open class ReadXLSXWriteXML : DefaultTask() {

    @TaskAction
    fun execute() {
        hello()
//        readXLSX()
//        writeXML()
    }

    private fun hello() {
        println("Hello from Kotlin task!")
    }

    private fun readXLSX() {
        val xlsx = "sample.xlsx"
        val sheet = XSSFWorkbook(xlsx).getSheetAt(0)
        sheet.forEach { row ->
            print(":")
            row.forEach { cell ->
                print("$cell:")
            }
            println()
        }
    }

    private fun writeXML() {
        val strings = xml("resources") {
            "string" {
                attribute("name", "app_name")
                -"Android Kotlin Task"
            }
        }
        val pathname = "app/src/main/res/values/strings.xml"
        val options = PrintOptions(singleLineTextElements = true, indent = "    ")
        File(pathname).writeText(strings.toString(options))
        println("Wrote string app_name:Android Kotlin Task to strings.xml")
    }

}
