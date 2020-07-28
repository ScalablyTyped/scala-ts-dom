package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptProcessorNodeEventMap extends js.Object {
  var audioprocess: AudioProcessingEvent
}

object ScriptProcessorNodeEventMap {
  @scala.inline
  def apply(audioprocess: AudioProcessingEvent): ScriptProcessorNodeEventMap = {
    val __obj = js.Dynamic.literal(audioprocess = audioprocess.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptProcessorNodeEventMap]
  }
  @scala.inline
  implicit class ScriptProcessorNodeEventMapOps[Self <: ScriptProcessorNodeEventMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAudioprocess(value: AudioProcessingEvent): Self = this.set("audioprocess", value.asInstanceOf[js.Any])
  }
  
}

