enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"

scalaVersion := "2.12.0"

libraryDependencies ++= Seq(
  "be.doeraene" %%% "scalajs-jquery" % "0.9.1"
)

skip in packageJSDependencies := false

jsDependencies ++= Seq(
  "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js",
  "org.webjars" % "datatables" % "1.10.12-1" / "1.10.12/js/jquery.dataTables.min.js"
)

