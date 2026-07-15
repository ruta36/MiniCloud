package com.hilcoe.MiniCloud.dao;

import java.util.List;
import java.util.UUID;

import com.hilcoe.MiniCloud.entity.Share;

public interface ShareDAO {
	
	Share createShare(UUID fileId);

	Share getShare(UUID id);

	void revokeShare(UUID id);

	List<Share> getShares();


}
