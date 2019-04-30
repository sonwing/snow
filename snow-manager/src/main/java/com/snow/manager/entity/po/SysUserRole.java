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
public class SysUserRole extends BaseEntity {
    private static final long serialVersionUID = 1239869824492495117L;

    private String sysUserId;

    private String sysRoleId;


}