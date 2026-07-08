package com.hilcoe.MiniCloud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bucket_access")
public class BucketAccess extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "access_id")
    private Long accessId;

    @ManyToOne
    @JoinColumn(name = "bucket_id")
    private Bucket bucket;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "permission")
    private String permission;

    public BucketAccess() {
    }

    public BucketAccess(Bucket bucket, User user, String permission) {
        this.bucket = bucket;
        this.user = user;
        this.permission = permission;
    }

    public Long getAccessId() {
        return accessId;
    }

    public void setAccessId(Long accessId) {
        this.accessId = accessId;
    }

    public Bucket getBucket() {
        return bucket;
    }

    public void setBucket(Bucket bucket) {
        this.bucket = bucket;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
