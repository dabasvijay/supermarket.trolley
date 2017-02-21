package com.campgemini.supermarket

import org.scalatest.FlatSpec
import org.scalatest._

class CheckoutServiceSpec extends FlatSpec with Matchers {

  "CheckoutService" should "return zero empty List" in {

    CheckoutService getTotalShoppingBill List() shouldEqual 0

  }

  "CheckoutService" should "return Zero for null List" in {

    CheckoutService getTotalShoppingBill null shouldEqual 0

  }

  "CheckoutService" should "return 60 for List with 1 Apple only" in {

    CheckoutService getTotalShoppingBill List("Apple") shouldEqual 60

  }

  "CheckoutService" should "return 25 for List with 1 Orange only" in {

    CheckoutService getTotalShoppingBill List("Orange") shouldEqual 25

  }

  "CheckoutService" should "return 85 for List with One Orange  and One Apple" in {

    CheckoutService getTotalShoppingBill List("Orange", "Apple") shouldEqual 85

  }

  "CheckoutService" should "return 110 for List with 2 Orange  and 1 Apple" in {

    CheckoutService getTotalShoppingBill List("Orange", "Orange", "Apple") shouldEqual 110

  }

  "CheckoutService" should "return 50 for List with 3 Oranges" in {

    CheckoutService getTotalShoppingBill List("Orange", "Orange", "Orange") shouldEqual 50

  }

}