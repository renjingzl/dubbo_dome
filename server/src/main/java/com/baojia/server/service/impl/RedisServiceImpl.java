package com.baojia.server.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baojia.server.util.JedisUtil;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import service.RedisService;

/**
 * @author renjing
 * @Description: 操作redis数据实现
 * @date 2018/5/17上午10:33
 */
@Service(version = "1.0.0")
public class RedisServiceImpl implements RedisService {

	@Autowired
	@Qualifier("jedisPool")
	private JedisPool jedisPool;

	private static JedisUtil jedisUtil = JedisUtil.getInstance();

	private static final Logger log = Logger.getLogger(RedisServiceImpl.class);


	public boolean lock(String key, int expire) {
		Jedis client = jedisUtil.getJedis(jedisPool);
		try {
			long ret = client.setnx(key, "1");
			if (ret == 1) {
				client.expire(key, expire);
			}
			return ret == 1;
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage(), e);
			return false;
		} finally {
			client.close();
		}
	}

	public boolean lock2(String key) {
		Jedis client = jedisUtil.getJedis(jedisPool);
		try {
			long ret = client.setnx(key, "1");

			return ret == 1;
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage(), e);
			return false;
		} finally {
			client.close();
		}
	}

	public void put(String type, String key, String value, int expire) {
		String tkey = type + "-" + key;
		Jedis client = jedisUtil.getJedis(jedisPool);
		try {
			client.set(tkey, value);
			if (expire > 0) {
				client.expire(tkey, expire);
			}
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage(), e);
		} finally {
			client.close();
		}
	}

	public void put(String type, String key, String value) {
		put(type, key, value, -1);
	}

	public String get(String type, String key) {
		String tkey = type + "-" + key;
		Jedis client = jedisUtil.getJedis(jedisPool);
		try {
			return client.get(tkey);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			e.printStackTrace();
			return null;
		} finally {
			client.close();
		}
	}

	public void delete(String type, String key) {
		String tkey = type + "-" + key;
		Jedis client = jedisUtil.getJedis(jedisPool);
		try {
			client.del(tkey);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			e.printStackTrace();
		} finally {
			client.close();
		}
	}

	public void unlock(String key) {
		Jedis client = jedisUtil.getJedis(jedisPool);
		try {
			client.del(key);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			e.printStackTrace();
		} finally {
			client.close();
		}
	}

}
