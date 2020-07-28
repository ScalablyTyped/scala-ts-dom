package org.scalablytyped.std.global

import org.scalablytyped.std.Event
import org.scalablytyped.std.EventListenerOptions
import org.scalablytyped.std.Window
import org.scalablytyped.std.stdStrings.select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("removeEventListener")
@js.native
object removeEventListener_select extends js.Object {
  def apply(`type`: select, listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _]): Unit = js.native
  def apply(
    `type`: select,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: EventListenerOptions
  ): Unit = js.native
  def apply(
    `type`: select,
    listener: js.ThisFunction1[/* this */ Window, /* ev */ Event, _],
    options: scala.Boolean
  ): Unit = js.native
}

