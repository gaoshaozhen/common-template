package com.gs.web.reader;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;

import javax.sql.DataSource;

import org.springframework.batch.item.database.JdbcPagingItemReader;
import org.springframework.batch.item.database.Order;
import org.springframework.batch.item.database.support.PostgresPagingQueryProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.RowMapper;

@Configuration
public class TestPageReader{
	
	@Autowired
	private DataSource dataSource;
	
	@Bean
	public JdbcPagingItemReader<String> testPageReader1() throws Exception {
		PostgresPagingQueryProvider sqlProvider = new PostgresPagingQueryProvider();
		sqlProvider.setSelectClause("select id, name");
		sqlProvider.setFromClause("from gs_test");
		sqlProvider.setSortKeys(Collections.singletonMap("id", Order.ASCENDING));
		
		JdbcPagingItemReader<String> reader = new JdbcPagingItemReader<>();
		reader.setPageSize(5);
		reader.setSaveState(false);
		reader.setDataSource(dataSource);
		reader.setQueryProvider(sqlProvider);
		reader.setRowMapper(new RowMapper<String>() {
			@Override
			public String mapRow(ResultSet rs, int rowNum) throws SQLException {
				return rs.getString("name");
			}
		});
		reader.afterPropertiesSet();
		return reader;
	}
}
