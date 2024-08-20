package com.sree.elasticsearch.service;

import com.sree.elasticsearch.entity.Claim;
import com.sree.elasticsearch.repository.ClaimRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClaimService {

    private final ClaimRepository claimRepository;

    public Claim saveClaim(Claim claim) {
        return claimRepository.save(claim);
    }

    public Iterable<Claim> getAllClaims() {
        return claimRepository.findAll();
    }

}
