libraryDependencies <+= (sbtVersion) { sv =>
  "org.scala-sbt" % "scripted-plugin" % sv
}

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.1")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.0.0")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "0.5.0")

