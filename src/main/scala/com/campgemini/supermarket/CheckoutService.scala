package com.campgemini.supermarket


object CheckoutService {


  def getTotalShoppingBill(items: List[String]): Int = {
    items  match {
      case Nil => 0
      case null => 0
      case x::xs =>  x  match {
        case Fruit.Apple() => 60
        case Fruit.Orange() => 25
      }
    }
  }
  
}

