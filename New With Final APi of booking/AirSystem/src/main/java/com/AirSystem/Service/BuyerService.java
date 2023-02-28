package com.AirSystem.Service;

import com.AirSystem.Entity.Buyer;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface BuyerService {
    public Buyer saveBuyer( Buyer buyer);
    public List<Buyer> getAllBuyer();
    public Buyer getBuyerbybuyerId(Long buyerId);
    public void deleteBuyerinfoById(Long buyerId);
    public void UpdateBuyerinfoById(Long buyerId,Buyer buyer);

}
