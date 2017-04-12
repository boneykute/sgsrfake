package com.sgs.game.sgsr.server.dao.staticdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.sgs.game.sgsr.server.dto.staticdata.BaseStaticDataDTO;
import com.sgs.game.sgsr.server.utils.db.staticdata.StaticDBUtil;

public class BaseStaticDataDAO<T extends BaseStaticDataDTO<T>> implements IBaseStaticDataDAO<T> {

	public String version;
	public String key;

	public BaseStaticDataDAO(String version, String key) {
		this.version = version;
		this.key = key;
	}

	@Override
	public T get(int id) {
		T t = getAllDTOObject().get(id);
		return t;
	}

	@Override
	public T create(T object) {
		getAllDTOObject().put(object.getId(), object);
		return object;
	}

	@Override
	public T update(T object) {
		T existedT = get(object.getId());
		existedT = object.clone();
		return existedT;
	}

	@Override
	public T remove(int id) {
		return getAllDTOObject().remove(id);
	}

	@Override
	public T replace(T object) {
		T existedT = get(object.getId());
		existedT = object;
		return existedT;
	}

	@Override
	public int count() {
		return getAllDTOObject().size();
	}

	@Override
	public List<T> getRange(int start, int count) {
		List<T> values = new ArrayList<T>();
		HashMap<Integer, T> allDTOObject = getAllDTOObject();
		for (int i = start; i < start + count; i++) {
			values.add(allDTOObject.get(i));
		}
		return values;
	}

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

	@SuppressWarnings("unchecked")
	@Override
	public HashMap<Integer, T> getAllDTOObject() {
		return ((HashMap<Integer, T>) StaticDBUtil.getStaticData().get(version).get(key));
	}

}
