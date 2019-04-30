package com.snow.common.entity;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
/**
 * @author snow
 */
@Getter
@Setter
@ToString
public class BaseEntity implements java.io.Serializable {
    private String id;

    private Date create_time;

    private Date modify_time;
}
