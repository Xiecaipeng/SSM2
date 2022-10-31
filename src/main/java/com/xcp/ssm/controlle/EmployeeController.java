package com.xcp.ssm.controlle;

import com.github.pagehelper.PageInfo;
import com.xcp.ssm.pojo.Employee;
import com.xcp.ssm.service.EmployeeService;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author xcp
 * @create 2022-10-27 14:46
 *
 * 查询所有员工信息 --- /employee ---get
 * 查询所有员工的分页信息--- /employee/page/1 ---get
 * 根据id查询员工信息--- /employee/1 --get
 * 跳转到添加页面--- /to/add ---get
 * 添加员工信息--- /employee ---post
 * 修改员工信息--- /employee ---put
 * 删除员工信息--- /employee/1 ---delect
 *
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value="/employee/page/{page}",method = RequestMethod.GET)
    private String getAllPageEmployee(@PathVariable("page") Integer page,Model model){
        //获取所有的分页信息
        PageInfo<Employee> pageInfo=employeeService.getAllPageEmployee(page);
        model.addAttribute("page",pageInfo);
        return "employee_list";
    }

    /**
     * 获取所有数据
     * @param model 域对象
     */
    @RequestMapping(value = "/getAllEmp",method = RequestMethod.GET)
    private String getAllEmployee(Model model){
        List<Employee> allEmp=employeeService.getAllEmployee();
        model.addAttribute("allEmp",allEmp);
        allEmp.forEach(System.out::println);
        return "employee_list";
    }
}
