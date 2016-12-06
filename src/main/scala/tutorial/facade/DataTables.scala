package tutorial.facade

import scala.scalajs.js

import org.scalajs.jquery.JQuery

@js.native
trait DataTables extends JQuery {
  def DataTable(): DataTables = js.native
}
