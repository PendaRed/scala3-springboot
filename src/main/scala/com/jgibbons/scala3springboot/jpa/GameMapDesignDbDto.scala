package com.jgibbons.scala3springboot.jpa

import java.sql.Timestamp
import java.time.LocalDateTime
import javax.persistence.{Entity, GeneratedValue, GenerationType, Id, Table}
import scala.beans.BeanProperty

@Entity
@Table(name="game_state")
case class GameMapDesignDbDto(
  @BeanProperty var gamename: String,
  @BeanProperty var json: String,
  @BeanProperty var status: String,
  @BeanProperty var version: Int = 0,
  @BeanProperty var createdAt: Timestamp = Timestamp.valueOf(LocalDateTime.now),
  @BeanProperty var createdBy: String = null,
  @BeanProperty var updatedAt: Timestamp = Timestamp.valueOf(LocalDateTime.now),
  @BeanProperty var updatedBy: String = null
) {
  def this() = this(gamename=null, json=null, status=null)

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  var id: Long = _
}
