package org.scalablytyped.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MutationObserverInit extends js.Object {
  var attributeFilter: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var attributeOldValue: js.UndefOr[scala.Boolean] = js.undefined
  var attributes: js.UndefOr[scala.Boolean] = js.undefined
  var characterData: js.UndefOr[scala.Boolean] = js.undefined
  var characterDataOldValue: js.UndefOr[scala.Boolean] = js.undefined
  var childList: js.UndefOr[scala.Boolean] = js.undefined
  var subtree: js.UndefOr[scala.Boolean] = js.undefined
}

object MutationObserverInit {
  @scala.inline
  def apply(): MutationObserverInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MutationObserverInit]
  }
  @scala.inline
  implicit class MutationObserverInitOps[Self <: MutationObserverInit] (val x: Self) extends AnyVal {
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
    def setAttributeFilterVarargs(value: java.lang.String*): Self = this.set("attributeFilter", js.Array(value :_*))
    @scala.inline
    def setAttributeFilter(value: js.Array[java.lang.String]): Self = this.set("attributeFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeFilter: Self = this.set("attributeFilter", js.undefined)
    @scala.inline
    def setAttributeOldValue(value: scala.Boolean): Self = this.set("attributeOldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributeOldValue: Self = this.set("attributeOldValue", js.undefined)
    @scala.inline
    def setAttributes(value: scala.Boolean): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setCharacterData(value: scala.Boolean): Self = this.set("characterData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharacterData: Self = this.set("characterData", js.undefined)
    @scala.inline
    def setCharacterDataOldValue(value: scala.Boolean): Self = this.set("characterDataOldValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCharacterDataOldValue: Self = this.set("characterDataOldValue", js.undefined)
    @scala.inline
    def setChildList(value: scala.Boolean): Self = this.set("childList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildList: Self = this.set("childList", js.undefined)
    @scala.inline
    def setSubtree(value: scala.Boolean): Self = this.set("subtree", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtree: Self = this.set("subtree", js.undefined)
  }
  
}

