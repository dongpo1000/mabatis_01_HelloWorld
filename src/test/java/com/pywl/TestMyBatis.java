package com.pywl;

import com.pywl.entity.Employee;
import com.pywl.mapper.EmployeeMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Description： 测试
 *
 * @author DongPo
 * @date 2020-12 20:08
 */
public class TestMyBatis {

	// 从 XML 中构建 SqlSessionFactory
	private SqlSessionFactory getFactory() throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		return new SqlSessionFactoryBuilder().build(inputStream);
	}

	/**
	 * 通过 SqlSession 实例来直接执行已映射的 SQL 语句，使用EmployeeMapper1.xml，不需要使用mapper接口
	 *
	 * @throws IOException 异常
	 */
	@Test
	public void test1() throws IOException {

		// 放在try的小括号中，1.7增加特性，try执行完毕后会自动关闭括号中可以关闭的资源
		try (SqlSession session = getFactory().openSession()) {

			// com.pywl.EmployeeMapper1是EmployeeMapper1.xml的namespace的值，selectEmp是对应sql的id
			Employee employee = session.selectOne("com.pywl.EmployeeMapper1.selectEmp", 1);

			System.out.println(employee);
		}

	}

	/**
	 * 使用 mapper 接口，使用EmployeeMapper.xml，推荐使用接口方式
	 *
	 * @throws IOException 异常
	 */
	@Test
	public void test2() throws IOException {

		try (SqlSession session = getFactory().openSession()) {

			EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
			Employee employee = employeeMapper.selectByPrimaryId(1);

			System.out.println(employee);
		}

	}

	/**
	 * 使用 mapper 接口，使用注解
	 *
	 * @throws IOException 异常
	 */
	@Test
	public void test3() throws IOException {

		try (SqlSession session = getFactory().openSession()) {

			EmployeeMapper employeeMapper = session.getMapper(EmployeeMapper.class);
			List<Employee> employees = employeeMapper.selectAll();

			System.out.println(employees);
		}

	}

}
