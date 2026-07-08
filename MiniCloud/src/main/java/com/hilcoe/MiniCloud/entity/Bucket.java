package com.hilcoe.MiniCloud.entity;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "buckets")
public class Bucket {

    @Id
    @GeneratedValue
    @Column(name = "bucket_id")
    private UUID bucketId;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;

    @Column(nullable = false)
    private String name;

    @Column(name = "is_public")
    private boolean isPublic;

    @OneToMany(mappedBy = "bucket", cascade = CascadeType.ALL)
    private List<File> files = new ArrayList<>();

    @OneToMany(mappedBy = "bucket", cascade = CascadeType.ALL)
    private List<BucketAccess> bucketAccesses = new ArrayList<>();

    public Bucket() {
    }

    public Bucket(User owner, String name, boolean isPublic) {
        this.owner = owner;
        this.name = name;
        this.isPublic = isPublic;
    }

    public UUID getBucketId() {
        return bucketId;
    }

    public void setBucketId(UUID bucketId) {
        this.bucketId = bucketId;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public List<BucketAccess> getBucketAccesses() {
        return bucketAccesses;
    }

    public void setBucketAccesses(List<BucketAccess> bucketAccesses) {
        this.bucketAccesses = bucketAccesses;
    }

    public void addFile(File file) {
        files.add(file);
        file.setBucket(this);
    }

    public void removeFile(File file) {
        files.remove(file);
        file.setBucket(null);
    }
}

