package com.crminfo.crminfo.service;

import com.crminfo.crminfo.entity.Kunden;

import java.util.List;

public interface KundenService {

    List<Kunden> findAll();

    Kunden findById(int theId);

    Kunden save(Kunden thekunden);

    void deleteById(int theId);
    void savek (Kunden thekunden);

    Kunden findKundenAndCommentByKundenId(int theId);

}
