package timing.ukulele.data.portal.view;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 字典索引对象
 * @author fengxici
 */
@Data
public class DictIndexVO  implements Serializable {
    /**
     * 主键
     */
    private Long id;
    /**
     * 索引键名
     */
    private String key;
    /**
     * 索引键名称
     */
    private String name;
    /**
     * 启警用
     */
    private Boolean enable;
    /**
     * 字典列表
     */
    private List<DictVO> dictList;
}
