package com.sparta.book.dto;

import com.sparta.book.entity.Book;
import lombok.Getter;

@Getter
public class BookResponseDto {
    private Long id; // 등록된 독서 기록 번호를 반환합니다.
    private String title; // 등록된 책 제목을 반환합니다.
    private String comment; // 등록된 한 줄 기록을 반환합니다.

    public BookResponseDto(Book book) {
        this.id = book.getId();
        this.title = book.getTitle();
        this.comment = book.getComment();
    }

}