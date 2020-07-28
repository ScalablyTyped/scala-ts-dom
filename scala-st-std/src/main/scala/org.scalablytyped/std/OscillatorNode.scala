package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.ended
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OscillatorNode extends AudioNode {
  var detune: AudioParam = js.native
  var frequency: AudioParam = js.native
  var `type`: java.lang.String = js.native
  @JSName("addEventListener")
  def addEventListener_ended(`type`: ended, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_ended(`type`: ended, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  def onended(ev: Event): js.Any = js.native
  def setPeriodicWave(periodicWave: PeriodicWave): Unit = js.native
  def start(): Unit = js.native
  def start(when: Double): Unit = js.native
  def stop(): Unit = js.native
  def stop(when: Double): Unit = js.native
}

