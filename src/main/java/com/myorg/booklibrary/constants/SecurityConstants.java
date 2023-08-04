package com.myorg.booklibrary.constants;

public class SecurityConstants {
    public static final String SECRET_KEY = "bQeThWmZq4t7w!z$C&F)J@NcRfUjXn2r5u8x/A?D*G-KaPdSgVkYp3s6v9y$B&E)";
    public static final int TOKEN_EXPIRATION = 72_00_000; // 2hr in ms
    // public static final int TOKEN_EXPIRATION = 5_000;
    // 5s in ms to test auto logout
    public static final String BEARER = "Bearer ";
    public static final String AUTHORIZATION = "Authorization";
    public static final String ROLE_PREFIX = "ROLE_";
    public static final String REGISTER_PATH = "/user/register";
    public static final String RESET_PATH = "/user/reset";
}
