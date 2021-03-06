package com.example.demo;

import java.util.LinkedList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class AllResources extends WebMvcConfigurerAdapter {

    @Override
    public void configurePathMatch(PathMatchConfigurer matcher) {
        matcher.setUseRegisteredSuffixPatternMatch(true);
    }
    @Bean
    public ByteArrayHttpMessageConverter byteArrayHttpMessageConverter(){
        ByteArrayHttpMessageConverter bam = new ByteArrayHttpMessageConverter();
        List<org.springframework.http.MediaType> mediaTypes = new LinkedList<MediaType>();
        mediaTypes.add(org.springframework.http.MediaType.APPLICATION_JSON);
        mediaTypes.add(org.springframework.http.MediaType.IMAGE_JPEG);
        mediaTypes.add(org.springframework.http.MediaType.IMAGE_PNG);
        mediaTypes.add(org.springframework.http.MediaType.IMAGE_GIF);
        mediaTypes.add(org.springframework.http.MediaType.TEXT_PLAIN);
        bam.setSupportedMediaTypes(mediaTypes);
        return bam;
    }

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        MappingJackson2HttpMessageConverter mapper = new MappingJackson2HttpMessageConverter();
        converters.add(mapper);
        converters.add(byteArrayHttpMessageConverter());
        super.configureMessageConverters(converters);
    }
}