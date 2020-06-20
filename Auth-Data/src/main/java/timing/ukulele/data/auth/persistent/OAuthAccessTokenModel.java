package timing.ukulele.data.auth.persistent;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author fengxici
 */
@Data
@TableName("oauth_access_token")
public class OAuthAccessTokenModel {
    private String tokenId;
    private byte[] token;
    private String authenticationId;
    private String userName;
    private String clientId;
    private String authentication;
    private String refreshToken;
}
