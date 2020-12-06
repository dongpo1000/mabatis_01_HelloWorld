package com.pywl.mapper;

import com.pywl.entity.Employee;

/**
 * @Description mapper接口
 * @Author DongPo
 * @Date 2020-12 20:45
 */
public interface EmployeeMapper {

	/**
	 * 根据 id 查询
	 *
	 * @param id
	 * @return
	 */
	Employee selectByPrimaryId(Integer id);
}
