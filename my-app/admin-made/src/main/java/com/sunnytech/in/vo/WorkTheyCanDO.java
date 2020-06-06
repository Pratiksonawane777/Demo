package com.sunnytech.in.vo;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "workDo")
public class WorkTheyCanDO {

        String userId;
        Boolean houseWork;
        Boolean utensilWashing;
        Boolean clothWashing;
        Boolean ironClothes;
        Boolean cookingHelp;
        Boolean vegetableShopping;
        Boolean moppingFloor;
        Boolean cobWebCleaning;
        Boolean washRoomCleaning;
        Boolean dustingCleaningAndMore;

}
