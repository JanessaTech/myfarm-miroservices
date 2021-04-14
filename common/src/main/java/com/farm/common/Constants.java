package com.farm.common;

public class Constants {
    public static final String API_RESPONSE_SUCCESS_MESSAGE_DEFAULT_KEY = "OK";
    public static final String API_RESPONSE_FAIL_MESSAGE_DEFAULT_KEY = "ERROR";
    public static final String API_RESPONSE_SUCCESS_MESSAGE_DEFAULT_VALUE = "success";
    public static final String host = "localhost";

    public enum Order{
        ASC("ASC", "升序"),
        DESC("DESC","降序");
        private String code;
        private String description;

        Order(String code, String des){
            this.code = code;
            this.description = des;
        }

        public String getCode() {
            return code;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "code='" + code + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }
    }

    //swagger related info
    public static final String API_TITLE = "农菜鲜后端api手册";
    public static final String project_description = "农菜鲜项目描述";
}
