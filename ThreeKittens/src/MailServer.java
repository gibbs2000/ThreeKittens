import java.util.LinkedList;
import java.util.TreeSet;

@SuppressWarnings("serial")
public class MailServer extends LinkedList<Message> {
	private TreeSet<Actor> registered;

	public MailServer() {
		registered = new TreeSet<Actor>();
	}

	public void dispatch(Message msg) {

		if (msg.getRecipient() == null) {
			for (Actor a : registered) {
				if (!a.getName().equals(msg.getSender().getName()))
					a.receive(msg);
			}
		} else
			msg.getRecipient().receive(msg);
	}

	public void signUp(Actor actor) {
		registered.add(actor);
	}

}
