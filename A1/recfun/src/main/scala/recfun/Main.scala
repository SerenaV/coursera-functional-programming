package recfun

import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1: Pasca's Triangle
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  } // end pascal
  
  /**
   * Exercise 2: Parentheses Balancing
   * A function that recursively verifies the balancing of
   * parentheses in a string (list of chars)
   */
  def balance(chars: List[Char]): Boolean = {
    def balanced(chars: List[Char], open: Int): Boolean = 
      if (chars.isEmpty) open == 0
      else if (chars.head == '(') balanced(chars.tail,open+1)
      else if (chars.head == ')') open>0 && balanced(chars.tail,open-1)
      else balanced(chars.tail,open)
    balanced(chars,0)
  } // end balance
  
  /**
   * Exercise 3: Counting Change
   * A function that recursively counts how many different ways you can make
   * change for a given amount, given a list of coin denominations. 
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def count(capacity: Int, changes: List[Int]): Int = {
    		if(capacity == 0)	1
            else if(capacity < 0)	0
            else if(changes.isEmpty && capacity >= 1 )	0
            else	count(capacity, changes.tail) + count(capacity - changes.head, changes)
    }
    count(money, coins.sortWith(_.compareTo(_) < 0))
  } // end countChange
  
} // end Main
