package tutorial.webapp

import scala.scalajs.js.JSApp

import scala.scalajs.js.Dynamic.global

import org.scalajs.jquery.jQuery

import org.scalajs.dom.document

import tutorial.facade._

object TutorialApp extends JSApp {
  def main(): Unit = {
    jQuery(document).ready {
      jQuery("#example").DataTable()
    }
  }
}
