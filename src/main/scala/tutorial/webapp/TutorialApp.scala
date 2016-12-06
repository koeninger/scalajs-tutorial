package tutorial.webapp

import scala.scalajs.js.JSApp

object TutorialApp extends JSApp {
  def main(): Unit = {
    println("Hello world!")
  }

  val bad = "outer"

  def doesScopeSuck() {
    println("bad is " + bad)
    if (false) {
      val bad = "inner"
    }
  }
  doesScopeSuck()
}
