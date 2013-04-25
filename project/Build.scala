import sbt._
import Keys._

/**
 * Sbt project files are written in a DSL in scala.
 *
 * The % operator is just turning strings into maven dependency declarations, so lines like
 *     val example = "com.example" % "exampleland" % "1.0.3"
 * mean to add a dependency on exampleland version 1.0.3 from provider "com.example".
 */
object ImageManipulation extends Build {
  lazy val imagemanipulation = Project(
    id = "gifmanipulation",
    base = file(".")
  )//.settings(libraryDependencies ++= dependencies)

  lazy val dependencies = Seq(
    "org.scala-tools.testing" % "specs_2.8.1" % "1.6.8",
    "com.madgag" % "animated-gif-lib" % "1.1-SNAPSHOT"
  )
}
