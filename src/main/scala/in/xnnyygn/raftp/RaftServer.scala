package in.xnnyygn.raftp

import java.net.InetSocketAddress

class RaftServer(
                  val peers: Array[InetSocketAddress],
                  val port: Int,
                  private var serverState: ServerStates.ServerState
                ) {

  def start(): Unit = {
    // TODO listener on port
    // TODO start scheduler
  }

  // TODO start election
  // scheduler executor

  // TODO current state

}
