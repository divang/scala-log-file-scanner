package com.training.scala.scanner.list

import com.training.scala.scanner.FileScanner
import scala.io.Source

class ListFileScanner extends FileScanner{
  
   override def scan(filePath: String, searchKeyWord: String, occurance:Int): Array[String] = {
      val lines:List[String] = Source.fromFile(filePath).getLines().toList.filter(_.contains(searchKeyWord)).take(occurance)
      lines.toArray
   }
}