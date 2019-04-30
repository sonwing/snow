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
public class SysRolePermission  extends BaseEntity {

    private static final long serialVersionUID = -4255499931073534088L;
    private String sysRoleId;

    private String sysPermissionId;


}