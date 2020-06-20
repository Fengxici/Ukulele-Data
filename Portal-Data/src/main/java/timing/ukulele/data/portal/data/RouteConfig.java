package timing.ukulele.data.portal.data;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @author fengxici
 */
@Data
public class RouteConfig implements Serializable {

    private String path;
    private String component;
    private String name;
    private String components;
    private String redirect;
    private String props;
    private String alias;
    private String children;
    private String beforeEnter;
    private Map<String, String> meta;
    private Boolean caseSensitive;
    private String pathToRegexpOptions;
}
