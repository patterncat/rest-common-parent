package com.example.demo;

import cn.patterncat.rest.ApiResult;
import org.junit.Test;

import java.util.Collections;

/**
 * Created by patterncat on 2017-11-22.
 */
public class ResultTest {

    @Test
    public void testResult(){
        System.out.println(ApiResult.success());
        System.out.println(ApiResult.fail(500));
        System.out.println(ApiResult.fail("error"));
        System.out.println(ApiResult.fail(400,"bad request"));
        System.out.println(ApiResult.fail("content",400));
        System.out.println(ApiResult.success(Collections.emptyList()));
        System.out.println(ApiResult.success("hello"));
        System.out.println(ApiResult.successWithMsg("hello"));
    }
}
