package com.xcp.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xcp.ssm.mapper.EmployeeMapper;
import com.xcp.ssm.pojo.Employee;
import com.xcp.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author xcp
 * @create 2022-10-27 14:56
 */
@Service
@Transactional//事务
public class employessServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    /**
     * 获取所有数据
     * @return
     */
    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    /**
     * 获取所有的分页数据
     * @param page
     * @return
     */
    @Override
    public PageInfo<Employee> getAllPageEmployee(Integer page) {
//        开启导航分页,每页显示5条数据
        PageHelper.startPage(page,5);
//        获取所有数据
        List<Employee> allEmployee = employeeMapper.getAllEmployee();
//        获取分页相关数据，分页导航有5页
        PageInfo<Employee> pageInfo = new PageInfo<>(allEmployee, 5);
        return pageInfo;
    }
}
