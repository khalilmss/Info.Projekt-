package com.crminfo.crminfo.service;
import com.crminfo.crminfo.dao.KundenRepository;
import com.crminfo.crminfo.entity.Kunden;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class KundenServiceImpl implements KundenService {
    KundenRepository kundenRepository;

    EntityManager entityManager;

    public KundenServiceImpl(KundenRepository kundenRepository) {
        this.kundenRepository = kundenRepository;
    }



    @Override
    public List<Kunden> findAll() {
        return kundenRepository.findAll();
    }

    @Override
    public Kunden findById(int theId) {
        Optional<Kunden> result = kundenRepository.findById(theId);

        Kunden theKunden = null;

        if (result.isPresent()) {
            theKunden = result.get();
        }
        else {
            // we didn't find the Kunden
            throw new RuntimeException("Did not find employee id - " + theId);

        }

        return theKunden;
    }

    @Override
    @Transactional
    public Kunden save(Kunden theEmployee) {
        return kundenRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        kundenRepository.deleteById(theId);
    }

    @Override
    @Transactional
    public void savek(Kunden thekunden) {
        entityManager.persist(thekunden);
    }

    @Override
    public Kunden findKundenAndCommentByKundenId(int theId) {

        TypedQuery<Kunden> query = entityManager.createQuery(
                "SELECT c from Kunden c "
                        + "JOIN FETCH c.kontakt_history "
                        + "where c.Id = :data", Kunden.class);

        query.setParameter("data", theId);

        // execute query
        Kunden theKunden = query.getSingleResult();
        return theKunden;
    }
}
