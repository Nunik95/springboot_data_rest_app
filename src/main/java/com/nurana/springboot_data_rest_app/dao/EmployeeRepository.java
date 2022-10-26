/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nurana.springboot_data_rest_app.dao;

import com.nurana.springboot_data_rest_app.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 * @author user
 */
@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Integer> {

}
