package com.mmall.service;

import com.github.pagehelper.PageInfo;
import com.mmall.common.ServerResponse;
import com.mmall.pojo.Product;
import com.mmall.vo.ProductDetailVo;

/**
 * Created by zsl on 2017/9/3.
 */
public interface IProudctService {
	ServerResponse saveorUpdateProduct(Product product);
	ServerResponse<String> setSaleStatus(Integer productId,Integer status);
	ServerResponse<ProductDetailVo> manageProductDetail(Integer productId);
	ServerResponse<PageInfo> getProductList(int pageNum, int pagesize);
	ServerResponse<PageInfo> searchProduct(String productName,Integer productId,int pageNum,int pageSize);
	ServerResponse<ProductDetailVo> getProductDetail(Integer productId);
	ServerResponse<PageInfo> getProductByKeywordCategory(String keyword,Integer categoryId,int pageNum,int pageSize,String orderBy);
}
