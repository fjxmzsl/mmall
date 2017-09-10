package com.mmall.common;

import com.google.common.collect.Sets;
import org.apache.commons.lang3.StringUtils;

import java.util.Set;

/**
 * Created by zsl on 2017/9/2.
 */
public class Const {
	public static final String CURRENT_USER="currentUser";
	public static final String EMAIL="email";
	public static final String USERNAME="username";

	public interface ProductListOrderBy{
		Set<String> PRICE_ASC_DESC= Sets.newHashSet("price_desc","price_asc");
	}

	public interface Role{
		int ROLE_CUSTOMER=0;//普通用户
		int ROLE_ADMIN=1;//管理员
	}

	public enum ProductStatusEnum{
		ON_SALE(1,"在线");
		private String value;
		private int code;
		ProductStatusEnum(int code,String value){
			this.code=code;
			this.value=value;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public int getCode() {
			return code;
		}

		public void setCode(int code) {
			this.code = code;
		}
	}

}
