package com.training.scala.main

import com.training.scala.scanner.FileScanner
import com.training.scala.scanner.stream.StreamFileScanner
import com.training.scala.scanner.list.ListFileScanner


object FileScannerFactory {
  
  def getScanner(lazyRequired: Boolean = true): FileScanner = {
    if(lazyRequired) {
      println("Lazy File scanner is initializing")
      new StreamFileScanner
    }
    else{
      println("Strict File scanner is initializing")
      new ListFileScanner
    }
  }
}