package com.ltq.common.exception;

import com.ltq.common.enums.ExceptionEnum;
import lombok.Data;

/**
 * @Author: liutieqiang
 * @Date: 2019-12-23 11:27
 * @Description:  leyou项目自定义异常
 *  不能继承Exception,ItemController使用时编译报错,unhandled exception
 */
@Data
public class LyException extends RuntimeException {
    /**响应状态码
     */
    private Integer status;

    public LyException(Integer status,String message) {
        super(message);
        this.status = status;
    }

    public LyException(Integer status,String message, Throwable cause) {
        super(message, cause);
        this.status = status;
    }

    public LyException(ExceptionEnum em,Throwable cause) {
        super(em.getMessage(), cause);
        this.status = em.getStatus();
    }
    public LyException(ExceptionEnum em) {
        super(em.getMessage());
        this.status = em.getStatus();
    }
}
