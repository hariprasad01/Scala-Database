ThisBuild / scalaVersion := "2.12.7"
ThisBuild / organization := "com.hari"

lazy val hello = (project in file("."))
  .settings(
    name := "Hello"
  )
