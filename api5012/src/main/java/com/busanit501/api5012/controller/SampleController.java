package com.busanit501.api5012.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/sample") // API 엔드포인트 기본 경로 설정
public class SampleController {

    @Tag(name = "샘플 레스트",
            description = "AAA, BBB, CCC 출력 테스트")
    @GetMapping("/doA") // GET 요청 처리 경로
    public List<String> doA() {
        // 문자열 리스트 반환
        return Arrays.asList("AAA", "BBB", "CCC");
    }
}




