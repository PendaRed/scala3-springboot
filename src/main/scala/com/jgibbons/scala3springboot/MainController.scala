package com.jgibbons.scala3springboot

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import scala.jdk.CollectionConverters.*

@main def MainController(args:String*) = {
  SpringApplication.run(classOf[MySpringBootApp], args:_*)
}

@SpringBootApplication
class MySpringBootApp {

}
