package com.lanou.dao;

import com.lanou.domain.Classes;
import com.lanou.domain.ClassesQueryParam;

import java.util.List;

/**
 * Created by zyf on 2018/2/7.
 */
public interface ClassesMapper {

	void insertClasses(Classes classes);


	List<Classes> findByCondition(Classes classes);

	List<Classes> findByIds(ClassesQueryParam classesQueryParam);
}
