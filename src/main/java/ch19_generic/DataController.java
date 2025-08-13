package ch19_generic;

import lombok.Data;

import java.util.Date;

public class DataController {
    public static void main(String[] args) {
        Date now = new Date();

        ResponseData responseData1 = new ResponseData("날씨 저장 성공",now.toString());
        System.out.println(responseData1);

        ResponseData responseData2 = new ResponseData<>("나이저장 성공  ",38);
        System.out.println(responseData2);
    }
}
