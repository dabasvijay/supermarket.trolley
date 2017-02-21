package com.campgemini.supermarket

object CheckoutService {

  val fullApplePrice = 60
  val fullOrangePrice = 25

  def getTotalShoppingBill(items: List[String]): Int = {
    items match {
      case Nil  => 0
      case null => 0
      case x :: xs => x match {
        case Fruit.Apple()  => fullApplePrice + getTotalShoppingBill(xs)
        case Fruit.Orange() => fullOrangePrice + getTotalShoppingBill(xs)
      }
    }
  }

}

