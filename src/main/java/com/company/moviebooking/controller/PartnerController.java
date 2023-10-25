package com.company.moviebooking.controller;

import com.company.moviebooking.model.Partner;
import com.company.moviebooking.model.ScreenLayout;
import com.company.moviebooking.model.Theatre;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PartnerController {

    @GetMapping("/partners")
    public List<Theatre> getPartners() {
        return null;//TODO
    }

    //Partner apis
    @PostMapping("/partners/add")
    public void addPartner(@RequestBody Partner partner) {
    }

    @PutMapping("/partners/update")
    public void updatePartner(@RequestBody Partner partner) {
    }

    @DeleteMapping("/partners/delete")
    public void deletePartner(@RequestBody Partner partner) {
    }

    @GetMapping("/theatres")
    public List<Theatre> getTheatresByPartnerId(@RequestParam Long partnerId) {
        return null;
    }

    @PostMapping("/addTheatre")
    public void addTheatre(@RequestBody Theatre theatre) {
    }

    @PutMapping("/updateScreenLayout")
    public void updateScreenLayout(@RequestBody ScreenLayout screenLayout){
    }
}
