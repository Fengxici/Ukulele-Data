package timing.ukulele.data.auth.persistent;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author fengxici
 */
@Data
@TableName("oauth_client_details")
public class OAuthClientDetailsModel implements Serializable {
    private String clientId;
    private String resourceIds;
    private String clientSecret;
    private String scope;
    private String authorizedGrantTypes;
    private String webServerRedirectUri;
    private String authorities;
    private int accessTokenValidity;
    private int refreshTokenValidity;
    private String additionalInformation;
    private String autoapprove;
    private String name;
    @TableField(exist = false)
    private Integer pageNum;
    @TableField(exist = false)
    private Integer pageSize;
}
