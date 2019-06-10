package com.gs.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import com.gs.common.utils.PoiUtils;

public class PoiTest {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		List<List<String>> list = PoiUtils.readFirstSheet(new FileInputStream("e:/郑州网点表20190403.xlsx"), 0, 3);
		Set<String> company = new LinkedHashSet<>();
		list.remove(0);
		for(List<String> row : list) {
			company.add(row.get(0));
		}
		int i =0;
		for(String name : company) {
			i++;
			String sql = String.format("insert into healthy_branch_company(`id`, `name`, `create_date`) values(%d, '%s', now());", i, name);
//			System.out.println(sql);
		};
		
		List<String> comList = new ArrayList<>();
		comList.addAll(company);
		int sort = 0;
		for(List<String> row : list) {
			String comName = row.get(0);
			int k=-1;
			for(int j =0; j < comList.size(); j++) {
				if(comName.equals(comList.get(j))) {
					k = j+1;
				}
			}
			String sql = String.format("insert into healthy_branch_info(`company_id`, `sort_number`, `name`, `address`, `phone`, `istatus`, `created_dt`) values(%d, '%d', '%s', '%s', '%s', %d, now());"
					, k, ++sort, row.get(1), row.get(2), row.get(3), 1);
			System.out.println(sql);
			
		}

	}

}
