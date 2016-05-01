package com.pullup.app.repository;

import com.pullup.app.entity.PullerRoute;
import com.pullup.app.entity.RoutePoint;

public interface PullerRouteRepository {

    public void add(PullerRoute route);

    public PullerRoute get(String id);

    public void addRoutePoint(RoutePoint req);

    public void updatePullerRoute(String routeId, boolean onRoute);
}
