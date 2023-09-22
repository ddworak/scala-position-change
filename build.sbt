inThisBuild(Seq(
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.13.12",
))

lazy val root = project.in(file(".")).aggregate(macros, app)
lazy val app = project.dependsOn(macros)
lazy val macros = project.settings(
  libraryDependencies ++= Seq(
    "org.scala-lang" % "scala-reflect" % scalaVersion.value,
    "org.scalatest" %% "scalatest" % "3.2.17" % Test,
  )
)