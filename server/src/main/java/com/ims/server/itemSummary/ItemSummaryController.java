package com.ims.server.itemSummary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ItemSummaryController {
    @Autowired
    private ItemSummaryRepository itemSummaryRepository;

    @GetMapping("/items/summary")
    public List<ItemSummary> getAllItems() {
        return itemSummaryRepository.findAll();
    }
}
