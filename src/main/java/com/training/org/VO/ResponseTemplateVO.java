package com.training.org.VO;
import java.util.List;

import com.training.org.entities.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private User user;
    private Department department;
    private List<Technology> technologies;
}

