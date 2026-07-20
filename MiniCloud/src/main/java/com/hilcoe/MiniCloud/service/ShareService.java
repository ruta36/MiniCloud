package com.hilcoe.MiniCloud.service;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.Share;

public interface ShareService {
	Share createShareLink(UUID fileId, UUID ownerId);

	Share getShare(UUID shareId);

	void revokeShare(UUID shareId);

	List<Share> getActiveShares();
}
