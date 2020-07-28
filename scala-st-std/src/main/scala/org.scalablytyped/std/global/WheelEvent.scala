package org.scalablytyped.std.global

import org.scalablytyped.std.WheelEventInit
import org.scalablytyped.std.Window
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WheelEvent")
@js.native
class WheelEvent protected ()
  extends org.scalablytyped.std.WheelEvent {
  def this(typeArg: java.lang.String) = this()
  def this(typeArg: java.lang.String, eventInitDict: WheelEventInit) = this()
  /* CompleteClass */
  override var AT_TARGET: Double = js.native
  /* CompleteClass */
  override var BUBBLING_PHASE: Double = js.native
  /* CompleteClass */
  override var CAPTURING_PHASE: Double = js.native
  /* CompleteClass */
  override var DOM_DELTA_LINE: Double = js.native
  /* CompleteClass */
  override var DOM_DELTA_PAGE: Double = js.native
  /* CompleteClass */
  override var DOM_DELTA_PIXEL: Double = js.native
  /* CompleteClass */
  override var altKey: scala.Boolean = js.native
  /* CompleteClass */
  override var bubbles: scala.Boolean = js.native
  /* CompleteClass */
  override var button: Double = js.native
  /* CompleteClass */
  override var buttons: Double = js.native
  /* CompleteClass */
  override var cancelBubble: scala.Boolean = js.native
  /* CompleteClass */
  override var cancelable: scala.Boolean = js.native
  /* CompleteClass */
  override var clientX: Double = js.native
  /* CompleteClass */
  override var clientY: Double = js.native
  /* CompleteClass */
  override var ctrlKey: scala.Boolean = js.native
  /* CompleteClass */
  override var currentTarget: org.scalablytyped.std.EventTarget = js.native
  /* CompleteClass */
  override var defaultPrevented: scala.Boolean = js.native
  /* CompleteClass */
  override var deltaMode: Double = js.native
  /* CompleteClass */
  override var deltaX: Double = js.native
  /* CompleteClass */
  override var deltaY: Double = js.native
  /* CompleteClass */
  override var deltaZ: Double = js.native
  /* CompleteClass */
  override var detail: Double = js.native
  /* CompleteClass */
  override var eventPhase: Double = js.native
  /* CompleteClass */
  override var fromElement: org.scalablytyped.std.Element = js.native
  /* CompleteClass */
  override var isTrusted: scala.Boolean = js.native
  /* CompleteClass */
  override var layerX: Double = js.native
  /* CompleteClass */
  override var layerY: Double = js.native
  /* CompleteClass */
  override var metaKey: scala.Boolean = js.native
  /* CompleteClass */
  override var movementX: Double = js.native
  /* CompleteClass */
  override var movementY: Double = js.native
  /* CompleteClass */
  override var offsetX: Double = js.native
  /* CompleteClass */
  override var offsetY: Double = js.native
  /* CompleteClass */
  override var pageX: Double = js.native
  /* CompleteClass */
  override var pageY: Double = js.native
  /* CompleteClass */
  override var relatedTarget: org.scalablytyped.std.EventTarget = js.native
  /* CompleteClass */
  override var returnValue: scala.Boolean = js.native
  /* CompleteClass */
  override var screenX: Double = js.native
  /* CompleteClass */
  override var screenY: Double = js.native
  /* CompleteClass */
  override var shiftKey: scala.Boolean = js.native
  /* CompleteClass */
  override var srcElement: org.scalablytyped.std.Element = js.native
  /* CompleteClass */
  override var target: org.scalablytyped.std.EventTarget = js.native
  /* CompleteClass */
  override var timeStamp: Double = js.native
  /* CompleteClass */
  override var toElement: org.scalablytyped.std.Element = js.native
  /* CompleteClass */
  override var `type`: java.lang.String = js.native
  /* CompleteClass */
  override var view: Window = js.native
  /* CompleteClass */
  override var which: Double = js.native
  /* CompleteClass */
  override var x: Double = js.native
  /* CompleteClass */
  override var y: Double = js.native
  /* CompleteClass */
  override def getCurrentPoint(element: org.scalablytyped.std.Element): Unit = js.native
  /* CompleteClass */
  override def getModifierState(keyArg: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def initEvent(eventTypeArg: java.lang.String, canBubbleArg: scala.Boolean, cancelableArg: scala.Boolean): Unit = js.native
  /* CompleteClass */
  override def initMouseEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: scala.Boolean,
    altKeyArg: scala.Boolean,
    shiftKeyArg: scala.Boolean,
    metaKeyArg: scala.Boolean,
    buttonArg: Double,
    relatedTargetArg: org.scalablytyped.std.EventTarget
  ): Unit = js.native
  /* CompleteClass */
  override def initUIEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: Double
  ): Unit = js.native
  /* CompleteClass */
  override def initWheelEvent(
    typeArg: java.lang.String,
    canBubbleArg: scala.Boolean,
    cancelableArg: scala.Boolean,
    viewArg: Window,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    buttonArg: Double,
    relatedTargetArg: org.scalablytyped.std.EventTarget,
    modifiersListArg: java.lang.String,
    deltaXArg: Double,
    deltaYArg: Double,
    deltaZArg: Double,
    deltaMode: Double
  ): Unit = js.native
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  /* CompleteClass */
  override def stopImmediatePropagation(): Unit = js.native
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
}

@JSGlobal("WheelEvent")
@js.native
object WheelEvent
  extends Instantiable1[/* typeArg */ java.lang.String, org.scalablytyped.std.WheelEvent]
     with Instantiable2[
      /* typeArg */ java.lang.String, 
      /* eventInitDict */ WheelEventInit, 
      org.scalablytyped.std.WheelEvent
    ] {
  var DOM_DELTA_LINE: Double = js.native
  var DOM_DELTA_PAGE: Double = js.native
  var DOM_DELTA_PIXEL: Double = js.native
}

