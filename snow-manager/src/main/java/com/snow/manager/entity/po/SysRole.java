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
public class SysRole  extends BaseEntity {

    private static final long serialVersionUID = 912551348546472310L;

    private String name;

    private String available;

}