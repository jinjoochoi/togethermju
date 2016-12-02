package com.example.mathpresso.togethermju.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.io.Serializable;

/**
 * Created by choijinjoo on 2016. 11. 9..
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@DatabaseTable(tableName = "notice")
public class Notice implements Serializable {
    @DatabaseField
    private String noticeSeq;//게시물 번호
    @DatabaseField
    private String tag;// 게시물 종류
    @DatabaseField
    private String title; // 제목
    @DatabaseField
    private String content; //내용
    @DatabaseField
    private String board;//게시판 번호

    public Notice() {
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getNoticeSeq() {
        return noticeSeq;
    }

    public void setNoticeSeq(String noticeSeq) {
        this.noticeSeq = noticeSeq;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
