package timing.ukulele.data.portal.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import timing.ukulele.common.data.TreeNode;

/**
 * 部门树
 * @author fengxici
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DeptTree extends TreeNode {
    private String name;
    private Integer orderNum;
}
