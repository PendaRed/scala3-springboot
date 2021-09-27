package com.jgibbons.scala3springboot

import com.jgibbons.scala3springboot.jpa.{GameMapDesignDbDto, GameMapRepository}
import org.springframework.http.{HttpStatus, ResponseEntity}
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RequestParam, RestController}

@RestController
class HelloRestController(gameRepository: GameMapRepository)  {
  @GetMapping(value=Array("/hello"))
  def hello(@RequestParam(value = "name", defaultValue = "World") name: String): String =
    s"Hello $name"

  @GetMapping(value = Array("/games"))
  def getGames(): ResponseEntity[java.util.List[GameMapDesignDbDto]] =
    val games = gameRepository.findAll()
    new ResponseEntity[java.util.List[GameMapDesignDbDto]](games, HttpStatus.OK)
}
