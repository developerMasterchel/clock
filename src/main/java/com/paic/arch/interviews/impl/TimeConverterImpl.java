package com.paic.arch.interviews.impl;


import com.paic.arch.interviews.TimeConverter;
import com.paic.arch.interviews.model.TimeModel;
import com.paic.arch.interviews.utils.ConverterUtil;
import com.paic.arch.interviews.utils.TimeUtil;

/**
 * UTF-8
 * @author chen
 * 
 */
/** 时间转换  时钟 的 实现类
 * @author chen
 *
 */
public class TimeConverterImpl implements TimeConverter{

	public String convertTime(String aTime) {
		//获得时间模型
		TimeModel model = TimeUtil.getStringDate(aTime);
		//转换 
		String result = ConverterUtil.getResult(model);
		return result;
	}
	


}
