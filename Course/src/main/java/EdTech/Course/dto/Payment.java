package EdTech.Course.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long userId;
    private Long courseId;
    private String date;
    private Long amount;
}
