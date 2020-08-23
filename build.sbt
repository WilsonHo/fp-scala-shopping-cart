lazy val commonSettings = Seq(
  organization := "bao.ho",
  version := "0.1",
  scalaVersion := "2.12.12"
)

lazy val root = (project in file("."))
  .settings(name := "fp-scala-shopping-cart")
//  .settings(libraryDependencies ++= circeDepedencies)

lazy val common = (project in file("common"))
  .settings(name := "common")

lazy val service = (project in file("service"))
  .settings(name := "service")
