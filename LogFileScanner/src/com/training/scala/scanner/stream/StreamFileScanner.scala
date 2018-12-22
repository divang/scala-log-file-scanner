package com.training.scala.scanner.stream

import com.training.scala.scanner.FileScanner
import scala.io.Source

class StreamFileScanner extends FileScanner{
  
  override def scan(filePath: String, searchKeyWord: String, occurance:Int): Array[String] = {
    val lines: Stream[String] = Source.fromFile(filePath).getLines().toStream.filter(_.contains(searchKeyWord)).take(occurance)
    lines.toArray
  }
}