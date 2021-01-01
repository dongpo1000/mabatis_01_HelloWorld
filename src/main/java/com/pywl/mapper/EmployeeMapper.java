package com.pywl.mapper;

import com.pywl.entity.Employee;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Description: mapper接口
 * 永远不要拘泥于一种方式，你可以很轻松的在基于注解和 XML 的语句映射方式间自由移植和切换。
 *
 * @author DongPo
 * @date 2020-12 20:45
 */
public interface EmployeeMapper {

	/**
	 * 根据 id 查询
	 *
	 * @param id 主键
	 * @return 结果
	 */
	Employee selectByPrimaryId(Integer id);

	/**
	 * 查询所有，基于注解
	 *
	 * @return 结果
	 */
	@Select("SELECT id, user_name AS userName, gender, email, d_id FROM tb_employee")
	List<Employee> selectAll();

}
