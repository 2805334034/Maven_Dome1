package com.smbms.controller.dataFormat;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String s) {
        // 将日期串转换成日期格式（格式是yyyy-MM-dd）
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            //返回上述格式的Date类型对象
            return simpleDateFormat.parse(s);
        }catch (ParseException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}