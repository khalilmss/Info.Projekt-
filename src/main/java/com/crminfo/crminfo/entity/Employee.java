package com.crminfo.crminfo.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="employee")
public class Employee {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name = "id_creattor")
    private String id_creator;

    @Column(name = "status")
    private String status;

    @Column(name = "cr_date")
    private LocalDateTime cr_date;

    @Column(name = "ex_date")
    private LocalDateTime ex_date;

//    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "employee_id")
//    private List<Test> test;

    // define constructors
    public Employee() {

    }

    public Employee(String firstName, String lastName, String email, String id_creator, String status, LocalDateTime cr_date, LocalDateTime ex_date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.id_creator = id_creator;
        this.status = status;
        this.cr_date= cr_date;
        this.ex_date= ex_date;
    }

    // define getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId_creator() {
        return id_creator;
    }

    public void setId_creator(String id_creator) {
        this.id_creator = id_creator;
    }

    public String getStatus() {
        return status;
    }

    public LocalDateTime getCr_date() {
        return cr_date;
    }

    public void setCr_date(LocalDateTime cr_date) {
        this.cr_date = cr_date;
    }

    public LocalDateTime getEx_date() {
        return ex_date;
    }

    public void setEx_date(LocalDateTime ex_date) {
        this.ex_date = ex_date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

//    public List<Test> getTest() {
//        return test;
//    }
//
//    public void setTest(List<Test> test) {
//        this.test = test;
//    }
//
//    // add connvenience method
//
//    public void addTest(Test thetest){
//        if (test == null){
//            test= new ArrayList<>();
//        }
//        test.add(thetest);
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", id_creator='" + id_creator + '\'' +
                ", status='" + status + '\'' +
                ", cr_date=" + cr_date +
                ", ex_date=" + ex_date +
                '}';
    }
}
