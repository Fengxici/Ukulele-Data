.package timing.ukulele.data.portal.data;

import lombok.Data;

import java.util.List;

/**
 * •角色权限数据
 * •@className: RolePermission
 * •@author: 吕自聪
 * •@date: 2019/9/27
 */
@Data
public class RolePermission {
    private List<String> acl;
    private List<String> ability;
}
