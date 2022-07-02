import sbt.Keys.libraryDependencies

val scala3Version = "3.1.3"

lazy val root = project
  .in(file("."))
  .settings(
    name         := "scala3-springboot",
    version      := "0.1.0",
    scalaVersion := scala3Version,

    // https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web
    libraryDependencies ++= Seq(
      "co.fs2"                   % "fs2-core_2.13"                % "3.2.8",
      "co.fs2"                   % "fs2-io_2.13"                  % "3.2.8",
      "co.fs2"                   % "fs2-reactive-streams_2.13"    % "3.2.8",
      "org.typelevel"            % "cats-effect_3"                % "3.3.12",
      "org.springframework.boot" % "spring-boot-starter-web"      % "2.7.0",
      "org.springframework.boot" % "spring-boot-starter"          % "2.7.0",
      "org.springframework.boot" % "spring-boot-starter-data-jpa" % "2.7.0",
      "org.springframework.boot" % "spring-boot-starter-test"     % "2.7.0" % Test,
      "org.postgresql"           % "postgresql"                   % "42.3.6",
      "javax.xml.bind"           % "jaxb-api"                     % "2.3.0",
      "com.sun.xml.bind"         % "jaxb-core"                    % "2.3.0",
      "com.sun.xml.bind"         % "jaxb-impl"                    % "2.3.0"
    )
  )
