/****************************************
 * SGS Revolt - Server Project
 ****************************************/
package com.sgs.game.sgsr.server.dao.staticdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO;
import com.sgs.game.sgsr.server.utils.db.staticdata.StaticDBUtil;

// TODO: Auto-generated Javadoc
/**
 * The Class BaseStaticDataDAO.
 *
 * @param <T>
 *            the generic type
 */
public class BaseStaticDataDAO<T extends BaseStaticDataDTO<T>> implements IBaseStaticDataDAO<T> {

	/** The version. */
	private String version;

	/** The key. */
	private String key;

	/**
	 * Gets the version.
	 *
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * Sets the version.
	 *
	 * @param version
	 *            the new version
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Gets the key.
	 *
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Sets the key.
	 *
	 * @param key
	 *            the new key
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * Instantiates a new base static data DAO.
	 *
	 * @param version
	 *            the version
	 * @param key
	 *            the key
	 */
	public BaseStaticDataDAO(String version, String key) {
		this.version = version;
		this.key = key;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dao.IBaseDAO#get(int)
	 */
	@Override
	public T get(int id) {
		T t = getAllDTOObject().get(id);
		return t;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dao.IBaseDAO#create(java.lang.Object)
	 */
	@Override
	public T create(T object) {
		getAllDTOObject().put(object.getId(), object);
		return object;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dao.IBaseDAO#update(java.lang.Object)
	 */
	@Override
	public T update(T object) {
		T existedT = get(object.getId());
		existedT = object.clone();
		return existedT;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dao.IBaseDAO#remove(int)
	 */
	@Override
	public T remove(int id) {
		return getAllDTOObject().remove(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dao.IBaseDAO#replace(java.lang.Object)
	 */
	@Override
	public T replace(T object) {
		T existedT = get(object.getId());
		existedT = object;
		return existedT;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dao.IBaseDAO#count()
	 */
	@Override
	public int count() {
		return getAllDTOObject().size();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dao.IBaseDAO#getRange(int, int)
	 */
	@Override
	public List<T> getRange(int start, int count) {
		List<T> values = new ArrayList<T>();
		HashMap<Integer, T> allDTOObject = getAllDTOObject();
		for (int i = start; i < start + count; i++) {
			values.add(allDTOObject.get(i));
		}
		return values;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sgs.game.sgsr.server.dao.staticdata.IBaseStaticDataDAO#findByName(
	 * java.lang.String)
	 */
	@Override
	public T findByName(String name) {
		HashMap<Integer, T> allDTOObject = getAllDTOObject();
		for (T t : allDTOObject.values()) {
			if (t.getName().equals(name)) {
				return t;
			}
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sgs.game.sgsr.server.dao.staticdata.IBaseStaticDataDAO#
	 * getAllDTOObject()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public HashMap<Integer, T> getAllDTOObject() {
		return ((HashMap<Integer, T>) StaticDBUtil.getStaticData().get(version).get(key));
	}

}
