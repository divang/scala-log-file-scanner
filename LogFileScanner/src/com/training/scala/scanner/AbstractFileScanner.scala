package com.training.scala.scanner

import scala.io.Source

//Comman functionality comes to this abstract class, reading file line by line comes to this class
abstract class AbstractFileScanner extends TraitFileScanner{

  // It is common logic between all concrete implementation
  def readLines(filePath:String): Iterator[String] = {
    Source.fromFile(filePath).getLines()
  }
}