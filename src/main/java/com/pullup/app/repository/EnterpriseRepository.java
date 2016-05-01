package com.pullup.app.repository;

import com.pullup.app.entity.Enterprise;
import com.pullup.app.entity.PullupPlan;

public interface EnterpriseRepository {
	public void add(Enterprise enterprise);
	public Enterprise get(String name);
        public void addPullupPlan(PullupPlan plan); 
}
