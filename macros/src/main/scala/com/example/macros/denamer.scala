package com.example.macros

import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context

object denamer {
  def span[A]: Option[(Int, Int, String)] = macro spanner[A]

  def spanner[A: c.WeakTypeTag](c: Context) = {
    import c.universe._

    val sym = symbolOf[A]
    val text = String.valueOf(sym.pos.source.content, sym.pos.start, sym.pos.end - sym.pos.start)
    q"Option.apply((${sym.pos.start}, ${sym.pos.end}, $text))"
  }
}
