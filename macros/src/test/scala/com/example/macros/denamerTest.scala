package com.example.macros

import org.scalatest.funsuite.AnyFunSuite

class A {
  def p() = println("hello, world")
}

class denamerTest extends AnyFunSuite {
  test("class content") {
    println(denamer.span[A])
  }
}
