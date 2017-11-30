
/**
 * Can send and receive messages.
 */

import java.util.Queue;
import java.util.LinkedList;

public abstract class Actor implements Comparable<Actor> {
	private String name;
	@SuppressWarnings("unused")
	private Queue<Message> mailbox;
	private MailServer mailServer;

	public Actor(String nm) {
		name = nm;
		mailbox = new LinkedList<Message>();
	}

	/**
	 * Returns the name of this Actor.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Adds server as this Actor's message server.
	 */
	public void addMailServer(MailServer server) {
		mailServer = server;
		mailServer.signUp(this);
	}

	/**
	 * Checks whether this actor's mailbox has any messages; returns true if it
	 * does, false if it doesn't.
	 */
	public boolean moreMail() {
		return false;
		// TODO method
	}

	/**
	 * Adds msg to this Actor's mailbox.
	 */
	public void receive(Message msg) {
		// TODO method
	}

	/**
	 * Removes and returns one message from this Actor's mailbox.
	 */
	public Message readNextMessage() {
		// TODO method
		return null;
	}

	public abstract void readMail();

	/**
	 * Creates a new message from this actor to the specified recipient and adds it
	 * to mailServer.
	 */
	public void send(Actor recipient, String text) {
		// TODO method
	}

	/**
	 * Creates a new message from this actor with null recipient and adds it to
	 * mailServer.
	 */
	public void announce(String text) {
		// TODO method
	}

	/**
	 * Compares this Actor to another in alphabetical order of their names.
	 */
	public int compareTo(Actor other) {
		return name.compareTo(other.getName());
	}

	/**
	 * Checks whether this Actor's name is the same as other's.
	 */
	public boolean equals(Object other) {
		return other != null && name.equals(((Actor) other).getName());
	}

	/**
	 * Returns the hashCode for this Actor equal to the hashcode of its name.
	 */
	public int hashCode() {
		return name.hashCode();
	}

	/**
	 * Returns the name of this actor.
	 */
	public String toString() {
		return name;
	}
}
