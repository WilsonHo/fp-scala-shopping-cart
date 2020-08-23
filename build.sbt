import Dependencies._

lazy val commonSettings = Seq(
  organization := "bao.ho",
  version := "0.1",
  scalaVersion := "2.13.3",
  scalacOptions += "-Ymacro-annotations"
)

lazy val root = (project in file("."))
  .settings(name := "fp-scala-shopping-cart")

lazy val common = (project in file("common"))
  .settings(name := "common")
  .settings(libraryDependencies ++= catsDependencies)
  .settings(libraryDependencies ++= meowDependencies)
  .settings(libraryDependencies ++= monocleDependencies)
  .settings(libraryDependencies ++= derevoDependencies)
  .settings(libraryDependencies ++= fs2Dependencies)
  .settings(libraryDependencies ++= console4catsDependencies)
  .settings(libraryDependencies ++= newtypeDependencies)
  .settings(libraryDependencies ++= refinedDependencies)
  .settings(libraryDependencies ++= kindProjectDependencies)
  .settings(libraryDependencies ++= contextAppliedDependencies)

lazy val service = (project in file("service"))
  .settings(name := "service")
  .dependsOn(common % "compile->compile;test->test")
