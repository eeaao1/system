package biz.controller;

import biz.dao.mappers.entity.Crop;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController("/biz/crop")
public class CropManageController {

    @PostMapping("addCrop")
    public String addCrop(@RequestBody Crop crop) {
        return null;
    }
}
