package com.cn.interview.thread.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class CacheDemo {

	private Map<String, Object> cache = new HashMap<String, Object>();

	private ReadWriteLock rwl = new ReentrantReadWriteLock();
	public  Object getData(String key){
		rwl.readLock().lock();
		Object value = null;
		try{
			value = cache.get(key);
			if(value == null){
				rwl.readLock().unlock();
				rwl.writeLock().lock();
				try{
					if(value==null){
						value = "aaaa";//查询缓存或数据库
					}
				}finally{
					rwl.writeLock().unlock();
				}



			}
		}finally{
			rwl.readLock().unlock();
		}
		return value;
	}
}
