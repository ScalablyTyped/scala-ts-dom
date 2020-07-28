package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeFilter extends js.Object {
  def acceptNode(n: Node): Double
}

object NodeFilter {
  @scala.inline
  def apply(acceptNode: Node => Double): NodeFilter = {
    val __obj = js.Dynamic.literal(acceptNode = js.Any.fromFunction1(acceptNode))
    __obj.asInstanceOf[NodeFilter]
  }
  @scala.inline
  implicit class NodeFilterOps[Self <: NodeFilter] (val x: Self) extends AnyVal {
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
    def setAcceptNode(value: Node => Double): Self = this.set("acceptNode", js.Any.fromFunction1(value))
  }
  
}

