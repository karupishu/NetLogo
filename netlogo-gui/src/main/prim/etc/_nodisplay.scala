// (C) Uri Wilensky. https://github.com/NetLogo/NetLogo

package org.nlogo.prim.etc

import org.nlogo.nvm.{ Command, Context }

class _nodisplay extends Command {

  override def perform(context: Context) {
    world.displayOn(false)
    context.ip = next
  }
}
