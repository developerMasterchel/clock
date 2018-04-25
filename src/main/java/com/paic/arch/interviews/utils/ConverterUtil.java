package com.paic.arch.interviews.utils;

import com.paic.arch.interviews.model.ClockModel;
import com.paic.arch.interviews.model.TimeModel;

/** 时间模型  转换为 时钟模型
 * @author chen
 *
 */
public class ConverterUtil {
	
	private final static String y = "Y";
	private final static String o = "O";
	private final static String r = "R";
	
	/** 时间模型  转换为 时钟模型
	 * @param model
	 * @return
	 */
	public static String getResult(TimeModel model){
		int hour = Integer.parseInt(model.getHour());
		int minute = Integer.parseInt(model.getMinute());
		int sexond = Integer.parseInt(model.getSecond());
		//时间模型转换为时钟模型
		ClockModel clock = new ClockModel();
		if (sexond%2==0) {
			clock.setTop(y);
		}
		else {
			clock.setTop(o);
		}
		clock.setFiveHour(jointHour(hour/5, 4));
		clock.setOneHour(jointHour(hour%5, 4));
		clock.setFiveMinute(joint(minute/5, 11, true));
		clock.setOneMinute(joint(minute%5, 4, false));
		//tostring 输出 时钟模型的结果
		return clock.toString();
		
	}
	
	/** 对 分钟  拼接 字符串
	 * @param length
	 * @param total
	 * @param isRed
	 * @return
	 */
	private static String joint(int length, int total, boolean isMinRed){
		StringBuilder sb = new StringBuilder();
		//如果有红色
		if (isMinRed) {
			for (int i = 1; i <= length; i++) {
				if (i%3==0) {
					sb.append(r);
				}else {
					
					sb.append(y);
				}
			}
		}
		else{
			for (int i = 0; i < length; i++) {
				sb.append(y);
			}
		}
		for (int i = 0; i < total - length; i++) {
			sb.append(o);
		}
		
		return sb.toString();
	}
	
	/** 小时 字符串拼接
	 * @param length
	 * @param total
	 * @return
	 */
	private static String jointHour(int length, int total){
		StringBuilder sb = new StringBuilder();
		// 
		for (int i = 0; i < length; i++) {
			sb.append(r);
		}
		for (int i = 0; i < total - length; i++) {
			sb.append(o);
		}
		return sb.toString();
	}
	

}
