package com.example.demo.domain.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="ユーザ情報", description="1ユーザ情報を保持します。")
public class User implements Serializable {

	@ApiModelProperty(value = "ユーザを一意に特定するID")
	String id;

	@ApiModelProperty(value = "ユーザ名")
	String name;
}
