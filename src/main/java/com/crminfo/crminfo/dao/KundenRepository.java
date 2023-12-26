package com.crminfo.crminfo.dao;

import com.crminfo.crminfo.entity.Kunden;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KundenRepository extends JpaRepository<Kunden, Integer> {
}
