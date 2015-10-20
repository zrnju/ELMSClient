package vo;

import util.AccountType;

/**
 * 账户VO类
 * @author czq
 * @date 2015/10/20
 */
public class AccountVO {
	
	/**
	 * 账户ID
	 */
	String ID;
	/**
	 * 账户姓名
	 */
	String name;
	/**
	 * 账户种类
	 */
	AccountType type;
	/**
	 * 账户密码
	 */
	String password;
	
	/**
	 * 账户VO类构造器
	 * @param iD
	 * @param name
	 * @param type
	 * @param password
	 */
	public AccountVO(String ID, String name, AccountType type, String password) {
		super();
		this.ID = ID;
		this.name = name;
		this.type = type;
		this.password = password;
	}
	
	
	
	
}
