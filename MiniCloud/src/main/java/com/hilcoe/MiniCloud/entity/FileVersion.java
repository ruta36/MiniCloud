package com.hilcoe.MiniCloud.entity;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "file_versions")
public class FileVersion extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "version_id")
    private UUID versionId;

    @ManyToOne
    @JoinColumn(name = "file_id")
    private File file;

    @Column(name = "version_number")
    private Integer versionNumber;

    @Column(name = "size_bytes")
    private Long sizeBytes;

    @Column(name = "storage_path")
    private String storagePath;

    @Column(name = "etag")
    private String etag;

    public FileVersion() {
    }

    public FileVersion(Integer versionNumber, Long sizeBytes,
                       String storagePath, String etag) {
        this.versionNumber = versionNumber;
        this.sizeBytes = sizeBytes;
        this.storagePath = storagePath;
        this.etag = etag;
    }

    public UUID getVersionId() {
        return versionId;
    }

    public void setVersionId(UUID versionId) {
        this.versionId = versionId;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public Integer getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    public Long getSizeBytes() {
        return sizeBytes;
    }

    public void setSizeBytes(Long sizeBytes) {
        this.sizeBytes = sizeBytes;
    }

    public String getStoragePath() {
        return storagePath;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath;
    }

    public String getEtag() {
        return etag;
    }

    public void setEtag(String etag) {
        this.etag = etag;
    }
}

