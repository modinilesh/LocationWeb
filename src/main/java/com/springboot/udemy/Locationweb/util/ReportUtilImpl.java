package com.springboot.udemy.Locationweb.util;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.springframework.stereotype.Component;

@Component
public class ReportUtilImpl implements ReportUtil {

	@Override
	public void generatePiChart(String path, List<Object[]> data) {
		
		//defining dataset
		DefaultPieDataset dataset = new DefaultPieDataset();
		
		//Setting values in dataset
		for(Object[] obj : data) {
			dataset.setValue(obj[0].toString(), new Double(obj[1].toString()));
		}
		
		//creating PI Chart
		JFreeChart chart = ChartFactory.createPieChart("Location Type Chart", dataset);

		//converting JFreeChart to PNG format
		try {
			ChartUtils.saveChartAsJPEG(new File(path + "/piChart.jpeg"), chart, 500, 500);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
