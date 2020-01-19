package timing.ukulele.data.user.view;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 系统用户
 */
@Data
public class UserVO implements Serializable {
    /**
     * 主键ID
     */
    private Long id;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 修改时间
     */
    private Date updateTime;
    /**
     * 0-正常，1-删除
     */
    private Boolean deleted;
    /**
     * 简介
     */
    private String phone;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 标签
     */
    private List<String> label;

    /**
     * 第三方平台账户标识 如openId
     */
    private String platId;

    /**
     * 第三方平台类型 1小程序
     */
    private Integer plat;
}
