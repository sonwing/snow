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
public class SysUser extends BaseEntity {
    private static final long serialVersionUID = -3147116544756173497L;
    private String usercode;

    private String username;

    private String password;

    private String salt;

    private String locked;

}