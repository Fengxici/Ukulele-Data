package timing.ukulele.data.user.view;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author fengxici
 */
@Data
public class ThirdPartyUserVO implements Serializable {
    private Long id;
    private Boolean deleted;
    private Date createTime;
    /**
     * 系统用户id
     */
    private Long userId;
    /**
     * 第三方用户标识，如openid
     */
    private String platId;
    /**
     * 第三方平台类型 1小程序
     */
    private Integer platSource;
}
