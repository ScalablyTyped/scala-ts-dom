package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.audioprocess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScriptProcessorNode extends AudioNode {
  var bufferSize: Double = js.native
  @JSName("addEventListener")
  def addEventListener_audioprocess(`type`: audioprocess, listener: js.Function1[/* ev */ AudioProcessingEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_audioprocess(
    `type`: audioprocess,
    listener: js.Function1[/* ev */ AudioProcessingEvent, _],
    useCapture: scala.Boolean
  ): Unit = js.native
  def onaudioprocess(ev: AudioProcessingEvent): js.Any = js.native
}

