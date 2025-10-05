package com.gokcesoylu.dto;

import java.sql.Date;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudentIU {
    @NotEmpty
    @NotBlank(message = "name can not be empty")
    @Size(min = 2, max = 50, message = "isim uzunluğu 2 ila 50 karakter arasında olmalıdır")
    private String firstname;

    @NotEmpty
    @NotBlank(message = "surname can not be empty")
    @Size(min = 2, max = 50, message = "soy isim uzunluğu 2 ila 50 karakter arasında olmalıdır")
    private String lastname;
    private Date birthOfDate;
}
