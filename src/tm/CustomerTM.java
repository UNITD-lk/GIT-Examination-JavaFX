/*
 * ---------------------------------------------------------------------------------------------
 *  *  Copyright (c) UnitD-lk. All rights reserved.
 *  *  Licensed under the SriLanka License. See License.txt in the project root for license information.
 *  *--------------------------------------------------------------------------------------------
 */

package tm;

/**
 * @author GImhan Pabasara <gimhanpabasara4@gmail.com> (www.gimhanpabasara.tk)
 * @since 10/9/2021
 */
public class CustomerTM {
    private String id;
    private String name;
    private String address;
    private double salary;
    private Button btn;

    public CustomerTM() {
    }

    public CustomerTM(String id, String name, String address, double salary, Button btn) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.btn = btn;
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

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "CustomerTM{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", btn=" + btn +
                '}';
    }


