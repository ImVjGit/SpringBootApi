package com.AirSystem.Service;

import com.AirSystem.Entity.Buyer;
import com.AirSystem.Repository.BuyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BuyerServiceImp implements BuyerService{

    @Autowired
    private BuyerRepository buyerRepository;
    //create ---------------------------------------------------------------
    @Override
    public Buyer saveBuyer(Buyer buyer) {

        return buyerRepository.save(buyer);
    }
    //All Data--------------------------------------------------------------
    @Override
    public List<Buyer> getAllBuyer() {
        return buyerRepository.findAll();
    }

    //getOneDataByeId-------------------------------------------------------
    @Override
    public Buyer getBuyerbybuyerId(Long buyerId) {

        return buyerRepository.findById(buyerId).get();
    }
    //Delete Data-------------------------------------------------------------
    @Override
    public void deleteBuyerinfoById(Long buyerId) {
        buyerRepository.deleteById(buyerId);

    }
    //Update Data-------------------------------------------------------------
    @Override
    public void UpdateBuyerinfoById(Long buyerId, Buyer buyer) {

        Buyer b = buyerRepository.findById(buyerId).get();
        if(Objects.nonNull(buyer.getBuyerName())&& !"".equalsIgnoreCase(buyer.getBuyerName()))
        {
            b.setBuyerName(buyer.getBuyerName());
        }
        if(Objects.nonNull(buyer.getBuyerEmail())&& !"".equalsIgnoreCase(buyer.getBuyerEmail()))
        {
            b.setBuyerEmail((buyer.getBuyerEmail()));
        }
        if(Objects.nonNull(buyer.getBuyerPassword())&& !"".equalsIgnoreCase(buyer.getBuyerPassword()))
        {
            b.setBuyerPassword(buyer.getBuyerPassword());
        }

         buyerRepository.save(b);

    }






}
