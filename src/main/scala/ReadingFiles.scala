package main.scala
import java.io.File
import java.util.Scanner
//import java.io.PrintWriter
object ReadingFiles {
  val filePath="src/main/resources/file_content.txt"
  val file=new File(filePath)
  //val pw =new PrintWriter("file.txt")
  val scanner=new Scanner(file)
  
  while(scanner.hasNextLine){
    val line=scanner.nextLine()
    val cap = line.capitalize
    println(cap)
    
  }
  
  
  def main(args:Array[String]):Unit={
    
  }
}