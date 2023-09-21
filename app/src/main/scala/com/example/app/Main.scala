package com.example.app

import com.example.macros.SourcePosition

object Main extends App {
  println(SourcePosition.materialize[ExampleClass])
}
