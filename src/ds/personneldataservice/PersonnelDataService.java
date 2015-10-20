package ds.personneldataservice;

import java.util.ArrayList;

import po.InstPO;
import po.PersonPO;

/**
 * 人员机构管理数据接口类
 * @author czq
 * @date 2015/10/20
 */
public interface PersonnelDataService {
	/**
	 * 通过机构ID查找机构下属人员
	 * @param ID
	 * @return 该机构下属人员信息，若无该机构，返回null
	 */
	public ArrayList<PersonPO> getPeoByInst(String ID);
	/**
	 * 通过人员iD查找人员信息
	 * @param ID
	 * @return 返回人员信息，null则为找不到
	 */
	public PersonPO getPersonByID(String ID);
	/**
	 * 通过人员姓名查找人员信息
	 * @param name
	 * @return 相关的人员信息（模糊查找）
	 */
	public ArrayList<PersonPO> getPeoByName(String name);
	/**
	 * 增加人员，将其变为持久化对象
	 * @param po 
	 * @return 是否成功
	 */
	public boolean addPerson(PersonPO po);
	/**
	 * 删除人员
	 * @param po
	 * @return 是否成功
	 */
	public boolean delPerson(PersonPO po);
	/**
	 * 增加机构
	 * @param po
	 * @return 是否成功
	 */
	public boolean addInst(InstPO po);
	/**
	 * 删除机构
	 * @param po
	 * @return 是否成功
	 */
	public boolean delInst(InstPO po);
	/**
	 * 获得所有机构信息
	 * @return
	 */
	public ArrayList<InstPO> getInst();
}
