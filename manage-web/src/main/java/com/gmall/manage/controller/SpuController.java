package com.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gmall.bean.PmsProductImage;
import com.gmall.bean.PmsProductInfo;
import com.gmall.bean.PmsProductSaleAttr;
import com.gmall.manage.util.PmsUploadUtil;
import com.gmall.service.SpuService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@CrossOrigin
@Controller
public class SpuController {
    @Reference
    SpuService spuService;

    @RequestMapping("/spuList")
    @ResponseBody
    public List<PmsProductInfo> spuList(String catalog3Id){
        return spuService.spuList(catalog3Id);
    }

    @RequestMapping("/saveSpuInfo")
    @ResponseBody
    public String saveSpuInfo(@RequestBody PmsProductInfo pmsProductInfo){
        return spuService.saveSpuInfo(pmsProductInfo);
    }

    @RequestMapping("/fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("file") MultipartFile multipartFile){
        String imgUrl = PmsUploadUtil.uploadImage(multipartFile);
        System.out.println(imgUrl);
        return imgUrl;
    }
    @RequestMapping("/spuSaleAttrList")
    @ResponseBody
    public List<PmsProductSaleAttr> spuSaleAttrList(String spuId){
        List<PmsProductSaleAttr> pmsProductSaleAttrs = spuService.spuSaleAttrList(spuId);
        return pmsProductSaleAttrs;
    }
    @RequestMapping("spuImageList")
    @ResponseBody
    public List<PmsProductImage> spuImageList(String spuId){

        List<PmsProductImage> pmsProductImages = spuService.spuImageList(spuId);
        return pmsProductImages;
    }

}
