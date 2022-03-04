package com.bin_bx.crud.service;

import com.bin_bx.crud.bean.Employee;
import com.bin_bx.crud.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @ClassName: EmployeeService
 * @Author: bxie
 * @Date: 2022/3/4
 */
@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    /**
     * 查询所有员工
     * @return
     */
    public List<Employee> getAll() {
        return employeeMapper.selectByExampleWithDept(null);
    }
}
