package com.demo;

import com.demo.khh.Stream;
import java.io.*;
import cn.hutool.core.date.DateUtil;

public class Main {

    public static void main(String[] args) throws IOException  {

        System.out.println(DateUtil.today());
        Stream.bRead();
    }
}
