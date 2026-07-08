package com.hilcoe.MiniCloud.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.UUID;

@Embeddable
public class FileTagId implements Serializable {

    private UUID fileId;

    private Integer tagId;

    public FileTagId() {
    }

    public FileTagId(UUID fileId, Integer tagId) {
        this.fileId = fileId;
        this.tagId = tagId;
    }

    public UUID getFileId() {
        return fileId;
    }

    public void setFileId(UUID fileId) {
        this.fileId = fileId;
    }

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }
}
