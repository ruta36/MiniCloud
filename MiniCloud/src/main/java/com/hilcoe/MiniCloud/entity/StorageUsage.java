package com.hilcoe.MiniCloud.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "storage_usage")
public class StorageUsage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usage_id")
    private Long usageId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "total_bytes_used")
    private Long totalBytesUsed;

    @Column(name = "recorded_at")
    private LocalDateTime recordedAt;

    public StorageUsage() {
    }

    public StorageUsage(User user,
                        Long totalBytesUsed,
                        LocalDateTime recordedAt) {
        this.user = user;
        this.totalBytesUsed = totalBytesUsed;
        this.recordedAt = recordedAt;
    }

    public Long getUsageId() {
        return usageId;
    }

    public void setUsageId(Long usageId) {
        this.usageId = usageId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getTotalBytesUsed() {
        return totalBytesUsed;
    }

    public void setTotalBytesUsed(Long totalBytesUsed) {
        this.totalBytesUsed = totalBytesUsed;
    }

    public LocalDateTime getRecordedAt() {
        return recordedAt;
    }

    public void setRecordedAt(LocalDateTime recordedAt) {
        this.recordedAt = recordedAt;
    }
}
