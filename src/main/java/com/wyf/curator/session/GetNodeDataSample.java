package com.wyf.curator.session;

import org.apache.zookeeper.data.Stat;


public class GetNodeDataSample extends BaseSessionHolder {

	public static void main(String[] args) throws Exception {
		client.start();
		Stat stat = new Stat();
		String data = new String(client.getData().storingStatIn(stat).forPath(PATH));
		System.out.println(String.format("data:%s,stat:%s", data, stat));
		Thread.sleep(Integer.MAX_VALUE);
	}
}
