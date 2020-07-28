package org.scalablytyped.std.global

import org.scalablytyped.std.EvalErrorConstructor
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("EvalError")
@js.native
class EvalError ()
  extends org.scalablytyped.std.Error {
  def this(message: java.lang.String) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

@JSGlobal("EvalError")
@js.native
object EvalError extends TopLevel[EvalErrorConstructor]

