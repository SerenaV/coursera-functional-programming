package assignment2

object Main {

  type Set = Int => Boolean
  
  def contains(s: Set, elem: Int): Boolean = s(elem)
  
// 2.1 Basic Functions on Sets  
  // part 1
  def singletonSet(elem: Int): Set = set => set == elem
  
  // part 2
  def union(s: Set, t: Set): Set = x => s(x) || t(x)
  
  def intersect(s: Set, t: Set): Set = x => s(x) && t(x)
  
  def diff(s: Set, t: Set): Set = x => s(x) && !t(x)
  
  // part 3
  def filter(s: Set, p: Int => Boolean): Set = (x:Int) =>p(x) && s(x)
  
// 2.2 Queries and Transformations on Sets  
  // part 1
  val bound = 1000
  def forall(s: Set, p: Int => Boolean): Boolean = {
    def iterate(x: Int): Boolean = {
      if (s(x) && !p(x)) false
      else if (x > bound) true
      else iterate(x+1)
    }
    iterate(-bound)
  } // end forall
  
  // part 2
  def exists(s: Set, p: Int => Boolean): Boolean = {
    def iterate(x: Int): Boolean = {
      if(s(x) && p(x)) true
      else if(x > bound) false
      else iterate(x+1)
    }
    iterate(-bound)
  } // end exists
  
  // part 3
  def map(s: Set, f: Int => Int): Set = {
    def iterate(x: Int): Set = {
      if(x > bound) ((y:Int) => false)
      else if(s(x)) union(singletonSet(f(x)), iterate(x+1))
      else iterate(x+1)
    }
    iterate(-bound)
  } // end map

  
} // end Main