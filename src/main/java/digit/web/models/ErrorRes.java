package digit.web.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import digit.web.models.Error;
import digit.web.models.ResponseInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;

import lombok.*;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * All APIs will return ErrorRes in case of failure which will carry ResponseInfo as metadata and Error object as actual representation of error. In case of bulk apis, some apis may chose to return the array of Error objects to indicate individual failure.
 */
@Schema(description = "All APIs will return ErrorRes in case of failure which will carry ResponseInfo as metadata and Error object as actual representation of error. In case of bulk apis, some apis may chose to return the array of Error objects to indicate individual failure.")
@Validated
@javax.annotation.Generated(value = "org.egov.codegen.SpringBootCodegen", date = "2024-03-24T02:54:00.322097571+05:30[Asia/Kolkata]")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
public class ErrorRes   {
        @JsonProperty("ResponseInfo")
          @NotNull

          @Valid
                private ResponseInfo responseInfo = null;

        @JsonProperty("Errors")
          @Valid
                private List<Error> errors = null;


        public ErrorRes addErrorsItem(Error errorsItem) {
            if (this.errors == null) {
            this.errors = new ArrayList<>();
            }
        this.errors.add(errorsItem);
        return this;
        }

}
