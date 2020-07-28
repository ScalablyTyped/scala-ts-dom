package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WeakSet[T] extends js.Object {
  @JSName(js.Symbol.toStringTag)
  var toStringTag: org.scalablytyped.std.stdStrings.WeakSet = js.native
  def add(value: T): WeakSet[T] = js.native
  def delete(value: T): scala.Boolean = js.native
  def has(value: T): scala.Boolean = js.native
}

