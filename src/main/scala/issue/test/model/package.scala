package issue.test

import zio.prelude.{Newtype, Subtype}

package object model {
  object CustomerId extends Newtype[Int]
  type CustomerId = CustomerId.Type

  object CustomerName extends Subtype[String]
  type CustomerName = CustomerName.Type

  case class Customer(id: CustomerId, name: CustomerName)

  // when this type is opaque, compilation fails
  opaque type Whatever = Unit
}
