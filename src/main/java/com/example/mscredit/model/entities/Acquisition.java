package com.example.mscredit.model.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Data
public class Acquisition {

    @Field(name = "initial")
    private double initial;

    @Field(name = "debt")
    private double debt;

    @Field(name = "cardNumber")
    private String cardNumber;

}
