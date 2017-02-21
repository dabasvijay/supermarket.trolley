package example

import org.scalatest.FlatSpec
import org.scalatest._

class CheckoutServiceSpec extends FlatSpec with Matchers {
  
  "CheckoutService" should "return zero empty List" in {
    
    CheckoutService getTotalShoppingBill List()  shouldEqual  0  
    
  }
  
  
  
}