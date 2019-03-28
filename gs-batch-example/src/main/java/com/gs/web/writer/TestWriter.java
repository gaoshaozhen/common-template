package com.gs.web.writer;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class TestWriter implements ItemWriter<String>{
	@Override
	public void write(List<? extends String> items) throws Exception {
		for(String item : items) {
			log.debug(item);
		}
	}

}
