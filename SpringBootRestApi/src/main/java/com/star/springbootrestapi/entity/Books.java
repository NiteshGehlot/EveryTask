package com.star.springbootrestapi.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity                                    //Default(class) name table will be created
@Table(name = "BookDetails")             //BookDetails table will be created
public class Books {

    @Id                                   //now bid will be considered as primary key in database
    @GeneratedValue(strategy = GenerationType.AUTO)     //this will auto generate the primary key value
    private int bid;
    @Column
    private String bname;
    @Column
    private String btype;
    @Column
    private int bprice;
}
