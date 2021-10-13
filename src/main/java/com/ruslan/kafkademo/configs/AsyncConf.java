//package com.ruslan.kafkademo.configs;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.scheduling.annotation.EnableAsync;
//import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
//
//import java.util.concurrent.Executor;
//
//@EnableAsync(proxyTargetClass = true)
//@Configuration
//public class AsyncConf {
//
//    @Value("${config.async.core_pool_size}")
//    private int corePoolSize;
//    @Value("${config.async.max_pool_size}")
//    private int MaxPoolSize;
//    @Value("${config.async.queue_capacity}")
//    private int queueCapacity;
//    @Value("${config.async.thread_name_prefix}")
//    private String threadNamePrefix;
//
//    @Bean
//    public Executor taskExecutor() {
//        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
//        executor.setCorePoolSize(corePoolSize);
//        executor.setMaxPoolSize(MaxPoolSize);
//        executor.setQueueCapacity(queueCapacity);
//        executor.setThreadNamePrefix(threadNamePrefix);
//        executor.initialize();
//        return executor;
//    }
//
//}
