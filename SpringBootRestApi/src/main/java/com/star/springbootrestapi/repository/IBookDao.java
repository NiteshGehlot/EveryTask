package com.star.springbootrestapi.repository;

import com.star.springbootrestapi.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookDao extends JpaRepository<Books,Integer> {

    public Books findByBname(String bname);            //user defined method
    //findBy keyword is compulsory ,it will automatically write the query

    public List<Books> findByBpriceGreaterThan(int bprice);

    //public List<Books> findByBtype(String btype);

    @Query("select b from Books b where bprice >?1 order by bname")              //jpql query
    public List<Books> findBySortedPrice(int bprice);


    @Query("select max(b.bprice) from Books b")
    public int findMaxPrice();

}
