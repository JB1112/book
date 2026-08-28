package com.sparta.book.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class BookRequestDto {
    private String title; // 클라이언트가 보낸 책 제목을 받습니다.
    private String comment; // 클라이언트가 보낸 한 줄 기록을 받습니다.
}