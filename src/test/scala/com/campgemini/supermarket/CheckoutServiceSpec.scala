package com.campgemini.supermarket

import org.scalatest.FlatSpec
import org.scalatest._

class CheckoutServiceSpec extends FlatSpec with Matchers {
  
  "CheckoutService" should "return zero empty List" in {
    
    CheckoutService getTotalShoppingBill List()  shouldEqual  0  
    
  }
  
  
   "CheckoutService" should "return Zero for null List" in {
    
    CheckoutService getTotalShoppingBill  null  shouldEqual  0  
    
  }
  
   "CheckoutService" should "return 60 for List with 1 Apple only" in {
    
    CheckoutService getTotalShoppingBill  List("Apple")  shouldEqual  60
    
  }
   
   "CheckoutService" should "return 25 for List with 1 Orange only" in {
    
    CheckoutService getTotalShoppingBill  List("Orange")  shouldEqual  25
    
  }
   

  

     
  

}