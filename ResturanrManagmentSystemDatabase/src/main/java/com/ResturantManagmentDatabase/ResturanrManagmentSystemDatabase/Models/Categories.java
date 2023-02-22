package com.ResturantManagmentDatabase.ResturanrManagmentSystemDatabase.Models;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Entity
@Transactional
@Data
@Table(name = "Categories")
public class Categories implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "categoryId")

    private Long categoryId ;
    private String categoryName;

    private List<String> listOfItems;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_category_id",referencedColumnName = "categoryId")

    private List<Items> items;

    public  Categories() {}


    public Categories(String categoryName , List<String> listOfItems )
    {
        this.categoryName=categoryName;
        this.listOfItems=listOfItems;
        this.categoryId=categoryId;


    }

    public long getCategoryID(){
        return  categoryId;
    }
    public void setCategoryId(Long categoryId){
        this.categoryId=categoryId;
    }

    public String getCategoryName (){
        return categoryName;
    }
    public void setCategoryName(String categoryName){
        this.categoryName=categoryName;
    }

    public List<String> getListOfItems (){
        return listOfItems;
    }
    public void setListOfItems(List<String> listOfItems){
        this.listOfItems=listOfItems;
    }







}
