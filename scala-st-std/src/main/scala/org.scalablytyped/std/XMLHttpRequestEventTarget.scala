package org.scalablytyped.std

import org.scalablytyped.std.stdStrings.abort
import org.scalablytyped.std.stdStrings.error
import org.scalablytyped.std.stdStrings.load
import org.scalablytyped.std.stdStrings.loadend
import org.scalablytyped.std.stdStrings.loadstart
import org.scalablytyped.std.stdStrings.progress
import org.scalablytyped.std.stdStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XMLHttpRequestEventTarget extends js.Object {
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject): Unit = js.native
  def addEventListener(`type`: java.lang.String, listener: EventListenerOrEventListenerObject, useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_abort(`type`: abort, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_error(`type`: error, listener: js.Function1[/* ev */ ErrorEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_load(`type`: load, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(`type`: loadend, listener: js.Function1[/* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadend(`type`: loadend, listener: js.Function1[/* ev */ ProgressEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(`type`: loadstart, listener: js.Function1[/* ev */ Event, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_loadstart(`type`: loadstart, listener: js.Function1[/* ev */ Event, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(`type`: progress, listener: js.Function1[/* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_progress(`type`: progress, listener: js.Function1[/* ev */ ProgressEvent, _], useCapture: scala.Boolean): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeout(`type`: timeout, listener: js.Function1[/* ev */ ProgressEvent, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_timeout(`type`: timeout, listener: js.Function1[/* ev */ ProgressEvent, _], useCapture: scala.Boolean): Unit = js.native
  def onabort(ev: Event): js.Any = js.native
  def onerror(ev: Event): js.Any = js.native
  def onload(ev: Event): js.Any = js.native
  def onloadend(ev: ProgressEvent): js.Any = js.native
  def onloadstart(ev: Event): js.Any = js.native
  def onprogress(ev: ProgressEvent): js.Any = js.native
  def ontimeout(ev: ProgressEvent): js.Any = js.native
}

