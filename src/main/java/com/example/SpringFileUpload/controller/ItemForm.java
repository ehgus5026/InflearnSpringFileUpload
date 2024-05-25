package com.example.SpringFileUpload.controller;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

// 상품 저장용 폼
@Data
public class ItemForm {

    private Long itemId;
    private String itemName;
    private MultipartFile attachFile; // 첨부 파일
    private List<MultipartFile> imageFiles; // 여러 이미지 파일을 받을 수 있음.
}
