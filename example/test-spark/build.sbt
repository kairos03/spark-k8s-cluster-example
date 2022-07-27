import Dependencies._

ThisBuild / scalaVersion     := "2.12.15"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.omnious"
ThisBuild / organizationName := "omnious"

lazy val root = (project in file("."))
  .settings(
    name := "test-spark",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      sparkCore % Provided,
      sparkSQL % Provided,
      sparkMLlib % Provided
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
