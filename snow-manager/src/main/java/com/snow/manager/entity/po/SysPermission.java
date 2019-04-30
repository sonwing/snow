package com.snow.manager.entity.po;

import com.snow.common.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author snow
 */
@Getter
@Setter
@ToString
public class SysPermission  extends BaseEntity {

    private static final long serialVersionUID = -6513030021537671601L;
    private String name;

    private String type;

    private String url;

    private String percode;

    private Long parentid;

    private String parentids;

    private String sortstring;

    private String available;


}