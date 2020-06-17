package com.wyf.curator.session;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;

public abstract class BaseSessionHolder extends BaseConnectionInfo{

	protected static String PATH = "/zk-book/c1";
	protected static CuratorFramework client =
			CuratorFrameworkFactory.builder()
					.connectString(connectionInfo)
					.connectionTimeoutMs(50000)
					.sessionTimeoutMs(50000)
					.retryPolicy(new ExponentialBackoffRetry(1000,3))
					.build();

}
