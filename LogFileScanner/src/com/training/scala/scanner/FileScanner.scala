package com.training.scala.scanner

abstract class FileScanner {
  def scan(filePath: String, searchKeyWord: String, occurance:Int): Array[String]
}