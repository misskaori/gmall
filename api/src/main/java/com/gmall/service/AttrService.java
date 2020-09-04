package com.gmall.service;

import com.gmall.bean.PmsBaseAttrInfo;
import com.gmall.bean.PmsBaseAttrValue;
import com.gmall.bean.PmsBaseSaleAttr;
import com.gmall.bean.PmsProductSaleAttr;

import java.util.List;
import java.util.Set;

public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(String catalog3Id);

    List<PmsBaseAttrValue> attrValueList(String attrId);

    String saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseSaleAttr> baeSaleAttrList();

    List<PmsBaseAttrInfo> getAttrValueListByValueId(Set<String> valueIdSet);
}
