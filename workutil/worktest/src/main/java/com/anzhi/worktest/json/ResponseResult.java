package com.anzhi.worktest.json;

import java.io.Serializable;

public class ResponseResult<T> implements Serializable {
    private static final long serialVersionUID = 556345600190203429L;
    private ResponseResult.Status status;
    private String message;
    private T data;

    public ResponseResult() {
    }

    public ResponseResult(ResponseResult.Status status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseResult(ResponseResult.Status status) {
        this.status = status;
    }

    public ResponseResult(ResponseResult.Status status, T data) {
        this.status = status;
        this.data = data;
    }

    public static <T> ResponseResult<T> serverError(String message) {
        return new ResponseResult(ResponseResult.Status.SERVER_ERROR, message);
    }

    public ResponseResult<T> multipleChoices(String message) {
        return new ResponseResult(ResponseResult.Status.MULTIPLE_CHOICES, message);
    }

    public static <T> ResponseResult<T> badRequest(String message) {
        return new ResponseResult(ResponseResult.Status.BAD_REQUEST, message);
    }

    public static <T> ResponseResult<T> success() {
        return new ResponseResult(ResponseResult.Status.SUCCESS);
    }

    public static <T> ResponseResult<T> success(T data) {
        return new ResponseResult(ResponseResult.Status.SUCCESS, data);
    }

    public ResponseResult.Status getStatus() {
        return this.status;
    }

    public void setStatus(ResponseResult.Status status) {
        this.status = status;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String toString() {
        return "ResponseResult [status=" + this.status + ", message='" + this.message + '\'' + ", data=" + this.data + ']';
    }

    public static enum Status implements ValueEnum<Integer> {
        SUCCESS(200),
        MULTIPLE_CHOICES(300),
        BAD_REQUEST(400),
        SERVER_ERROR(500);

        private int code;

        private Status(int code) {
            this.code = code;
        }

        public Integer getCode() {
            return this.code;
        }
    }
}

