package com.raccoonberus.loyaltysvc.dao.test;

import com.raccoonberus.loyaltysvc.dao.CodeDao;
import com.raccoonberus.loyaltysvc.domain.Code;

import java.util.ArrayList;
import java.util.List;

public class CodeDaoImpl implements CodeDao {

    private List<Code> codes = new ArrayList<>();
    private static long nextId = 1;

    @Override
    public Code find(Long aLong) {
        return new Code();
    }

    @Override
    public Code get(String name) {
        for (Code c : codes) {
            if (name.equals(c.getName())) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void save(Code entity) {
        entity.setId(++nextId);
        codes.add(entity);
    }

    @Override
    public void update(Code entity) {
        int i = -1;
        for (Code c : codes) {
            if (c.getId() == entity.getId()) {
                i++;
                break;
            }
            i++;
        }
        codes.set(i, entity);
    }

    @Override
    public void remove(Code entity) {
        codes.remove(entity);
    }
}
