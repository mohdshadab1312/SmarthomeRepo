package com.tcs.Smarthome.Utilities;

import com.experitest.client.Client;

public class MyClient extends Client{

	public MyClient(String host, int port) {
		
		//What this true condition is used for?
		super(host,port,true);
	}	
}


