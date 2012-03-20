package dojo

class MailBox {

  def handleMsg(msg: PingPongMessage) = msg match{
    case Ping => Pong
    case Pong => Ping
    case _ => None
  }

  def receive(msg: Any) = msg match{
    case "stop" => "stopped"
    case x:PingPongMessage  => handleMsg(x)
    case ("echo", y) => y
  }

}
