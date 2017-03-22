package com.work;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @author Thaiana H.B.C
 */
public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

}