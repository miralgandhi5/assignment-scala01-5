package edu.knoldus

import scala.util.Random

object Application extends App{


    val updatedList = Operations.collatzNumber(List.empty[Int], Random.nextInt(100))
      Operations.collatzNumber(updatedList, Random.nextInt(100))





}
