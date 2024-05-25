package com.example.SpringFileUpload.domain;

import lombok.Data;

import java.util.List;

@Data
public class Item {

    private Long id;
    private String itemName;
    private UploadFile attachFile; // 첨부 파일(사용자 업로드 순수 파일명, uuid로 감싼 서버 내부에서 관리하는 파일명)
    private List<UploadFile> imageFiles; // 여러 이미지 파일

}
