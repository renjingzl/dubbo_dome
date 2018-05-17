package service;


/**
 * @author renjing
 * @Description: 操作redis数据接口
 * @date 2018/5/17上午10:33
 */
public interface RedisService {

	/**
	 * @Description:用redis实现分布式锁setnx.
	 * @param key	锁对象
	 * @param expire	过期时间
	 * @return 是否设置成功
	 */
	public boolean lock(String key, int expire);

	/**
	 * @Description:用redis实现分布式锁setnx.
	 * @param key	锁对象
	 * @return 是否设置成功
	 */
	public boolean lock2(String key);

	/**
	 * @Description:存值并设置过期时间
	 * @param type	业务分类
	 * @param key
	 * @param value
	 * @param expire	过期时间
	 */
	public void put(String type, String key, String value, int expire);

	/**
	 * @Description:永久存值，不过期
	 * @param type	业务分类
	 * @param key
	 * @param value
	 */
	public void put(String type, String key, String value);

	/**
	 * @Description:删除
	 * @param type	业务分类
	 * @param key
	 */
	public void delete(String type, String key);

	/**
	 * @Description:释放锁
	 * @param key
	 */
	public void unlock(String key);

}
