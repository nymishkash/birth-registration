package digit.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import digit.web.models.Role2;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.Builder;

/**
 * User role carries the tenant related role information for the user. A user can have multiple roles per tenant based on the need of the tenant. A user may also have multiple roles for multiple tenants.
 */
@Schema(description = "User role carries the tenant related role information for the user. A user can have multiple roles per tenant based on the need of the tenant. A user may also have multiple roles for multiple tenants.")
@Validated
@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2024-03-24T02:54:00.322097571+05:30[Asia/Kolkata]")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TenantRole   {
        @JsonProperty("tenantId")
          @NotNull

                private String tenantId = null;

        @JsonProperty("roles")
          @NotNull
          @Valid
                private List<Role2> roles = new ArrayList<>();


        public TenantRole addRolesItem(Role2 rolesItem) {
        this.roles.add(rolesItem);
        return this;
        }

}
