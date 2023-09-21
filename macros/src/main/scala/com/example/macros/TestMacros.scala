package com.example.macros

import scala.reflect.macros.blackbox

class TestMacros(val c: blackbox.Context) {

  import c.universe._

  def sourcePosition[T: WeakTypeTag]: Tree = {
    val position = weakTypeOf[T].typeSymbol.pos
    q"""
       _root_.com.example.macros.SourcePosition(
         ${position.start},
         ${position.end},
         ${new String(position.source.content, position.start, position.end - position.start)}
       )
     """
  }
}
