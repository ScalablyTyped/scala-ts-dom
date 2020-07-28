package org.scalablytyped

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object std {
  type AlgorithmIdentifier = java.lang.String | org.scalablytyped.std.Algorithm
  type ArrayBufferLike = org.scalablytyped.std.ArrayBuffer
  type AudioWorklet = org.scalablytyped.std.Worklet
  type AutoKeyword = org.scalablytyped.std.stdStrings.auto
  type BigInteger = org.scalablytyped.std.Uint8Array
  type BlobCallback = js.Function1[/* blob */ org.scalablytyped.std.Blob | scala.Null, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - `org.scalablytyped`.std.BufferSource
    - `org.scalablytyped`.std.Blob
    - java.lang.String
  */
  type BlobPart = org.scalablytyped.std._BlobPart | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - `org.scalablytyped`.std.Blob
    - `org.scalablytyped`.std.BufferSource
    - `org.scalablytyped`.std.FormData
    - `org.scalablytyped`.std.URLSearchParams
    - `org.scalablytyped`.std.ReadableStream[`org.scalablytyped`.std.Uint8Array]
    - java.lang.String
  */
  type BodyInit = org.scalablytyped.std._BodyInit | org.scalablytyped.std.ReadableStream[org.scalablytyped.std.Uint8Array] | java.lang.String
  type CDATASection = org.scalablytyped.std.Text
  type CSSSupportsRule = org.scalablytyped.std.CSSConditionRule
  type ChannelMergerNode = org.scalablytyped.std.AudioNode
  type ChannelSplitterNode = org.scalablytyped.std.AudioNode
  type ClassDecorator = js.Function1[/* target */ js.Function, js.Function | scala.Unit]
  type Comment = org.scalablytyped.std.CharacterData
  type ConstrainBoolean = scala.Boolean | org.scalablytyped.std.ConstrainBooleanParameters
  type ConstrainDOMString = java.lang.String | js.Array[java.lang.String] | org.scalablytyped.std.ConstrainDOMStringParameters
  type ConstrainDouble = scala.Double | org.scalablytyped.std.ConstrainDoubleRange
  type ConstrainLong = scala.Double | org.scalablytyped.std.ConstrainLongRange
  /**
    * Obtain the parameters of a constructor function type in a tuple
    */
  type ConstructorParameters[T /* <: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any] */] = js.Any
  type DOMHighResTimeStamp = scala.Double
  type DOMStringMap = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String]]
  type DOMTimeStamp = scala.Double
  type DecodeErrorCallback = js.Function1[/* error */ org.scalablytyped.std.DOMException, scala.Unit]
  type DecodeSuccessCallback = js.Function1[/* decodedData */ org.scalablytyped.std.AudioBuffer, scala.Unit]
  type DocumentTimeline = org.scalablytyped.std.AnimationTimeline
  type ErrorEventHandler = js.Function5[
    /* event */ org.scalablytyped.std.Event | java.lang.String, 
    /* source */ js.UndefOr[java.lang.String], 
    /* fileno */ js.UndefOr[scala.Double], 
    /* columnNumber */ js.UndefOr[scala.Double], 
    /* error */ js.UndefOr[org.scalablytyped.std.Error], 
    scala.Unit
  ]
  type EvalError = org.scalablytyped.std.Error
  type EventHandlerNonNull = js.Function1[/* event */ org.scalablytyped.std.Event, js.Any]
  type EventListener = js.Function1[/* evt */ org.scalablytyped.std.Event, scala.Unit]
  type EventListenerOrEventListenerObject = org.scalablytyped.std.EventListener | org.scalablytyped.std.EventListenerObject
  /**
    * Exclude from T those types that are assignable to U
    */
  type Exclude[T, U] = T
  /**
    * Extract from T those types that are assignable to U
    */
  type Extract[T, U] = T
  type Float32List = org.scalablytyped.std.Float32Array | js.Array[org.scalablytyped.std.GLfloat]
  type ForEachCallback = js.Function2[
    /* keyId */ org.scalablytyped.std.Int8Array | org.scalablytyped.std.Int16Array | org.scalablytyped.std.Int32Array | org.scalablytyped.std.Uint8Array | org.scalablytyped.std.Uint16Array | org.scalablytyped.std.Uint32Array | org.scalablytyped.std.Uint8ClampedArray | org.scalablytyped.std.Float32Array | org.scalablytyped.std.Float64Array | org.scalablytyped.std.DataView | org.scalablytyped.std.ArrayBuffer | scala.Null, 
    /* status */ org.scalablytyped.std.MediaKeyStatus, 
    scala.Unit
  ]
  type FormDataEntryValue = org.scalablytyped.std.File | java.lang.String
  type FrameRequestCallback = js.Function1[/* time */ scala.Double, scala.Unit]
  type FunctionStringCallback = js.Function1[/* data */ java.lang.String, scala.Unit]
  type GLbitfield = scala.Double
  type GLboolean = scala.Boolean
  type GLclampf = scala.Double
  type GLenum = scala.Double
  type GLfloat = scala.Double
  type GLint = scala.Double
  type GLintptr = scala.Double
  type GLsizei = scala.Double
  type GLsizeiptr = scala.Double
  type GLuint = scala.Double
  type GamepadHapticActuatorType = org.scalablytyped.std.stdStrings.vibration
  type Generator = org.scalablytyped.std.Iterator[js.Any]
  type HashAlgorithmIdentifier = org.scalablytyped.std.AlgorithmIdentifier
  type HeadersInit = org.scalablytyped.std.Headers | js.Array[js.Array[java.lang.String]] | (org.scalablytyped.std.Record[java.lang.String, java.lang.String])
  type IDBKeyPath = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - java.lang.String
    - `org.scalablytyped`.std.Date
    - `org.scalablytyped`.std.BufferSource
    - `org.scalablytyped`.std.IDBArrayKey
  */
  type IDBValidKey = org.scalablytyped.std._IDBValidKey | scala.Double | java.lang.String
  /**
    * Obtain the return type of a constructor function type
    */
  type InstanceType[T /* <: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ js.Any, js.Any] */] = js.Any
  type Int32List = org.scalablytyped.std.Int32Array | js.Array[org.scalablytyped.std.GLint]
  type IntersectionObserverCallback = js.Function2[
    /* entries */ js.Array[org.scalablytyped.std.IntersectionObserverEntry], 
    /* observer */ org.scalablytyped.std.IntersectionObserver, 
    scala.Unit
  ]
  type LineAndPositionSetting = scala.Double | org.scalablytyped.std.AutoKeyword
  type MSCredentialType = org.scalablytyped.std.stdStrings.FIDO_2_0
  type MSLaunchUriCallback = js.Function0[scala.Unit]
  type MediaStreamTrackAudioSourceNode = org.scalablytyped.std.AudioNode
  /* Rewritten from type alias, can be one of: 
    - `org.scalablytyped`.std.WindowProxy
    - `org.scalablytyped`.std.MessagePort
    - `org.scalablytyped`.std.ServiceWorker
  */
  type MessageEventSource = org.scalablytyped.std._MessageEventSource | org.scalablytyped.std.WindowProxy
  type MethodDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* descriptor */ org.scalablytyped.std.TypedPropertyDescriptor[js.Any], 
    org.scalablytyped.std.TypedPropertyDescriptor[js.Any] | scala.Unit
  ]
  /** @deprecated */
  type MouseWheelEvent = org.scalablytyped.std.WheelEvent
  type MutationCallback = js.Function2[
    /* mutations */ js.Array[org.scalablytyped.std.MutationRecord], 
    /* observer */ org.scalablytyped.std.MutationObserver, 
    scala.Unit
  ]
  type NamedCurve = java.lang.String
  type NavigatorUserMediaErrorCallback = js.Function1[/* error */ org.scalablytyped.std.MediaStreamError, scala.Unit]
  type NavigatorUserMediaSuccessCallback = js.Function1[/* stream */ org.scalablytyped.std.MediaStream, scala.Unit]
  /**
    * Exclude null and undefined from T
    */
  type NonNullable[T] = T
  type NotificationPermissionCallback = js.Function1[/* permission */ org.scalablytyped.std.NotificationPermission, scala.Unit]
  /**
    * Removes the 'this' parameter from a function type.
    */
  type OmitThisParameter[T] = T | (js.Function1[/* args */ js.Any, js.Any])
  type OnBeforeUnloadEventHandler = org.scalablytyped.std.OnBeforeUnloadEventHandlerNonNull | scala.Null
  type OnBeforeUnloadEventHandlerNonNull = js.Function1[/* event */ org.scalablytyped.std.Event, java.lang.String | scala.Null]
  type OnErrorEventHandler = org.scalablytyped.std.OnErrorEventHandlerNonNull | scala.Null
  type OnErrorEventHandlerNonNull = js.Function5[
    /* event */ org.scalablytyped.std.Event | java.lang.String, 
    /* source */ js.UndefOr[java.lang.String], 
    /* lineno */ js.UndefOr[scala.Double], 
    /* colno */ js.UndefOr[scala.Double], 
    /* error */ js.UndefOr[js.Any], 
    js.Any
  ]
  type ParameterDecorator = js.Function3[
    /* target */ js.Object, 
    /* propertyKey */ java.lang.String | js.Symbol, 
    /* parameterIndex */ scala.Double, 
    scala.Unit
  ]
  /**
    * Obtain the parameters of a function type in a tuple
    */
  type Parameters[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  /**
    * Make all properties in T optional
    */
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ org.scalablytyped.std.stdStrings.Partial with org.scalablytyped.runtime.TopLevel[T]
  type PaymentRequestUpdateEventInit = org.scalablytyped.std.EventInit
  type PerformanceEntryList = js.Array[org.scalablytyped.std.PerformanceEntry]
  type PerformanceMark = org.scalablytyped.std.PerformanceEntry
  type PerformanceMeasure = org.scalablytyped.std.PerformanceEntry
  type PerformanceObserverCallback = js.Function2[
    /* entries */ org.scalablytyped.std.PerformanceObserverEntryList, 
    /* observer */ org.scalablytyped.std.PerformanceObserver, 
    scala.Unit
  ]
  /**
    * From T, pick a set of properties whose keys are in the union K
    */
  type Pick[T, K /* <: /* keyof T */ java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T[P]}
    */ org.scalablytyped.std.stdStrings.Pick with org.scalablytyped.runtime.TopLevel[T]
  type PositionCallback = js.Function1[/* position */ org.scalablytyped.std.Position, scala.Unit]
  type PositionErrorCallback = js.Function1[/* positionError */ org.scalablytyped.std.PositionError, scala.Unit]
  type PromiseConstructorLike = org.scalablytyped.runtime.Instantiable1[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[/* value */ js.UndefOr[js.Object | js.Thenable[js.Object]], scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ], 
    js.Thenable[js.Object]
  ]
  type PropertyDecorator = js.Function2[/* target */ js.Object, /* propertyKey */ java.lang.String | js.Symbol, scala.Unit]
  type PropertyDescriptorMap = org.scalablytyped.runtime.StringDictionary[org.scalablytyped.std.PropertyDescriptor]
  type PropertyKey = java.lang.String | scala.Double | js.Symbol
  type QueuingStrategySizeCallback[T] = js.Function1[/* chunk */ T, scala.Double]
  type RTCAnswerOptions = org.scalablytyped.std.RTCOfferAnswerOptions
  type RTCPeerConnectionErrorCallback = js.Function1[/* error */ org.scalablytyped.std.DOMException, scala.Unit]
  type RTCRtpDecodingParameters = org.scalablytyped.std.RTCRtpCodingParameters
  type RTCSessionDescriptionCallback = js.Function1[/* description */ org.scalablytyped.std.RTCSessionDescriptionInit, scala.Unit]
  type RTCStatsCallback = js.Function1[/* report */ org.scalablytyped.std.RTCStatsReport, scala.Unit]
  type RangeError = org.scalablytyped.std.Error
  type ReadableByteStreamControllerCallback = js.Function1[
    /* controller */ org.scalablytyped.std.ReadableByteStreamController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type ReadableStreamDefaultControllerCallback[R] = js.Function1[
    /* controller */ org.scalablytyped.std.ReadableStreamDefaultController[R], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type ReadableStreamErrorCallback = js.Function1[/* reason */ js.Any, scala.Unit | js.Thenable[scala.Unit]]
  /**
    * Make all properties in T readonly
    */
  type Readonly[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ P in keyof T ]: T[P]}
    */ org.scalablytyped.std.stdStrings.Readonly with org.scalablytyped.runtime.TopLevel[T]
  /**
    * Construct a type with a set of properties K of type T
    */
  type Record[K /* <: /* keyof any */ java.lang.String */, T] = org.scalablytyped.runtime.StringDictionary[T]
  type ReferenceError = org.scalablytyped.std.Error
  /* Rewritten from type alias, can be one of: 
    - `org.scalablytyped`.std.CanvasRenderingContext2D
    - `org.scalablytyped`.std.ImageBitmapRenderingContext
    - `org.scalablytyped`.std.WebGLRenderingContext
  */
  type RenderingContext = org.scalablytyped.std._RenderingContext | org.scalablytyped.std.WebGLRenderingContext
  type RequestInfo = org.scalablytyped.std.Request | java.lang.String
  /**
    * Make all properties in T required
    */
  type Required[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: -? T[P]}
    */ org.scalablytyped.std.stdStrings.Required with org.scalablytyped.runtime.TopLevel[T]
  /**
    * Obtain the return type of a function type
    */
  type ReturnType[T /* <: js.Function1[/* repeated */ js.Any, _] */] = js.Any
  type SVGMatrix = org.scalablytyped.std.DOMMatrix
  type SVGPathSegClosePath = org.scalablytyped.std.SVGPathSeg
  type SVGPoint = org.scalablytyped.std.DOMPoint
  type SVGRect = org.scalablytyped.std.DOMRect
  type ScopedCredentialType = org.scalablytyped.std.stdStrings.ScopedCred
  type StaticRange = org.scalablytyped.std.AbstractRange
  type SyntaxError = org.scalablytyped.std.Error
  /**
    * Extracts the type of the 'this' parameter of a function type, or 'unknown' if the function type has no 'this' parameter.
    */
  type ThisParameterType[T] = js.Any
  type TimerHandler = java.lang.String | js.Function
  type TransformStreamDefaultControllerCallback[O] = js.Function1[
    /* controller */ org.scalablytyped.std.TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type TransformStreamDefaultControllerTransformCallback[I, O] = js.Function2[
    /* chunk */ I, 
    /* controller */ org.scalablytyped.std.TransformStreamDefaultController[O], 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type TypeError = org.scalablytyped.std.Error
  type URIError = org.scalablytyped.std.Error
  type VibratePattern = scala.Double | js.Array[scala.Double]
  type VoidFunction = js.Function0[scala.Unit]
  type WebGLBuffer = org.scalablytyped.std.WebGLObject
  type WebGLFramebuffer = org.scalablytyped.std.WebGLObject
  type WebGLProgram = org.scalablytyped.std.WebGLObject
  type WebGLRenderbuffer = org.scalablytyped.std.WebGLObject
  type WebGLRenderingContext = org.scalablytyped.std.WebGLRenderingContextBase
  type WebGLShader = org.scalablytyped.std.WebGLObject
  type WebGLTexture = org.scalablytyped.std.WebGLObject
  type WebGLVertexArrayObjectOES = org.scalablytyped.std.WebGLObject
  type WebKitCSSMatrix = org.scalablytyped.std.DOMMatrix
  type WindowProxy = org.scalablytyped.std.Window
  type WritableStreamDefaultControllerCloseCallback = js.Function0[scala.Unit | js.Thenable[scala.Unit]]
  type WritableStreamDefaultControllerStartCallback = js.Function1[
    /* controller */ org.scalablytyped.std.WritableStreamDefaultController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type WritableStreamDefaultControllerWriteCallback[W] = js.Function2[
    /* chunk */ W, 
    /* controller */ org.scalablytyped.std.WritableStreamDefaultController, 
    scala.Unit | js.Thenable[scala.Unit]
  ]
  type WritableStreamErrorCallback = js.Function1[/* reason */ js.Any, scala.Unit | js.Thenable[scala.Unit]]
  type webkitURL = org.scalablytyped.std.URL
}
