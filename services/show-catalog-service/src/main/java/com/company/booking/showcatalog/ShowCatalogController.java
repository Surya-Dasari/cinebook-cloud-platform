package com.company.booking.showcatalog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/shows")
public class ShowCatalogController {

    @GetMapping("/health")
    public String health() {
        return "Show Catalog Service is running";
    }

    @GetMapping
    public String listShows() {
        return "List of movie shows";
    }
}

