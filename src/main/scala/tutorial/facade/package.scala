package tutorial

import org.scalajs.jquery.JQuery

package object facade {
  implicit def jq2DataTables(jq: JQuery): DataTables = jq.asInstanceOf[DataTables]
}
