package util;

import com.rabbitmq.client.ConnectionFactory;

public class ConnectionFactoryBuilder {
	
	private ConnectionFactoryBuilder() {
		
	}
	
	public static ConnectionFactory getInstance(String host,String username,String password,int port) {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		connectionFactory = new ConnectionFactory();
		connectionFactory.setHost(host);
		connectionFactory.setUsername(username);
		connectionFactory.setPassword(password);
		connectionFactory.setPort(port);
		return connectionFactory;
	}
	
	public static ConnectionFactory getInstanceYangPeng() {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		connectionFactory = new ConnectionFactory();
		connectionFactory.setHost("192.168.29.128");
		connectionFactory.setUsername("yangpeng");
		connectionFactory.setPassword("290013");
		connectionFactory.setPort(5672);
		return connectionFactory;
	}
}
