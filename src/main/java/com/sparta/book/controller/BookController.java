package com.sparta.book.controller;

import com.sparta.book.dto.BookRequestDto;
import com.sparta.book.dto.BookResponseDto;
import com.sparta.book.entity.Book;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BookController {

    private final Map<Long, Book> bookList = new HashMap<>(); // 독서 기록 번호를 key로, Book 객체를 value로 저장합니다.
    private Long nextId = 1L; // 새 독서 기록에 자동으로 부여할 다음 번호입니다.

    @PostMapping("/books")
    public BookResponseDto createBook(@RequestBody BookRequestDto requestDto) {
        Book book = new Book(requestDto);

        book.setId(nextId);
        nextId++;

        bookList.put(book.getId(), book);

        return new BookResponseDto(book);
    }

    @GetMapping("/books")
    public List<BookResponseDto> getBooks() {
        return bookList.values().stream()
                .map(BookResponseDto::new)
                .toList();
    }
}