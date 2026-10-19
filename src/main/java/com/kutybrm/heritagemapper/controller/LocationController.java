package com.kutybrm.heritagemapper.controller;

import com.kutybrm.heritagemapper.entity.Location;
import com.kutybrm.heritagemapper.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locations")
@RequiredArgsConstructor
public class LocationController {

    private final LocationService locationService;

    @GetMapping
    public List<Location> getAllLocations() {
        return locationService.getAllLocations();
    }

    @PostMapping
    public Location createLocation(@RequestBody Location location) {
        return locationService.saveLocation(location);
    }
}