package timing.ukulele.data.portal.view;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author fengxici
 */
@Data
public class AntMenuVO implements Serializable {
    private Long id;
    private Boolean enable;
    private Long parentId;
    private String key;
    private String text;
    private String i18n;
    private Boolean group;
    private String link;
    private Boolean linkExact;
    private String externalLink;
    private String target;
    private String icon;
    private Long iconId;
    private Integer badge;
    private Boolean badgeDot;
    private String badgeStatus;
    private Boolean disabled;
    private Boolean hide;
    private Boolean hideInBreadcrumb;
    private List<String> acl;
    private Boolean shortcut;
    private Boolean shortcutRoot;
    private Boolean reuse;
    private Boolean open;
    private AntIconVO antIcon;
}
