package com.training.scala.scanner.list

import com.training.scala.scanner.AbstractFileScanner

  // This class has the concrete implementation via Array.List 
class ListFileScanner extends AbstractFileScanner{
  
   override def scan(filePath: String, searchKeyWord: String, occurance:Int): Array[String] = {
      val lines:List[String] = readLines(filePath).toList.filter(_.contains(searchKeyWord)).take(occurance)
      lines.toArray
   }
}