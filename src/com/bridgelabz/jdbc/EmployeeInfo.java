package com.bridgelabz.jdbc;

import java.sql.Date;
/**
 * create a Contacts in Address Book with first and last names, address, city, state, zip, phone number and email
 * @author ppmoh
 */

public class EmployeeInfo
{
		private int id;
		private String name;
		private char gender;
		private Date startDate;
		private String phone_number;
		private String address;
	    private double basic_pay;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		public Date getStartDate() {
			return startDate;
		}

		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}

		public String getPhone() {
			return phone_number;
		}

		public void setPhone(String phone) {
			this.phone_number = phone;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}
		

		public double getBasic_pay() {
			return basic_pay;
		}

		public void setBasic_pay(double string) {
			this.basic_pay = string;
		}

		@Override
		public String toString() {
			return "EmployeeInfo [id=" + id + ", name=" + name + ", gender=" + gender + ", startDate=" + startDate
					+ ", phone=" + phone_number + ", address=" + address + ", basic_pay=" + basic_pay + "]";
		}
	}