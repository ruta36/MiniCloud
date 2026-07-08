package com.hilcoe.MiniCloud.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "files")
public class File {

    @Id
    @GeneratedValue
    @Column(name = "file_id")
    private UUID fileId;

    @ManyToOne
    @JoinColumn(name = "bucket_id")
    private Bucket bucket;

    @Column(name = "object_key")
    private String objectKey;

    @OneToOne
    @JoinColumn(name = "current_version_id")
    private FileVersion currentVersion;

    @Column(name = "is_deleted")
    private boolean deleted;

    @OneToMany(mappedBy = "file", cascade = CascadeType.ALL)
    private List<FileVersion> versions = new ArrayList<>();

    @OneToMany(mappedBy = "file", cascade = CascadeType.ALL)
    private List<FileTag> fileTags = new ArrayList<>();

    @OneToMany(mappedBy = "file", cascade = CascadeType.ALL)
    private List<Share> shares = new ArrayList<>();

    public File() {
    }

    public File(Bucket bucket, String objectKey) {
        this.bucket = bucket;
        this.objectKey = objectKey;
    }

    public UUID getFileId() {
        return fileId;
    }

    public void setFileId(UUID fileId) {
        this.fileId = fileId;
    }

    public Bucket getBucket() {
        return bucket;
    }

    public void setBucket(Bucket bucket) {
        this.bucket = bucket;
    }

    public String getObjectKey() {
        return objectKey;
    }

    public void setObjectKey(String objectKey) {
        this.objectKey = objectKey;
    }

    public FileVersion getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(FileVersion currentVersion) {
        this.currentVersion = currentVersion;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public List<FileVersion> getVersions() {
        return versions;
    }

    public void setVersions(List<FileVersion> versions) {
        this.versions = versions;
    }

    public List<FileTag> getFileTags() {
        return fileTags;
    }

    public void setFileTags(List<FileTag> fileTags) {
        this.fileTags = fileTags;
    }

    public List<Share> getShares() {
        return shares;
    }

    public void setShares(List<Share> shares) {
        this.shares = shares;
    }

    public void addVersion(FileVersion version) {
        versions.add(version);
        version.setFile(this);
    }

    public void removeVersion(FileVersion version) {
        versions.remove(version);
        version.setFile(null);
    }

    public void addShare(Share share) {
        shares.add(share);
        share.setFile(this);
    }

    public void removeShare(Share share) {
        shares.remove(share);
        share.setFile(null);
    }
}

