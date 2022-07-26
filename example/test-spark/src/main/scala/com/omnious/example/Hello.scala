package com.omnious.example

import org.apache.spark.sql.SparkSession

object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello, Spark!")
    val logFile = "/data/shared2/README.md" // Should be some file on your system
    val spark = SparkSession.builder.appName("helloWorld").getOrCreate()
    val logData = spark.read.textFile(logFile).cache()
    val numAs = logData.filter(line => line.contains("a")).count()
    val numBs = logData.filter(line => line.contains("b")).count()
    println(s"Lines with a: $numAs, Lines with b: $numBs")
    spark.stop()
  }
}