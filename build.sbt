import sbt.Keys.libraryDependencies

val scala3Version = "3.0.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-springboot",
    version := "0.1.0",

    scalaVersion := scala3Version,

    // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web
    libraryDependencies ++= Seq(
      "co.fs2" % "fs2-core_2.13" % "3.0.6",
      "co.fs2" % "fs2-io_2.13" % "3.0.6",
      "co.fs2" % "fs2-reactive-streams_2.13" % "3.0.6",
      "org.typelevel" % "cats-effect_3" % "3.1.1",
      "org.springframework.boot" % "spring-boot-starter-web" % "2.5.5",
      "org.springframework.boot" % "spring-boot-starter" % "2.5.5",
      "org.springframework.boot" % "spring-boot-starter-data-jpa" % "2.5.5",
      "org.springframework.boot" % "spring-boot-starter-test" % "2.5.5" % Test,
      "org.postgresql" %  "postgresql" % "42.2.14"
    )
  )
