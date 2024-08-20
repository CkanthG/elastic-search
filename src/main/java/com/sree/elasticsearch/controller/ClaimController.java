package com.sree.elasticsearch.controller;

import com.sree.elasticsearch.entity.Claim;
import com.sree.elasticsearch.service.ClaimService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/elasticsearch")
@RequiredArgsConstructor
public class ClaimController {

    private final ClaimService claimService;

    @PostMapping
    public ResponseEntity<Claim> saveClaim(Claim claim) {
        return ResponseEntity.ok(claimService.saveClaim(claim));
    }

    @GetMapping
    public ResponseEntity<Iterable<Claim>> getClaims() {
        return ResponseEntity.ok(claimService.getAllClaims());
    }

}
