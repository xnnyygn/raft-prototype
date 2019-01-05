package in.xnnyygn.raftp

object ServerStates {

  sealed trait ServerState

  case class Follower(term: Int, votedFor: String, leaderId: String) extends ServerState

  case class Candidate(term: Int, votedFor: String) extends ServerState

  case class Leader(term: Int)

}
