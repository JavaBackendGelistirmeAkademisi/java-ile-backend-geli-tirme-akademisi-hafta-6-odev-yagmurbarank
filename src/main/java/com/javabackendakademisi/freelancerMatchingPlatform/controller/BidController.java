package com.javabackendakademisi.freelancerMatchingPlatform.controller;

import com.javabackendakademisi.freelancerMatchingPlatform.model.Bid;
import com.javabackendakademisi.freelancerMatchingPlatform.model.request.BidRequestDTO;
import com.javabackendakademisi.freelancerMatchingPlatform.service.BidService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bids")
public class BidController {
@Autowired
    private BidService bidService;
@PostMapping
    public ResponseEntity<Bid> createBid(@RequestBody BidRequestDTO bidRequestDTO){
    Bid bid= new Bid();
    bid.setAmount(bidRequestDTO.getAmount());
    return new ResponseEntity<>(bid, HttpStatus.CREATED);
}
    @GetMapping("/{id}")
    public ResponseEntity<Bid> getBidById(@PathVariable Long id) {
        Bid bid = bidService.getBidById(id);
        return new ResponseEntity<>(bid, HttpStatus.OK);
    }
}
