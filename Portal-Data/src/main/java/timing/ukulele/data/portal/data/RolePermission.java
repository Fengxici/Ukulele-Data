package timing.ukulele.data.portal.data;

import lombok.Data;

import java.util.List;

@Data
public class RolePermission {
    private List<String> acl;
    private List<String> ability;
}
