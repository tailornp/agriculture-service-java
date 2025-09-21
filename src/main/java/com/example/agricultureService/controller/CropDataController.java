package com.example.agricultureService.controller;

import com.example.agricultureService.model.CropData;
import com.example.agricultureService.repository.CropDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // Combines @Controller and @ResponseBody, making it ready for REST APIs
@RequestMapping("/api/crops")// All endpoints in this class will start with /api/crops
public class CropDataController {
    @Autowired
    private CropDataRepository cropDataRepository;

    /**
     * API Endpoint to insert a new product  into the database
     * HTTP Method: POST
     * URL: http://localhost:8080/api/crops
     */
    @PostMapping
    public CropData addCropData(@RequestBody CropData cropData) {
        return cropDataRepository.save(cropData);
    }

    /**
     * API Endpoint to fetch all crops data from the database
     * HTTP Method: GET
     * URL: http://localhost:8080/api/crops
     */
     @GetMapping
    public List<CropData> getAllCropData() {
        return cropDataRepository.findAll(); // retrieves all the data from cropdata database
    }
}
