package idn.code.movies.utils;

import idn.code.movies.dto.BaseResponseDto;
import org.springframework.stereotype.Component;

@Component

public class ResponseUtil {

    public static  <T> BaseResponseDto<T> success(T result){
        BaseResponseDto<T> response = new BaseResponseDto<>();
        response.setErrorCode("00");
        response.setSourceSystem("idn_code");
        response.setMessage("success");
        response.setResult(result);
        return response;
    }
}
