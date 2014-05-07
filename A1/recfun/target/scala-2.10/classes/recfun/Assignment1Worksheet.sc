package recfun
import Main._

object Assignment1Worksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  pascal(4,4)                                     //> res0: Int = 1
  
  balance("(if(zero?x)max(/1x))".toList)          //> res1: Boolean = true
  balance("I told him (that it's not (yet) done). (But he wasn't listening)".toList)
                                                  //> res2: Boolean = true
  balance(":-)".toList)                           //> res3: Boolean = false
  balance("())(".toList)                          //> res4: Boolean = false
  
  countChange(100, List(1,5))                     //> res5: Int = 21
  
 
  
  
}