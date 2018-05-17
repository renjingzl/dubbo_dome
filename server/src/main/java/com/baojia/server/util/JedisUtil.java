package com.baojia.server.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;


/**
 * @author renjing
 * @Description: 通过链接池获取redis工具类
 * @date 2018/5/17上午10:33
 */
public class JedisUtil {
	protected static final Logger log = LoggerFactory.getLogger(JedisUtil.class);

	/**
	 * 私有构造器.
	 */
	private JedisUtil() {

	}


	/**
	 * 类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例 没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
	 */
	private static class RedisUtilHolder {
		/**
		 * 静态初始化器，由JVM来保证线程安全
		 */
		private static JedisUtil instance = new JedisUtil();
	}

	/**
	 * 当getInstance方法第一次被调用的时候，它第一次读取
	 * RedisUtilHolder.instance，导致RedisUtilHolder类得到初始化；而这个类在装载并被初始化的时候，会初始化它的静
	 * 态域，从而创建RedisUtil的实例，由于是静态的域，因此只会在虚拟机装载类的时候初始化一次，并由虚拟机来保证它的线程安全性。
	 * 这个模式的优势在于，getInstance方法并没有被同步，并且只是执行一个域的访问，因此延迟初始化并没有增加任何访问成本。
	 */
	public static JedisUtil getInstance() {
		return RedisUtilHolder.instance;
	}

	/**
	 * 获取Redis实例.
	 * @param jedisPool
	 * @return Redis工具类实例
	 */
	public Jedis getJedis(JedisPool jedisPool) {
		Jedis jedis = null;
		int count = 0;
		do {
			try {
				jedis = jedisPool.getResource();
			} catch (Exception e) {
				log.error("get redis master1 failed!", e);
				// 销毁对象
				jedisPool.returnBrokenResource(jedis);
//				getPool().close();
			}
			count++;
		} while (jedis == null && count < 3);
		return jedis;
	}

	/**
	 * 释放redis实例到连接池.
	 * @param jedis
	 * @param jedisPool
	 */
	public void closeJedis(Jedis jedis, JedisPool jedisPool) {
		if (jedis != null) {
			jedisPool.close();
		}
	}
}