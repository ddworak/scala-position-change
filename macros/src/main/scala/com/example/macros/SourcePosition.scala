package com.example.macros

import scala.language.experimental.macros

case class SourcePosition(start: Int, end: Int, content: String)

object SourcePosition {
  def materialize[T]: SourcePosition = macro TestMacros.sourcePosition[T]
}