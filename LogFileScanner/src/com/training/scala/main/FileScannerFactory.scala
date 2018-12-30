package com.training.scala.main

import com.training.scala.scanner.stream.StreamFileScanner
import com.training.scala.scanner.list.ListFileScanner
import com.training.scala.scanner.TraitFileScanner

object FileScannerFactory {
  
  //Returning the concrete implementation of TraitFileScanner. Based on the 'lazyRequired' flag it picks the 
  //implementation class
  def getScanner(lazyRequired: Boolean = true): TraitFileScanner = {
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