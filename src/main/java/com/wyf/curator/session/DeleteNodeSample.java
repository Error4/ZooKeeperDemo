package com.wyf.curator.session;


public class DeleteNodeSample extends BaseSessionHolder {

	public static void main(String[] args)throws Exception{
		client.start();
		client.delete().deletingChildrenIfNeeded().forPath(PATH);
		byte[] bytes = client.getData().forPath(PATH);
		System.out.println(new String(bytes));
	}
}
