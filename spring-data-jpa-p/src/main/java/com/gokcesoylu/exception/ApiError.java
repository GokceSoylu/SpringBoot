package com.gokcesoylu.exception;

import java.sql.Date;
import java.util.Map;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiError {
    private String id;
    private Date errorTime;
    private Map<String, List<String>> errors;
}
