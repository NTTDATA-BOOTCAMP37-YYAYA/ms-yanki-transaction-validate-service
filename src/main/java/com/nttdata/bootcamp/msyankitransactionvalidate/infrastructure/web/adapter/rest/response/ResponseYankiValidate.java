package com.nttdata.bootcamp.msyankitransactionvalidate.infrastructure.web.adapter.rest.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**.*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseYankiValidate {
  
	  private int httpStatus;
	  private Boolean validate;
	  private String message;

}