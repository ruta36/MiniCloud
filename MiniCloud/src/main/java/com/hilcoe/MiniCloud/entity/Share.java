package com.hilcoe.MiniCloud.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "shares")
public class Share extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "share_id")
    private UUID shareId;

    @ManyToOne
    @JoinColumn(name = "file_id")
    private File file;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private User createdBy;

    @Column(name = "share_token", unique = true)
    private String shareToken;

    @Column(name = "expires_at")
    private LocalDateTime expiresAt;

    @Column(name = "max_downloads")
    private Integer maxDownloads;

    @Column(name = "can_edit")
    private Boolean canEdit;

    public Share() {
    }
    
	public Share(UUID shareId, File file, User createdBy, String shareToken, LocalDateTime expiresAt,
			Integer maxDownloads, Boolean canEdit) {
		super();
		this.shareId = shareId;
		this.file = file;
		this.createdBy = createdBy;
		this.shareToken = shareToken;
		this.expiresAt = expiresAt;
		this.maxDownloads = maxDownloads;
		this.canEdit = canEdit;
	}

	public UUID getShareId() {
		return shareId;
	}

	public void setShareId(UUID shareId) {
		this.shareId = shareId;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public User getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(User createdBy) {
		this.createdBy = createdBy;
	}

	public String getShareToken() {
		return shareToken;
	}

	public void setShareToken(String shareToken) {
		this.shareToken = shareToken;
	}

	public LocalDateTime getExpiresAt() {
		return expiresAt;
	}

	public void setExpiresAt(LocalDateTime expiresAt) {
		this.expiresAt = expiresAt;
	}

	public Integer getMaxDownloads() {
		return maxDownloads;
	}

	public void setMaxDownloads(Integer maxDownloads) {
		this.maxDownloads = maxDownloads;
	}

	public Boolean getCanEdit() {
		return canEdit;
	}

	public void setCanEdit(Boolean canEdit) {
		this.canEdit = canEdit;
	}
    
	
    
}
