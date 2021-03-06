package de.fhkn.in.uce.socketswitch;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.net.ssl.SSLSocketFactory;


public class SysTestSSLSocketFactory implements ISocketFactory {
	
	private final String server;
	private final int port;
	
	public SysTestSSLSocketFactory(final String server, final int port) {
		this.server = server;
		this.port = port;
	}

	@Override
	public Socket createConnection() throws UnknownHostException, IOException {
		return SSLSocketFactory.getDefault()
                .createSocket(server, port);
	}

}
