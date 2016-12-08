package tutorial.webapp

import scala.scalajs.js.{ JSApp, ThisFunction0 }
import org.scalajs.dom
import org.scalajs.jquery.jQuery

object TutorialApp extends JSApp {
  def main(): Unit = {
    jQuery("#click-me-scala").click(munge _)
  }

  def munge(): Unit = {
    jQuery("ol > li").each({ (li: dom.Element) =>
      println("Scala 'this' is " + this)
      jQuery(li).text(jQuery(li).text + " - Scala")
    }: ThisFunction0[dom.Element, _])
  }
}
