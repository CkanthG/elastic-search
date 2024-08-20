package com.sree.elasticsearch.repository;

import com.sree.elasticsearch.entity.Claim;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ClaimRepository extends ElasticsearchRepository<Claim, Integer> {
}
