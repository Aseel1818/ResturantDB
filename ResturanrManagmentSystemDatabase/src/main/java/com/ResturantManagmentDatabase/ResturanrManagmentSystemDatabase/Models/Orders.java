package com.ResturantManagmentDatabase.ResturanrManagmentSystemDatabase.Models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)

    private Long orderId ;
    private  Float total;


    @ManyToMany
    @JoinTable(
            name = "OrderDetails",
            joinColumns = @JoinColumn(name = "orderId"),
            inverseJoinColumns = @JoinColumn(name = "orderDetailsId"))
    Set<OrderDetails> DetailsOfOrder;

    public  Orders() {}


    public Orders(float total )
    {
        this.total=total;
        this.orderId=orderId;


    }

    public long getOrderID(){
        return  orderId;
    }
    public void setOrderId(Long orderId){
        this.orderId=orderId;
    }

    public Float getOrderTotal (){
        return total;
    }
    public void setOrderTotal(float total){
        this.total=total;
    }


}
