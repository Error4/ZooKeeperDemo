package com.wyf.curator.session;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.data.Stat;


public class CreateNodeSample extends BaseSessionHolder {

	public static void main(String[] args) throws Exception {
		client.start();
		client.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT).forPath("/path","aa".getBytes());
			client.create()
					.creatingParentsIfNeeded()
					.withMode(CreateMode.EPHEMERAL)
					.forPath(PATH, "init".getBytes());
		Stat stat = new Stat();
        String data = new String(client.getData().storingStatIn(stat).forPath(PATH));
		System.out.println(String.format("data:%s,stat:%s",data,stat));
		Thread.sleep(Integer.MAX_VALUE);
	}
}
