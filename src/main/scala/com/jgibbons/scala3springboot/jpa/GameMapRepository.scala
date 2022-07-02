package com.jgibbons.scala3springboot.jpa

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

trait GameMapRepository extends JpaRepository[GameMapDesignDbDto, Long] {
  def findById(id: Long): java.util.Optional[GameMapDesignDbDto]
  def save(gameMapDesignDbDto: GameMapDesignDbDto): Unit
}
