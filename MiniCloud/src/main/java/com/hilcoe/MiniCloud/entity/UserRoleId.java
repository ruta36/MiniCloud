package com.hilcoe.MiniCloud.entity;


import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
public class UserRoleId implements Serializable {

    private UUID userId;

    private Integer roleId;

    public UserRoleId() {
    }

    public UserRoleId(UUID userId,Integer roleId){
        this.userId=userId;
        this.roleId=roleId;
    }

    public UUID getUserId(){
        return userId;
    }

    public void setUserId(UUID userId){
        this.userId=userId;
    }

    public Integer getRoleId(){
        return roleId;
    }

    public void setRoleId(Integer roleId){
        this.roleId=roleId;
    }
}