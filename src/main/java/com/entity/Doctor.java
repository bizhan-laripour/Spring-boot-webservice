package com.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String lastName;

    private Long medicineCode;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToMany(cascade = CascadeType.ALL , mappedBy = "doctorTel")
    private List<Telephone> telephone;

    @ManyToOne
    @JoinColumn(name = "document" , referencedColumnName = "id")
    private Document document;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getMedicineCode() {
        return medicineCode;
    }

    public void setMedicineCode(Long medicineCode) {
        this.medicineCode = medicineCode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Telephone> getTelephone() {
        return telephone;
    }

    public void setTelephone(List<Telephone> telephone) {
        this.telephone = telephone;
    }
}
