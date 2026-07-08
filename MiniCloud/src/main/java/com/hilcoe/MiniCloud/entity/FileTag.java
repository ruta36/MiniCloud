package com.hilcoe.MiniCloud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "file_tags")
public class FileTag {

    @EmbeddedId
    private FileTagId id;

    @ManyToOne
    @MapsId("fileId")
    @JoinColumn(name = "file_id")
    private File file;

    @ManyToOne
    @MapsId("tagId")
    @JoinColumn(name = "tag_id")
    private Tag tag;

    public FileTag() {
    }

    public FileTag(File file, Tag tag) {
        this.file = file;
        this.tag = tag;
    }

    public FileTagId getId() {
        return id;
    }

    public void setId(FileTagId id) {
        this.id = id;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}
