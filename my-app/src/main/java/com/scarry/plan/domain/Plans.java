package com.scarry.plan.domain;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "plan")
public class Plans {

    public String product;
    public String refId;
    public String tailorId;


}
