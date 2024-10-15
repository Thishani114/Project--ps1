package com.example.placementservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlacementController {

    @Autowired
    private PlacementService placementService;

    @GetMapping("/placement")
    public List<Placement> getAllPlacements() {
        return placementService.getAllPlacements();
    }

    @GetMapping("/placement/{id}")
    public Placement getPlacementById(@PathVariable Long id) {
        return placementService.getPlacementById(id).orElse(null);
    }

    @PostMapping("/placement")
    public Placement createPlacement(@RequestBody Placement placement) {
        return placementService.createPlacement(placement);
    }

    @DeleteMapping("/placement/{id}")
    public void deletePlacement(@PathVariable Long id) {
        placementService.deletePlacement(id);
    }
}
