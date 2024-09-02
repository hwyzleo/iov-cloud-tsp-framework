package net.hwyz.iov.cloud.tsp.framework.commons.exception;

/**
 * 入参无效异常
 *
 * @author hwyz_leo
 */
public class InputParamInvalidException extends BaseException {

    /**
     * 错误码
     */
    public static final int ERROR_CODE = 100001;


    public InputParamInvalidException(String message) {
        super(ERROR_CODE, message);
    }

}
