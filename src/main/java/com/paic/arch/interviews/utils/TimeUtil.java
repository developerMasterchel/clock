package com.paic.arch.interviews.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.paic.arch.interviews.model.TimeModel;

/** 转换时间字符串的 公有类
 * @author chen
 * 
 */
public class TimeUtil {
	
	/**
	 * 验证时间正则，多一个24点的。（测试用例有个24点）
	 * 相对来说，我觉得验证入参，用正则比较好
	 */
	private final static String regex = "^(([0-1]{1}[0-9]{1}\\:[0-5]{1}[0-9]{1}\\:[0-5]{1}[0-9]{1})||([2]{1}[0-3]{1}\\:[0-5]{1}[0-9]{1}\\:[0-5]{1}[0-9]{1})||(24\\:00\\:00))$";
	
	private static Pattern pattern = Pattern.compile(regex);
	
	/** 时间字符串 转换 时间模型 TimeModel
	 * @param time
	 * @return
	 */
	public static TimeModel getStringDate(String time) {
		TimeModel result = null;
		if(validTime(time)){
			String[] array = time.split("\\:");
			result = new TimeModel();
			result.setHour(array[0]);
			result.setMinute(array[1]);
			result.setSecond(array[2]);
		}
		return result;
	}
	
	/** 验证 字符串是否是 时间 00:00:00 格式的
	 * @param time
	 * @return
	 */
	public static boolean validTime(String time) {
		Matcher matcher = pattern.matcher(time);
		return matcher.find();
	}
	
}
