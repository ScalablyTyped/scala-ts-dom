package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaStreamTrackEventInit extends EventInit {
  var track: js.UndefOr[MediaStreamTrack | Null] = js.undefined
}

object MediaStreamTrackEventInit {
  @scala.inline
  def apply(): MediaStreamTrackEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MediaStreamTrackEventInit]
  }
  @scala.inline
  implicit class MediaStreamTrackEventInitOps[Self <: MediaStreamTrackEventInit] (val x: Self) extends AnyVal {
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
    def setTrack(value: MediaStreamTrack): Self = this.set("track", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
    @scala.inline
    def setTrackNull: Self = this.set("track", null)
  }
  
}

