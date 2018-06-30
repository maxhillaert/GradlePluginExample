package com.js

import com.library.PrinterLibrary

import scala.scalajs.js.JSApp

/**
  * Created by max on 30/06/2018.
  */
object MyMain extends JSApp{

  def main(): Unit = {
    println("Starting...")
    val l = new PrinterLibrary
    println("Message="+l.message)
  }
}
