package idn.code.movies.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponseDto<T> extends StatusResponseDto implements Serializable {
    private T result;
}
