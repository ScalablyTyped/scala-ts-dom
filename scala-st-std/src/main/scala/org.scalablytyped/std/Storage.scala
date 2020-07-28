package org.scalablytyped.std

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Storage
  extends /* index */ NumberDictionary[java.lang.String]
     with /* key */ StringDictionary[js.Any] {
  var length: Double
  def clear(): Unit
  def getItem(key: java.lang.String): js.Any
  def key(index: Double): java.lang.String
  def removeItem(key: java.lang.String): Unit
  def setItem(key: java.lang.String, data: java.lang.String): Unit
}

object Storage {
  @scala.inline
  def apply(
    clear: () => Unit,
    getItem: java.lang.String => js.Any,
    key: Double => java.lang.String,
    length: Double,
    removeItem: java.lang.String => Unit,
    setItem: (java.lang.String, java.lang.String) => Unit
  ): Storage = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getItem = js.Any.fromFunction1(getItem), key = js.Any.fromFunction1(key), length = length.asInstanceOf[js.Any], removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
    __obj.asInstanceOf[Storage]
  }
  @scala.inline
  implicit class StorageOps[Self <: Storage] (val x: Self) extends AnyVal {
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
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    @scala.inline
    def setGetItem(value: java.lang.String => js.Any): Self = this.set("getItem", js.Any.fromFunction1(value))
    @scala.inline
    def setKey(value: Double => java.lang.String): Self = this.set("key", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveItem(value: java.lang.String => Unit): Self = this.set("removeItem", js.Any.fromFunction1(value))
    @scala.inline
    def setSetItem(value: (java.lang.String, java.lang.String) => Unit): Self = this.set("setItem", js.Any.fromFunction2(value))
  }
  
}

