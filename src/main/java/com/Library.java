package com;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

//@Entity -  this annotation specifies that the class is an entity
//@Table - this annotation specifies the table in the database with which this entity is mapped
//Id - the annotation specifies the primary key of the entity
@Entity     //marking this class as Entity
@Getter
@Setter
@Table(name = "Book_Details")       //naming the table as Book_Details
public class Library {
    //@Id
    //private int BookID;
    @Id
    private String BookTitle;
    private String BookAuthor;
    private double BookPrice;
}