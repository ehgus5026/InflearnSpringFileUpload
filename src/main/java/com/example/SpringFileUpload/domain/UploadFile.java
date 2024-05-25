package com.example.SpringFileUpload.domain;

import lombok.Data;

@Data
public class UploadFile {

    // 서로 다른 사용자가 같은 파일 이름을 업로드 했을 때, 겹치지 않게(덮어 버리지 않게) 하기 위해서 따로 구분
    private String uploadFileName; // 사용자가 업로드한 파일명
    private String storeFileName; // 서버 내부에서 관리하는 파일명

    public UploadFile(String uploadFileName, String storeFileName) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFileName;
    }

}
