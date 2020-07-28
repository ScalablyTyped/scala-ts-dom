package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the completion of an asynchronous operation
  */
@js.native
trait Promise[T] extends js.Object {
  @JSName(js.Symbol.toStringTag)
  var toStringTag: org.scalablytyped.std.stdStrings.Promise = js.native
  /**
    * Attaches a callback for only the rejection of the Promise.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of the callback.
    */
  def `catch`(): js.Promise[T] = js.native
  def `catch`(onrejected: js.Function1[/* reason */ js.Any, T | js.Thenable[T] | Unit]): js.Promise[T] = js.native
  /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
  def `then`[TResult](): js.Promise[TResult] = js.native
  def `then`[TResult](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult] | Unit]
  ): js.Promise[TResult] = js.native
  def `then`[TResult](onfulfilled: js.Function1[/* value */ T, TResult | js.Thenable[TResult]]): js.Promise[TResult] = js.native
  def `then`[TResult](
    onfulfilled: js.Function1[/* value */ T, TResult | js.Thenable[TResult]],
    onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult] | Unit]
  ): js.Promise[TResult] = js.native
}

