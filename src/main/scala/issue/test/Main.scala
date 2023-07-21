package issue.test

import issue.test.model.{Customer, CustomerId, CustomerName}

object Main extends App {

  private val customer = Customer(CustomerId(12), CustomerName("John"))

  println(s"Customer: $customer")
}
