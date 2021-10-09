/*
 * ---------------------------------------------------------------------------------------------
 *  *  Copyright (c) UnitD-lk. All rights reserved.
 *  *  Licensed under the SriLanka License. See License.txt in the project root for license information.
 *  *--------------------------------------------------------------------------------------------
 */

package dto;

/**
 * @author GImhan Pabasara <gimhanpabasara4@gmail.com> (www.gimhanpabasara.tk)
 * @since 10/9/2021
 */

public class CustomerDTO {
    private String id;
    private String name;
    private String address;
    private double salary;

    public CustomerDTO() {
    }

    public CustomerDTO(String id, String name, String address, double salary) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setSalary(salary);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }

