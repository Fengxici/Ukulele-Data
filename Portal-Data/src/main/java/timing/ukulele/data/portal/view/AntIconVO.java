package timing.ukulele.data.portal.view;

import lombok.Data;

import java.io.Serializable;

/**
 * @author fengxici
 */
@Data
public class AntIconVO implements Serializable {
    private Long id;
    private Boolean enable;
    private String type;
    private String value;
    private String theme;
    private Boolean spin;
    private String twoToneColor;
    private String iconfont;
}
