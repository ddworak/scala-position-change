package com.example.app

import com.example.macros.denamer

class C {
  def p() = println("hello, world")
}

object Main extends App {
  println(denamer.span[C])
}
