package com.xcp.ssm.service;

import com.github.pagehelper.PageInfo;
import com.xcp.ssm.pojo.Employee;

import java.util.List;

/**
 * @author xcp
 * @create 2022-10-27 14:56
 */
public interface EmployeeService {
    /**
     * 获取所有数据
     * @return
     */
    List<Employee> getAllEmployee();

    /**
     * 获取所有的分页数据
     * @param page
     * @return
     */
    PageInfo<Employee> getAllPageEmployee(Integer page);
}
