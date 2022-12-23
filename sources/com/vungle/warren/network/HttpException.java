package com.vungle.warren.network;

public class HttpException extends RuntimeException {
    private final int code;
    private final String message;
}
