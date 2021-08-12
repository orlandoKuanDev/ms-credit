package com.example.mscredit.services;

import com.example.mscredit.model.entities.Credit;
import com.example.mscredit.repositories.ICreditRepository;
import com.example.mscredit.repositories.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreditService extends BaseService<Credit, String> implements ICreditService {

    private final ICreditRepository iCreditRepository;

    @Autowired
    public CreditService(ICreditRepository iCreditRepository) {
        this.iCreditRepository = iCreditRepository;
    }

    @Override
    protected IRepository<Credit, String> getRepository() {
        return iCreditRepository;
    }
}
