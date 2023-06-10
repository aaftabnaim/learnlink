package com.example.LearnLink.db;

import com.example.LearnLink.models.Seller;
import com.example.LearnLink.repos.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SellerDB {

    private SellerRepository SellerRepository;

    @Autowired
    public SellerDB(SellerRepository SellerRepository) {
        this.SellerRepository = SellerRepository;
    }

    public List<Seller> getAllSellers() {
        return (List<Seller>) SellerRepository.findAll();
    }

    public Optional<Seller> getSellerById(Long id) {
        return SellerRepository.findById(id);
    }

    public Seller createSeller(Seller Seller) {
        return SellerRepository.save(Seller);
    }

    public Seller updateSeller(Long id, Seller Seller) {
        Seller.setId(id);
        return SellerRepository.save(Seller);
    }

    public void deleteSeller(Long id) {
        SellerRepository.deleteById(id);
    }
}
