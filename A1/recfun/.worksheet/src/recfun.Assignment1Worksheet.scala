package recfun
import Main._

object Assignment1Worksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(103); 
  println("Welcome to the Scala worksheet");$skip(17); val res$0 = 
  
  pascal(4,4);System.out.println("""res0: Int = """ + $show(res$0));$skip(44); val res$1 = 
  
  balance("(if(zero?x)max(/1x))".toList);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(85); val res$2 = 
  balance("I told him (that it's not (yet) done). (But he wasn't listening)".toList);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(24); val res$3 = 
  balance(":-)".toList);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(25); val res$4 = 
  balance("())(".toList);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(33); val res$5 = 
  
  countChange(100, List(1,5));System.out.println("""res5: Int = """ + $show(res$5))}
  
 
  
  
}
