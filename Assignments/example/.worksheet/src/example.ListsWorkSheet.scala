package example
import Lists._


	

object ListsWorkSheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(103); 
  println("Welcome to the Scala worksheet");$skip(24); val res$0 = 
  
  sum(List(1,2,3,4));System.out.println("""res0: Int = """ + $show(res$0));$skip(25); val res$1 = 
  
  max(List(1,5,3,11));System.out.println("""res1: Int = """ + $show(res$1))}
  
}
