package com.example.application.controller;

import com.example.application.resource.SampleFormRequest;
import com.example.domain.service.SampleFormService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 以下の形式のリクエストを受け取りDBに登録、レスポンスを返すAPI.
 *  リクエスト形式
 *  content-type = application/x-www-form-urlencoded
 *  charset = Shift_JIS
 *
 *  レスポンス形式
 *  content-type = text/csv:
 *  charset = Shift_JIS
 */
@RestController
@RequiredArgsConstructor
public class SampleFormController {
    private final SampleFormService sampleFormService;

    /**
     * POSTメソッド.
     *
     * @param sampleFormRequest　リクエスト
     */
    @PostMapping(value = "/post_method", produces = "text/csv; charset=Shift_JIS")
    public String postMethod(@ModelAttribute SampleFormRequest sampleFormRequest) {
        // テスト用のURL
        // http://localhost:8080/controller/post_method?post_param=test

        // テーブルに登録する.
        return sampleFormService.setMyTable(sampleFormRequest);
    }
}
