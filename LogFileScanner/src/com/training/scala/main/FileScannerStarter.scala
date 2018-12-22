package com.training.scala.main

import com.training.scala.scanner.FileScanner
import com.training.scala.scanner.list.ListFileScanner
import com.training.scala.scanner.stream.StreamFileScanner

object FileScannerStarter {
  
  def main(args:Array[String]) { 
    println("File scanner is starting")
    
    if(args.length != 4){
      println("Usages: FileScannerStarter <lazy/strict> <file path> <search word> <occurance>")
      System.exit(1)
    }
    
    var lazyEvaluation = 
      if(args(0).equalsIgnoreCase("lazy")) true
      else if(args(0).equalsIgnoreCase("strict")) false
      else throw new IllegalArgumentException("Invalid evaluation type. It should be lazy/strict")
    
    var scanner:FileScanner = FileScannerFactory.getScanner(lazyEvaluation)
    
    val lines:Array[String] = scanner.scan(args(1), args(2), args(3).toInt);
    lines.foreach(println)
  }
}