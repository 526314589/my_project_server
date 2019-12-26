package com.ltq.common.exception_result;

import com.ltq.common.exception.LyException;
import lombok.Data;
import org.joda.time.DateTime;

/**
 * @Author: liutieqiang
 * @Date: 2019-12-23 14:08
 * @Description: 自定义异常处理结果
 */
@Data
public class ExceptionResult {
    private int status;
    private String message;
    private String timestamp;

    public ExceptionResult(LyException e) {
        this.status = e.getStatus();
        this.message = e.getMessage();
        this.timestamp = DateTime.now().toString("yyyy-MM-dd HH:mm:ss");
    }
}
