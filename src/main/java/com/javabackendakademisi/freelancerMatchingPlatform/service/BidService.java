package com.javabackendakademisi.freelancerMatchingPlatform.service;

import com.javabackendakademisi.freelancerMatchingPlatform.model.Bid;
import com.javabackendakademisi.freelancerMatchingPlatform.repository.BidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BidService {
@Autowired
    private BidRepository bidRepository;
public Bid createBid(Bid bid){
    return bidRepository.save(bid);
}
public List<Bid> getAllBids(){
    return bidRepository.findAll();
}
public Bid getBidById(Long Id){
    return bidRepository.findById(Id).orElse(null);
}
}
