package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.complete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OfflineAudioContext extends AudioContext {
  @JSName("addEventListener")
  def addEventListener_complete(`type`: complete, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_complete(`type`: complete, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  def oncomplete(ev: Event): js.Any = js.native
  def startRendering(): Unit = js.native
}

