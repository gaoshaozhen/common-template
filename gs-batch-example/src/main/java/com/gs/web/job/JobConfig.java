package com.gs.web.job;

import javax.annotation.Resource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.tasklet.TaskletStep;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gs.web.processor.TestProcessor;
import com.gs.web.writer.TestWriter;

@Configuration
public class JobConfig {
	@Autowired
	public JobBuilderFactory jobBuilderFactory;

	@Autowired
	public StepBuilderFactory stepBuilderFactory;

	@Autowired
	public JobRepository jobRepository;
	
	@Resource(name="testPageReader1")
	private ItemReader<String> testReader;
	
	@Autowired
	private TestProcessor p;

	@Autowired
	private TestWriter w;
	
	@Bean
	public Job wxCubeScheduleJob() {
		return jobBuilderFactory.get("wxCubeScheduleJob").incrementer(new RunIdIncrementer()).repository(jobRepository)
				.flow(wxCubeStep()).end().build();
	}
	@Bean
	public Step wxCubeStep() {

		TaskletStep wxCubeStep = stepBuilderFactory.get("testStep").<String, String>chunk(1)
				.reader(testReader).processor(p).writer(w).build();
		return wxCubeStep;
	}
}
