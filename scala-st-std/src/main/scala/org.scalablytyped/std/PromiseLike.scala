package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PromiseLike[T] extends js.Object {
  /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
  def `then`[TResult](): js.Thenable[TResult] = js.native
  def `then`[TResult](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult] | Unit]
  ): js.Thenable[TResult] = js.native
  def `then`[TResult](onfulfilled: js.Function1[/* value */ T, TResult | js.Thenable[TResult]]): js.Thenable[TResult] = js.native
  def `then`[TResult](
    onfulfilled: js.Function1[/* value */ T, TResult | js.Thenable[TResult]],
    onrejected: js.Function1[/* reason */ js.Any, TResult | js.Thenable[TResult] | Unit]
  ): js.Thenable[TResult] = js.native
}

