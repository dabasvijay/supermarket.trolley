package com.campgemini.supermarket


object Fruit extends Enumeration {
  
  type Fruit = Value
  
  val Apple = MyValue("Apple")
  val Orange = MyValue("Orange")
  
  def MyValue(name: String): Value  with Matching = new Val(nextId, name) with Matching
  
  
  
  trait Matching {
      def unapply(s: String): Boolean = {
            (s ==  toString())
      }
   }
  
}