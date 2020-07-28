package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The TrackEvent interface, part of the HTML DOM specification, is used for events which represent changes to the set of available tracks on an HTML media element; these events are addtrack and removetrack. */
@js.native
trait TrackEvent extends Event {
  val track: VideoTrack | AudioTrack | TextTrack | Null = js.native
}

