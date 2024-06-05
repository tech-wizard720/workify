package com.workify.jobms.job.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.workify.jobms.job.external.Company;
import com.workify.jobms.job.external.Review;

import java.util.List;

@FeignClient(name = "REVIEW-SERVICE", url="${review-service-url}")
public interface ReviewClient {
    @GetMapping("/reviews")
    List<Review> getReviews(@RequestParam("companyId") Long companyId);
}
