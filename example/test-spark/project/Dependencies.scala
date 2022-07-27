import sbt._


object Dependencies {
  val sparkVersion = "3.3.0"
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.11"
  lazy val sparkCore = "org.apache.spark" %% "spark-core"  % sparkVersion
  lazy val sparkSQL = "org.apache.spark" %% "spark-sql"   % sparkVersion
  lazy val sparkMLlib = "org.apache.spark" %% "spark-mllib" % sparkVersion
}
