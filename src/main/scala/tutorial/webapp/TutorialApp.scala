package tutorial.webapp

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport
import scala.scalajs.js.Dynamic.global

import org.scalajs.dom
import dom.document

object TutorialApp extends JSApp {
  def main(): Unit = {
    appendPar(document.body, "Hello World")
    global.document.someJsFun()
    appendPar(document.body, global.someJsGloba.asInstanceOf[String])
    global.someScalaGlobal = "some global from Scala"
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }

  @JSExport
  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!")
  }
}
