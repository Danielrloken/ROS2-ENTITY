package kmr.test;

public interface ISocket {
	public void close();
	public void send_message(String msg);
	public String receive_message();
	public byte[] encode(String string);
	public boolean isConnected();
}