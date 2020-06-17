package com.wyf.curator.session;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;


public class CreateSessionSample extends BaseConnectionInfo {

	public static void main(String[] args) throws Exception {
		RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
		CuratorFramework client =
				CuratorFrameworkFactory.newClient(
						connectionInfo,
						5000,
						3000,
						retryPolicy);
		client.start();
		Thread.sleep(Integer.MAX_VALUE);
	}
}
