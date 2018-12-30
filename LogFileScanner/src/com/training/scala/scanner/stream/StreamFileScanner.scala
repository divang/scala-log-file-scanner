package com.training.scala.scanner.stream

import scala.io.Source
import com.training.scala.scanner.AbstractFileScanner

  // This class has the concrete implementation via Stream
class StreamFileScanner extends AbstractFileScanner{
  
  override def scan(filePath: String, searchKeyWord: String, occurance:Int): Array[String] = {
    val lines: Stream[String] = readLines(filePath).toStream.filter(_.contains(searchKeyWord)).take(occurance)
    lines.toArray
  }
}