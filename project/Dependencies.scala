import sbt._

object Dependencies {

  object Versions {
    val catsV         = "2.1.1"
    val meowV         = "0.4.1"
    val fs2V          = "2.2.2"
    val derevoV       = "0.10.5"
    val console4catsV = "0.8.1"
    val newtypeV      = "0.4.3"
    val refinedV      = "0.9.12"
    val monocleV      = "2.0.1"
  }

  import Versions._

  val catsDependencies = Seq(
    "org.typelevel" %% "cats-core"   % catsV,
    "org.typelevel" %% "cats-effect" % catsV
  )

  val meowDependencies = Seq(
    "com.olegpy" %% "meow-mtl-core"    % meowV,
    "com.olegpy" %% "meow-mtl-effects" % meowV
  )

  val monocleDependencies = Seq(
    "com.github.julien-truffaut" %% "monocle-core"  % monocleV,
    "com.github.julien-truffaut" %% "monocle-macro" % monocleV
  )

  val derevoDependencies = Seq(
    "org.manatki" %% "derevo-cats"         % derevoV,
    "org.manatki" %% "derevo-cats-tagless" % derevoV
  )

  val fs2Dependencies = Seq(
    "co.fs2" %% "fs2-core" % fs2V
  )

  val console4catsDependencies = Seq(
    "dev.profunktor" %% "console4cats" % console4catsV
  )

  val newtypeDependencies = Seq("io.estatico" %% "newtype" % newtypeV)

  val refinedDependencies = Seq("eu.timepit" %% "refined" % refinedV)

  val kindProjectDependencies = Seq(
    compilerPlugin(("org.typelevel" %% "kind-projector" % "0.11.0").cross(CrossVersion.full))
  )

  val contextAppliedDependencies = Seq(
    compilerPlugin("org.augustjune" %% "context-applied" % "0.1.2")
  )
}
