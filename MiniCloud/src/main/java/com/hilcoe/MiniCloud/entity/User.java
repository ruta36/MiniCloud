package com.hilcoe.MiniCloud.entity;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private UUID userId;

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String email;

    @Column(name="password_hash")
    private String passwordHash;

    @Column(name="storage_quota_bytes")
    private Long storageQuotaBytes;

    @OneToMany(mappedBy="user",cascade=CascadeType.ALL)
    private List<UserRole> userRoles=new ArrayList<>();

    @OneToMany(mappedBy="user",cascade=CascadeType.ALL)
    private List<RefreshToken> refreshTokens=new ArrayList<>();

    @OneToMany(mappedBy="owner",cascade=CascadeType.ALL)
    private List<Bucket> buckets=new ArrayList<>();

    @OneToMany(mappedBy="createdBy",cascade=CascadeType.ALL)
    private List<Share> shares=new ArrayList<>();

    @OneToMany(mappedBy="user",cascade=CascadeType.ALL)
    private List<ActivityLog> activityLogs=new ArrayList<>();

    @OneToMany(mappedBy="user",cascade=CascadeType.ALL)
    private List<StorageUsage> storageUsages=new ArrayList<>();

    @OneToMany(mappedBy="user",cascade=CascadeType.ALL)
    private List<BucketAccess> bucketAccesses=new ArrayList<>();

    public User(){}

    public User(String username,String email,String passwordHash,Long storageQuotaBytes){
        this.username=username;
        this.email=email;
        this.passwordHash=passwordHash;
        this.storageQuotaBytes=storageQuotaBytes;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId=userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public String getPasswordHash(){
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash){
        this.passwordHash=passwordHash;
    }

    public Long getStorageQuotaBytes(){
        return storageQuotaBytes;
    }

    public void setStorageQuotaBytes(Long storageQuotaBytes){
        this.storageQuotaBytes=storageQuotaBytes;
    }

    public List<UserRole> getUserRoles(){
        return userRoles;
    }

    public void setUserRoles(List<UserRole> userRoles){
        this.userRoles=userRoles;
    }

    public List<RefreshToken> getRefreshTokens(){
        return refreshTokens;
    }

    public void setRefreshTokens(List<RefreshToken> refreshTokens){
        this.refreshTokens=refreshTokens;
    }

    public List<Bucket> getBuckets(){
        return buckets;
    }

    public void setBuckets(List<Bucket> buckets){
        this.buckets=buckets;
    }

    public List<Share> getShares(){
        return shares;
    }

    public void setShares(List<Share> shares){
        this.shares=shares;
    }

    public List<ActivityLog> getActivityLogs(){
        return activityLogs;
    }

    public void setActivityLogs(List<ActivityLog> activityLogs){
        this.activityLogs=activityLogs;
    }

    public List<StorageUsage> getStorageUsages(){
        return storageUsages;
    }

    public void setStorageUsages(List<StorageUsage> storageUsages){
        this.storageUsages=storageUsages;
    }

    public List<BucketAccess> getBucketAccesses(){
        return bucketAccesses;
    }

    public void setBucketAccesses(List<BucketAccess> bucketAccesses){
        this.bucketAccesses=bucketAccesses;
    }
}
