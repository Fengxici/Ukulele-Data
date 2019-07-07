package timing.ukulele.data.portal.view;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class AntRoleMenuEditVO implements Serializable {
    private Long roleId;
    private List<RoleMenuEditVO> menuList;
}
