package com.campgemini.supermarket

object CheckoutService {

  val fullApplePrice = 60 
  val fullOrangePrice = 25
  def getTotalShoppingBill(items: List[String]): Int = {
    def getAbsoluteTotal(list: List[String]): Int = {
      list match {
        case Nil  => 0
        case null => 0
        case y :: ys => y match {
          case Fruit.Apple()  => fullApplePrice + getAbsoluteTotal(ys)
          case Fruit.Orange() => fullOrangePrice + getAbsoluteTotal(ys)
        }
      }
    }
    def applyOffers(): Int = {

      getAbsoluteTotal(items) - OfferService.applyOffers(items)

    }
    applyOffers();
  }

  
}

object OfferService {
  import CheckoutService._

  def applyOffers(basketItems: List[String]): Int = {
    val items = Option.apply(basketItems).getOrElse(List())
    val groupedMap = items.groupBy(x => x);
    
    def appleOffers() = {
      (groupedMap.get("Apple").getOrElse(Nil).size / 2) * fullApplePrice
    }
    def orangeOffers() = {
      (groupedMap.get("Orange").getOrElse(Nil).size / 3) * fullOrangePrice
    }
    
    appleOffers() + orangeOffers()
  }

}

