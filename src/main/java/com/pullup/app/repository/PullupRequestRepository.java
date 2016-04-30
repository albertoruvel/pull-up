package com.pullup.app.repository;

import com.pullup.app.entity.PullupRequest;

public interface PullupRequestRepository {

	public void add(PullupRequest  request);
	public void get(PullupRequest request);
}
