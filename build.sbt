ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.0"


lazy val root = (project in file("."))
  .settings(
    name := "zio-prelude-opaque-issue",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio-prelude" % "1.0.0-RC19"
    )
  )
