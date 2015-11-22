package com.mkyong;

import org.springframework.batch.item.ItemProcessor;

import com.mkyong.model.Report;
import com.mkyong.model.ReportOut;

public class CustomItemProcessor implements ItemProcessor<Report, ReportOut> {

	@Override
	public ReportOut process(Report item) throws Exception {
		
		System.out.println("Processing..." + item);
		ReportOut result= new ReportOut();
		result.setId(item.getId());
		result.setDate(item.getDate());
		result.setQty(item.getQty());
		result.setSales(item.getSales());
		result.setStaffName(item.getStaffName());
		return result;
	}

}