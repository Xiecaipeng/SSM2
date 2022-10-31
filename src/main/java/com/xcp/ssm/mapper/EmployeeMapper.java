package com.xcp.ssm.mapper;

import com.github.pagehelper.PageInfo;
import com.xcp.ssm.pojo.Employee;

import java.util.List;

/**
 * @author xcp
 * @create 2022-10-27 20:49
 */
public interface EmployeeMapper {
    /**
     * 获取所有数据
     * @return
     */
    List<Employee> getAllEmployee();

}
