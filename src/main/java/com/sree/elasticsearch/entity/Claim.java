package com.sree.elasticsearch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "claim_index")
public class Claim {

    private Integer id;
    private String claimName;
    private String claimType;
    private BigDecimal claimTotalAmount;
    private BigDecimal claimRequestedAmount;
}
