package com.eaccid.spring.web.service;

import com.eaccid.spring.web.dao.Offer;
import com.eaccid.spring.web.dao.OffersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("offersService")
public class OffersService {

    private OffersDAO offersDAO;

    @Autowired
    public void setOffersDAO(OffersDAO offersDAO) {
        this.offersDAO = offersDAO;
    }

    public List<Offer> getCurrent() {
        return offersDAO.getOffers();
    }
}
