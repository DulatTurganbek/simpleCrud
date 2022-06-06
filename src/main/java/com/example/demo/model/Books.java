package com.example.demo.model;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table
public class Books {

    @Id
    @Column
    private int bookid;

    @Column
    private String bookName;

    @Column
    private String author;

    @Column
    private int price;

}
