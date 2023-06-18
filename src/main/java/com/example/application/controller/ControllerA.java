package com.example.application.controller;

import com.example.application.resource.Contes;
import com.example.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * http://localhost:8080/controller で呼び出せる
 */
@RestController
@RequestMapping("/controller")
@RequiredArgsConstructor
public class ControllerA {

    private final UserService userService;

    /**
     * GETメソッド
     * http://localhost:8080/controller/get_method で呼び出せる
     *
     * @param param1 URL リクエストで ?get_param=~ で受信できるパラメータ
     */
    @GetMapping("/get_method")
    public String getA(@RequestParam("get_param") String param1) {
        // テスト用のURL
        // http://localhost:8080/controller/get_method?get_param=test
        return "get メソッドのレスポンス_param->" + param1;
    }

    /**
     * POSTメソッド
     *
     * @param contes　URL リクエストで ?post_param=~ で送信できるパラメータ
     */
    @PostMapping(value = "/post_method", produces = "text/csv; charset=Shift_JIS")
    public String postMethod(@ModelAttribute Contes contes) {
        // テスト用のURL
        // http://localhost:8080/controller/post_method?post_param=test

        // テーブルに登録する.
        return userService.setMyTable(contes);
    }
}
