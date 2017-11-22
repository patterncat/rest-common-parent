package cn.patterncat.rest;

import lombok.ToString;

/**
 * Created by patterncat on 2017-11-22.
 */
@ToString
public class ApiResult<T> {

    private boolean success;

    private T data;

    private String message;

    private Integer errorCode;

    public ApiResult() {
    }

    public static ApiResult success(){
        ApiResult result = new ApiResult();
        result.setSuccess(true);
        return result;
    }

    public static <T> ApiResult<T> success(T data){
        ApiResult<T> result = new ApiResult();
        result.setSuccess(true);
        result.setData(data);
        return result;
    }

    public static ApiResult successWithMsg(String message){
        ApiResult result = new ApiResult();
        result.setSuccess(true);
        result.setMessage(message);
        return result;
    }

    public static ApiResult fail(String message){
        ApiResult result = new ApiResult();
        result.setSuccess(false);
        result.setMessage(message);
        return result;
    }

    public static ApiResult fail(int errorCode,String message){
        ApiResult result = new ApiResult();
        result.setSuccess(false);
        result.setErrorCode(errorCode);
        result.setMessage(message);
        return result;
    }

    public static <T> ApiResult fail(T data,int errorCode){
        ApiResult<T> result = new ApiResult();
        result.setSuccess(false);
        result.setData(data);
        result.setErrorCode(errorCode);
        return result;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }
}
