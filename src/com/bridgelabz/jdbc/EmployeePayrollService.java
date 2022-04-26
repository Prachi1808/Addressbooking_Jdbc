package com.bridgelabz.jdbc;	

import java.util.Locale;

public class EmployeePayrollService {
		
EmployeePayrollRepository employeePayrollRepository = new EmployeePayrollRepository();

		public void retrieveData() {
			System.out.println(employeePayrollRepository.retrieveData());
		}

		public void updateSalary(String name, double d) {
			employeePayrollRepository.updateSalaryUsingPreparedStatement(name.toLowerCase(Locale.ROOT), d);

		}

		public void updateSalaryUsingPreparedStatement(String name, int basic_pay) {
			employeePayrollRepository.updateSalaryUsingPreparedStatement(name.toLowerCase(Locale.ROOT), basic_pay);
		}

		public void retrieveDataByDateRange(String sqlQuery) {
			System.out.println(employeePayrollRepository.retrieveDataByDateRange());
		}

		public void getSumOfSalaryByGender(String sqlQuery) {
			System.out.println(employeePayrollRepository.getSumOfSalaryByGender());
		}

		public void getAverageSalaryByGender(String sqlQuery) {
			System.out.println(employeePayrollRepository.getAverageSalaryByGender());
		}

		public void getMaxSalaryByGender(String sqlQuery) {
			System.out.println(employeePayrollRepository.getMaxSalaryByGender());
		}

		public void getMinSalaryByGender(String sqlQuery) {
			System.out.println(employeePayrollRepository.getMinSalaryByGender());
		}

		public void getCountByGender(String sqlQuery) {
			System.out.println(employeePayrollRepository.getCountByGender());
		}

		public static void main(String[] args) {
			EmployeePayrollService employeePayrollService = new EmployeePayrollService();
			employeePayrollService.retrieveData();
			employeePayrollService.updateSalary("Terrisa", 3000000.00);
			employeePayrollService.retrieveDataByDateRange(null);
			employeePayrollService.getSumOfSalaryByGender(null);
			employeePayrollService.getAverageSalaryByGender(null);
			employeePayrollService.getMaxSalaryByGender(null);
			employeePayrollService.getMinSalaryByGender(null);
			employeePayrollService.getCountByGender(null);
		}

	}