inThisBuild(Seq(
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.13.12",
  crossScalaVersions := Seq("2.13.12", "2.13.11"),
))

lazy val app = project.dependsOn(macros)
lazy val macros = project.settings(libraryDependencies += "org.scala-lang" % "scala-reflect" % scalaVersion.value)