package timing.ukulele.data.portal.data;

import lombok.Data;
import lombok.EqualsAndHashCode;
import timing.ukulele.common.data.TreeNode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
public class RoleMenuTree extends TreeNode {
    private String text;
    private Long roleId;
    private Boolean checked;
    private List<String> abilities;
}
