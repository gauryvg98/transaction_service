

package com.loco.assessment.transaction_service.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@JsonIgnoreProperties(
        ignoreUnknown = true
)
@JsonInclude(Include.NON_NULL)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionEntry implements Serializable {
    private Long id;
    private Long transactionId;
    private Long value;
    private String type;
    private Long parentId;
    private Long linkId;
}