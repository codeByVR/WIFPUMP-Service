package com.wifpump.dto;

import com.wifpump.enums.Goal;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;

@Data
public class UserDTO {

    private Long id;

    @NotNull
    @Size(min = 3, max=20)
    private String username;

    @Email
    private String email;
    @Min(0)
    private Double height;
    @Min(0)
    private Double weight;
    private Goal goal;
}
