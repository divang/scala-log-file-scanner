package com.training.scala.scanner

//Contract for File scanning 
trait TraitFileScanner {
  //It is decalration of an API
  def scan(filePath: String, searchKeyWord: String, occurance:Int): Array[String] 
  
}