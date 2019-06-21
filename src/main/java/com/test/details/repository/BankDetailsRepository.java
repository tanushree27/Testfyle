package com.test.details.repository;

import com.test.details.model.BankDetails;
import com.test.details.pageinterface.OffsetLimitRequest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.QueryHint;
import java.util.List;

@Repository
public interface BankDetailsRepository extends CrudRepository <BankDetails, String > {

    @QueryHints(@QueryHint(name = "org.hibernate.cacheable", value = "true"))
    @Query(value = "SELECT * FROM bankdetails where ifsc= ?1 ORDER BY ifsc  LIMIT ?3 OFFSET ?2", nativeQuery = true)
    List<BankDetails> findByIfsc(String ifsc, int offset, int limit);

  /*  @QueryHints(@QueryHint(name = "org.hibernate.cacheable", value = "true"))
  *//*  @Query(value = "SELECT * FROM bankdetails where bank_name= ?1 AND city= ?2 ORDER BY ifsc  LIMIT ?4 OFFSET ?3", nativeQuery = true)*//*
    List<BankDetails> findBybanknameAndCity(String bankname, String city, int offset, int limit);*/

    @QueryHints(@QueryHint(name = "org.hibernate.cacheable", value = "true"))
    Page<BankDetails> findByBanknameAndCity(String bankname, String city, Pageable a);

    @QueryHints(@QueryHint(name = "org.hibernate.cacheable", value = "true"))
    @Query(value = "SELECT * FROM bankdetails ORDER BY ifsc  LIMIT ?2 OFFSET ?1", nativeQuery = true)
    List<BankDetails> findAll();

}
