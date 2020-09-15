package main.scala
import java.io.File
import java.util.Scanner
import java.io.PrintWriter
object Count_words {
 val filePath="src/main/resources/file_content.txt"
  val file=new File(filePath)
  val scanner=new Scanner(file)
  
  while(scanner.hasNextLine){
    val line=scanner.nextLine()
    val cap = line.capitalize
    println(line.split(" ").map(_.toLowerCase).groupBy(identity).mapValues(_.size))
    
  }
  def main(args:Array[String]):Unit={
  
  }
}